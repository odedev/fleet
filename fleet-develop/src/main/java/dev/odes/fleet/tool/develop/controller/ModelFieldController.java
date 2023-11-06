package dev.odes.fleet.tool.develop.controller;

import dev.odes.fleet.common.controller.AbstractController;
import dev.odes.fleet.tool.develop.entity.ModelField;
import dev.odes.fleet.tool.develop.model.ModelFieldModel;
import dev.odes.fleet.tool.develop.repository.ModelFieldRepository;
import dev.odes.fleet.tool.develop.service.ModelFieldService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/develop/model_field")
public class ModelFieldController extends AbstractController<ModelField, ModelFieldModel, ModelFieldRepository, ModelFieldService> {
    private final ModelFieldService modelFieldService;
    public ModelFieldController(ModelFieldService service) {
        super(service);
        this.modelFieldService = service;
    }
}
