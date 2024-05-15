package dev.osmanthus.fleet.tool.develop.controller;

import dev.osmanthus.fleet.common.response.ResponseData;
import dev.osmanthus.fleet.tool.develop.service.GeneratorService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/develop/generator")
public class GeneratorController {
    private final GeneratorService generatorService;

    public GeneratorController(GeneratorService generatorService) {
        this.generatorService = generatorService;
    }

    @GetMapping(path = "/module/{moduleId}")
    public ResponseData generate(@PathVariable String moduleId) {
        Object data = this.generatorService.generate(moduleId);
        return new ResponseData(data);
    }
}
