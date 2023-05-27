package dev.odes.fleet.core.file.repository;

import dev.odes.fleet.common.utils.StringUtils;
import dev.odes.fleet.core.file.config.MinioClientConfig;
import dev.odes.fleet.core.file.constant.FileConstant;
import dev.odes.fleet.core.file.dto.ResourceDto;
import dev.odes.fleet.core.file.dto.ResourceUploadDto;
import dev.odes.fleet.core.file.enumeration.LocationEnum;
import io.minio.MakeBucketArgs;
import io.minio.MinioClient;
import io.minio.ObjectWriteResponse;
import io.minio.UploadObjectArgs;
import io.minio.errors.*;
import org.springframework.stereotype.Repository;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;

@Repository
public class ResourceRepository {
    private MinioClient minioClient;
    private MinioClientConfig minioClientConfig;

    public ResourceRepository(MinioClientConfig minioClientConfig) {
        this.minioClientConfig = minioClientConfig;
        System.out.println("getEndpoint" + this.minioClientConfig.getEndpoint());
        if (!StringUtils.isNullOrEmpty(this.minioClientConfig.getEndpoint())) {
            try {
                this.minioClient = MinioClient
                    .builder()
                    .endpoint(this.minioClientConfig.getEndpoint())
                    .credentials(this.minioClientConfig.getAccessKey(), this.minioClientConfig.getSecretKey())
                    .build();
            } catch (Exception e) {
                e.printStackTrace();
                this.minioClient = null;
            }
        }
    }

    public void makeBucket() {
        try {
            this.minioClient.makeBucket(MakeBucketArgs.builder().bucket("asiatrip").build());
        } catch (ErrorResponseException e) {
            throw new RuntimeException(e);
        } catch (InsufficientDataException e) {
            throw new RuntimeException(e);
        } catch (InternalException e) {
            throw new RuntimeException(e);
        } catch (InvalidKeyException e) {
            throw new RuntimeException(e);
        } catch (InvalidResponseException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (NoSuchAlgorithmException e) {
            throw new RuntimeException(e);
        } catch (ServerException e) {
            throw new RuntimeException(e);
        } catch (XmlParserException e) {
            throw new RuntimeException(e);
        }
    }

    public ResourceDto upload(ResourceUploadDto resourceUploadDto) {
        MultipartFile multipartFile = resourceUploadDto.getFile();
        String name = resourceUploadDto.getName();
        String folder = resourceUploadDto.getFolder();
        if (this.minioClient != null) {
            return this.writeToMinio(multipartFile);
        } else {
            return this.writeToHost(multipartFile, folder, name);
        }
    }

    public ResourceDto writeToHost(MultipartFile multipartFile, String folder, String name) {
        if (multipartFile == null || multipartFile.isEmpty()) {
            throw new RuntimeException("文件不能为空");
        }

        String filename = multipartFile.getOriginalFilename();
        if (filename == null) {
            throw new RuntimeException("获取原文件名失败");
        }
        if (!StringUtils.isNullOrEmpty(name)) {
            filename = name;
        }

        String publicPath = new File(FileConstant.PUBLIC_PATH).getAbsolutePath();
        String path = publicPath + File.separator + filename;
        String url = "/" + FileConstant.PUBLIC_PATH + "/" + filename;
        if (!StringUtils.isNullOrEmpty(folder)) {
            path = publicPath + File.separator + folder + File.separator + filename;
            url = "/" + FileConstant.PUBLIC_PATH + "/" + folder + "/" + filename;
        }
        File file = new File(path);
        if (file.exists()) {
            throw new RuntimeException("文件[" + url + "]已存在");
        }
        if (!file.getParentFile().exists()) {
            boolean isMkdir = file.getParentFile().mkdir();
            if (!isMkdir) {
                throw new RuntimeException("创建文件夹[" + folder + "]失败");
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
        resourceDto.setLocation(LocationEnum.HOST);
        return resourceDto;
    }

    public ResourceDto writeToMinio(MultipartFile multipartFile) {
        try {
            InputStream inputStream = multipartFile.getInputStream();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        // Upload '/home/user/Photos/asiaphotos.zip' as object name 'asiaphotos-2015.zip' to bucket
        // 'asiatrip'.
        try {
            ObjectWriteResponse objectWriteResponse = minioClient.uploadObject(
                UploadObjectArgs.builder()
                    .bucket("asiatrip")
                    .object("asiaphotos-2015.zip")
                    .filename("/home/user/Photos/asiaphotos.zip")
                    .build());
        } catch (ErrorResponseException | InsufficientDataException | InternalException | InvalidKeyException ex) {
            throw new RuntimeException(ex);
        } catch (InvalidResponseException ex) {
            throw new RuntimeException(ex);
        } catch (IOException ex) {
            throw new RuntimeException(ex);
        } catch (NoSuchAlgorithmException ex) {
            throw new RuntimeException(ex);
        } catch (ServerException ex) {
            throw new RuntimeException(ex);
        } catch (XmlParserException ex) {
            throw new RuntimeException(ex);
        }
        System.out.println(
            "'/home/user/Photos/asiaphotos.zip' is successfully uploaded as "
                + "object 'asiaphotos-2015.zip' to bucket 'asiatrip'.");

        return null;
    }
}
