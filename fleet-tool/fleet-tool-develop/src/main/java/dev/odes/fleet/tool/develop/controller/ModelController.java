package dev.odes.fleet.tool.develop.controller;

import dev.odes.fleet.common.controller.AbstractController;
import dev.odes.fleet.tool.develop.entity.Model;
import dev.odes.fleet.tool.develop.model.ModelModel;
import dev.odes.fleet.tool.develop.repository.ModelRepository;
import dev.odes.fleet.tool.develop.service.ModelService;
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
