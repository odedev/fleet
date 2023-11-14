package dev.odes.fleet.core.asset.service;

import dev.odes.fleet.common.utils.IdUtils;
import dev.odes.fleet.core.asset.dto.ResourceDto;
import dev.odes.fleet.core.asset.dto.ResourceUploadDto;
import dev.odes.fleet.core.asset.model.ResourceFileModel;
import dev.odes.fleet.core.asset.repository.ResourceRepository;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.stereotype.Service;

import java.io.*;

@Service
public class ResourceService {
    private final ResourceRepository resourceRepository;
    private final ResourceFileService staticFileService;
    public ResourceService(ResourceRepository resourceRepository, ResourceFileService staticFileService) {
        this.resourceRepository = resourceRepository;
        this.staticFileService = staticFileService;
    }

    public ResourceFileModel upload(ResourceUploadDto resourceUploadDto) {
        ResourceDto resourceDto = this.resourceRepository.upload(resourceUploadDto);
        if (resourceDto == null) {
            throw new RuntimeException("上传失败");
        }
        String category = resourceUploadDto.getCategory();
        ResourceFileModel staticFileModel = new ResourceFileModel();
        staticFileModel.setId(IdUtils.getId());
        staticFileModel.setName(resourceDto.getName());
        staticFileModel.setType(resourceDto.getType());
        staticFileModel.setSize(resourceDto.getSize());
        staticFileModel.setPath(resourceDto.getPath());
        staticFileModel.setUrl(resourceDto.getUrl());
        staticFileModel.setLocation(resourceDto.getLocation());
        staticFileModel.setDirectory(resourceDto.getDirectory());
        staticFileModel.setCategory(category);
        ResourceFileModel fileModel = this.staticFileService.insertOne(staticFileModel);
        return fileModel;
    }

    public void download(HttpServletResponse httpServletResponse) {
        File file = new File("./demo.xlsx");
        InputStream inputStream = null;
        OutputStream outputStream = null;

        httpServletResponse.setContentType("application/octet-stream");

        httpServletResponse.setContentType("application/vnd.openxmlformats-officedocument.spreadsheetml.sheet;charset=utf-8");
        httpServletResponse.setHeader("Content-Disposition", "attachment;fileName=\"demo.xlsx\";filename*=utf-8''\"demo.xlsx\";");

        try {
            inputStream = new FileInputStream(file);
            outputStream = httpServletResponse.getOutputStream();

            int len = 0;
            byte[] bytes = new byte[1024];
            while ((len = inputStream.read(bytes)) != -1) {
                outputStream.write(bytes, 0, bytes.length);
                outputStream.flush();
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                inputStream.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
            try {
                outputStream.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }

    }
}
