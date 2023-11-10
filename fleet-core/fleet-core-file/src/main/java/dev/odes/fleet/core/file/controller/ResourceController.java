package dev.odes.fleet.core.file.controller;

import dev.odes.fleet.common.response.ResponseData;
import dev.odes.fleet.core.file.dto.ResourceUploadDto;
import dev.odes.fleet.core.file.model.ResourceFileModel;
import dev.odes.fleet.core.file.service.ResourceService;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/file/resource")
public class ResourceController {
    private final ResourceService resourceService;
    public ResourceController(ResourceService resourceService) {
        this.resourceService = resourceService;
    }

    @PostMapping(path = "/upload")
    public ResponseData upload(@ModelAttribute ResourceUploadDto resourceUploadDto) {
        ResourceFileModel staticFileModel = this.resourceService.upload(resourceUploadDto);
        return new ResponseData(staticFileModel);
    }

    @PostMapping(path = "/download")
    public ResponseData download(HttpServletResponse httpServletResponse) {
        this.resourceService.download(httpServletResponse);
        return new ResponseData("download");
    }
}
