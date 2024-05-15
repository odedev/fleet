package dev.osmanthus.fleet.core.asset.service;

import dev.osmanthus.fleet.common.utils.IdUtils;
import dev.osmanthus.fleet.core.asset.dto.ResourceDto;
import dev.osmanthus.fleet.core.asset.dto.ResourceUploadDto;
import dev.osmanthus.fleet.core.asset.model.ResourceFileModel;
import dev.osmanthus.fleet.core.asset.repository.ResourceRepository;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.stereotype.Service;

import java.io.*;

@Service("dev.osmanthus.fleet.core.asset.service.ResourceService")
public class ResourceService {
    private final ResourceRepository resourceRepository;
    private final ResourceFileService resourceFileService;
    public ResourceService(ResourceRepository resourceRepository, ResourceFileService resourceFileService) {
        this.resourceRepository = resourceRepository;
        this.resourceFileService = resourceFileService;
    }

    public ResourceFileModel upload(ResourceUploadDto resourceUploadDto) {
        ResourceDto resourceDto = this.resourceRepository.upload(resourceUploadDto);
        if (resourceDto == null) {
            throw new RuntimeException("上传失败");
        }
        String category = resourceUploadDto.getCategory();
        ResourceFileModel resourceFileModel = new ResourceFileModel();
        resourceFileModel.setId(IdUtils.getId());
        resourceFileModel.setName(resourceDto.getName());
        resourceFileModel.setType(resourceDto.getType());
        resourceFileModel.setSize(resourceDto.getSize());
        resourceFileModel.setPath(resourceDto.getPath());
        resourceFileModel.setUrl(resourceDto.getUrl());
        resourceFileModel.setLocation(resourceDto.getLocation());
        resourceFileModel.setDirectory(resourceDto.getDirectory());
        resourceFileModel.setCategory(category);
        resourceFileModel.setScope(resourceUploadDto.getScope());
        ResourceFileModel fileModel = this.resourceFileService.insertOne(resourceFileModel);
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
