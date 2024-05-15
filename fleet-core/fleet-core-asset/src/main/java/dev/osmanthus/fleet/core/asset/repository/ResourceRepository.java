package dev.osmanthus.fleet.core.asset.repository;

import com.google.common.io.Files;
import dev.osmanthus.fleet.common.constant.PresetConstant;
import dev.osmanthus.fleet.common.utils.StringUtils;
import dev.osmanthus.fleet.component.minio.MinioRepository;
import dev.osmanthus.fleet.core.asset.dto.ResourceDto;
import dev.osmanthus.fleet.core.asset.dto.ResourceUploadDto;
import dev.osmanthus.fleet.core.asset.enumeration.LocationEnum;
import org.springframework.stereotype.Repository;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;

@Repository("dev.osmanthus.fleet.core.asset.repository.ResourceRepository")
public class ResourceRepository {
    private final MinioRepository minioRepository;

    public ResourceRepository(MinioRepository minioRepository) {
        this.minioRepository = minioRepository;
    }

    public ResourceDto upload(ResourceUploadDto resourceUploadDto) {
        MultipartFile multipartFile = resourceUploadDto.getFile();
        String name = resourceUploadDto.getName();
        String directory = resourceUploadDto.getDirectory();
        if (this.minioRepository.isAvailable()) {
            return this.writeToMinio(multipartFile);
        } else {
            return this.writeToHost(multipartFile, directory, name);
        }
    }

    public ResourceDto writeToHost(MultipartFile multipartFile, String directory, String name) {
        if (multipartFile == null || multipartFile.isEmpty()) {
            throw new RuntimeException("文件不能为空");
        }

        String filename = multipartFile.getOriginalFilename();
        if (filename == null) {
            throw new RuntimeException("获取原文件名失败");
        }
        if (!StringUtils.isNullOrEmpty(name)) {
            String fileExtension = "." + Files.getFileExtension(filename);
            if (name.endsWith(fileExtension)) {
                filename = name;
            } else {
                filename = name + fileExtension;
            }
        }

        String publicPath = new File(PresetConstant.PUBLIC_PATH).getAbsolutePath();
        String path = publicPath + File.separator + filename;
        String url = "/" + PresetConstant.PUBLIC_PATH + "/" + filename;
        if (!StringUtils.isNullOrEmpty(directory)) {
            directory = directory.replace("\\", File.separator);
            directory = directory.replace("/", File.separator);
            path = publicPath;
            url = "/" + PresetConstant.PUBLIC_PATH;
            if (directory.startsWith(File.separator)) {
                path = path + directory;
                url = url + directory;
            } else {
                path = path + File.separator + directory;
                url = url + "/" + directory;
            }
            if (directory.endsWith(File.separator)) {
                path = path + filename;
                url = url + filename;
            } else {
                path = path + File.separator + filename;
                url = url + "/" + filename;
            }
            url = url.replace("\\", "/");
        }
        File file = new File(path);
        if (file.exists()) {
            throw new RuntimeException("文件[" + path + "]已存在");
        }
        if (!file.getParentFile().exists()) {
            try {
                Files.createParentDirs(file);
            } catch (IOException e) {
                throw new RuntimeException("创建文件夹[" + directory + "]失败");
            }
        }

        try {
            multipartFile.transferTo(file);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        ResourceDto resourceDto = new ResourceDto();
        resourceDto.setName(filename);
        resourceDto.setSize(multipartFile.getSize());
        resourceDto.setType(multipartFile.getContentType());
        resourceDto.setUrl(url);
        resourceDto.setPath(path);
        resourceDto.setDirectory(directory);
        resourceDto.setLocation(LocationEnum.HOST);
        return resourceDto;
    }

    public ResourceDto writeToMinio(MultipartFile multipartFile) {
        try {
            InputStream inputStream = multipartFile.getInputStream();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        this.minioRepository.uploadObject();

        ResourceDto resourceDto = new ResourceDto();
        resourceDto.setSize(multipartFile.getSize());
        resourceDto.setType(multipartFile.getContentType());
        resourceDto.setLocation(LocationEnum.HOST);
        return resourceDto;
    }


}
