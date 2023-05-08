package dev.odes.fleet.develop.service;

import dev.odes.fleet.develop.generator.CodeGenerator;
import dev.odes.fleet.develop.generator.TemplateContext;
import org.springframework.stereotype.Service;

@Service
public class GeneratorService {

    public void generate() {
        TemplateContext templateContext = new TemplateContext();

        CodeGenerator.generate(templateContext);
    }
}
