package dev.odes.fleet.develop.controller;

import dev.odes.fleet.common.response.ResponseData;
import dev.odes.fleet.develop.service.GeneratorService;
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

    @GetMapping(path = "/{moduleId}")
    public ResponseData generate(@PathVariable String moduleId) {
        this.generatorService.generate(moduleId);
        return new ResponseData(moduleId);
    }
}
