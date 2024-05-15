package dev.osmanthus.fleet.tool.develop.service;

import dev.osmanthus.fleet.tool.develop.generator.CodeGenerator;
import dev.osmanthus.fleet.tool.develop.model.ModelModel;
import dev.osmanthus.fleet.tool.develop.model.ModuleModel;
import org.springframework.stereotype.Service;

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
        if (module == null) {
            throw new RuntimeException("该模块不存在！");
        }
        List<ModelModel> models = this.modelService.findManyById("module", moduleId);

        CodeGenerator.generate(module, models);

        return models;
    }
}
