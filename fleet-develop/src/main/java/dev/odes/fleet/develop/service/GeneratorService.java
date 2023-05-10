package dev.odes.fleet.develop.service;

import dev.odes.fleet.develop.generator.CodeGenerator;
import dev.odes.fleet.develop.model.ModelModel;
import dev.odes.fleet.develop.model.ModuleModel;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class GeneratorService {

    public void generate() {
        ModuleModel moduleModel = new ModuleModel();
        moduleModel.setCode("system");
        moduleModel.setName("系统管理");

        List<ModelModel> modelModels = new ArrayList<>();
        ModelModel modelModel1 = new ModelModel();
        modelModel1.setCode("Menu");
        modelModels.add(modelModel1);
        ModelModel modelModel2 = new ModelModel();
        modelModel2.setCode("User");
        modelModels.add(modelModel2);

        ModelModel modelModel3 = new ModelModel();
        modelModel3.setCode("UserRole");
        modelModels.add(modelModel3);

        CodeGenerator.generate(moduleModel, modelModels);


        ModuleModel moduleModel1 = new ModuleModel();
        moduleModel1.setCode("org");
        moduleModel1.setName("组织架构");

        List<ModelModel> modelModels1 = new ArrayList<>();
        ModelModel modelModel11 = new ModelModel();
        modelModel11.setCode("Org");
        modelModels1.add(modelModel11);
        ModelModel modelModel12 = new ModelModel();
        modelModel12.setCode("Department");
        modelModels1.add(modelModel12);

        CodeGenerator.generate(moduleModel1, modelModels1);
    }
}
