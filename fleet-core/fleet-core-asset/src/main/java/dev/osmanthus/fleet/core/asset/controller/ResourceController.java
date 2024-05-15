package dev.osmanthus.fleet.core.asset.controller;

import dev.osmanthus.fleet.common.response.ResponseData;
import dev.osmanthus.fleet.core.asset.dto.ResourceUploadDto;
import dev.osmanthus.fleet.core.asset.model.ResourceFileModel;
import dev.osmanthus.fleet.core.asset.service.ResourceService;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("dev.osmanthus.fleet.core.asset.controller.ResourceController")
@RequestMapping(path = "/asset/resource")
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
    public void download(HttpServletResponse httpServletResponse) {
        this.resourceService.download(httpServletResponse);
    }
}
