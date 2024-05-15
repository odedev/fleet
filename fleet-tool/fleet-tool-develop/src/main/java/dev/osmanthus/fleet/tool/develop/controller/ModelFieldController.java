package dev.osmanthus.fleet.tool.develop.controller;

import dev.osmanthus.fleet.common.controller.AbstractController;
import dev.osmanthus.fleet.tool.develop.entity.ModelField;
import dev.osmanthus.fleet.tool.develop.model.ModelFieldModel;
import dev.osmanthus.fleet.tool.develop.repository.ModelFieldRepository;
import dev.osmanthus.fleet.tool.develop.service.ModelFieldService;
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
