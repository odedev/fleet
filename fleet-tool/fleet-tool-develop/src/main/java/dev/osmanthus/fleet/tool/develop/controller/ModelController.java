package dev.osmanthus.fleet.tool.develop.controller;

import dev.osmanthus.fleet.common.controller.AbstractController;
import dev.osmanthus.fleet.tool.develop.entity.Model;
import dev.osmanthus.fleet.tool.develop.model.ModelModel;
import dev.osmanthus.fleet.tool.develop.repository.ModelRepository;
import dev.osmanthus.fleet.tool.develop.service.ModelService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/develop/model")
public class ModelController extends AbstractController<Model, ModelModel, ModelRepository, ModelService> {
    private final ModelService modelService;
    public ModelController(ModelService service) {
        super(service);
        this.modelService = service;
    }
}
