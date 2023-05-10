package dev.odes.fleet.develop.service;

import dev.odes.fleet.develop.generator.CodeGenerator;
import dev.odes.fleet.develop.model.ModelFieldModel;
import dev.odes.fleet.develop.model.ModelModel;
import dev.odes.fleet.develop.model.ModuleModel;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class GeneratorService {
    private final ModuleService moduleService;
    private final ModelService modelService;

    public GeneratorService(ModuleService moduleService, ModelService modelService) {
        this.moduleService = moduleService;
        this.modelService = modelService;
    }

    public Object generate(String moduleId) {

        ModuleModel module = this.moduleService.findOneById(moduleId);
        List<ModelModel> models = this.modelService.findManyById("module", moduleId);

        CodeGenerator.generate(module, models);

        return models;
    }
}
