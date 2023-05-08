package dev.odes.fleet.develop.controller;

import dev.odes.fleet.common.response.ResponseData;
import dev.odes.fleet.develop.service.GeneratorService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/develop/generator")
public class GeneratorController {
    private final GeneratorService generatorService;

    public GeneratorController(GeneratorService generatorService) {
        this.generatorService = generatorService;
    }

    @GetMapping(path = "")
    public ResponseData generate() {
        this.generatorService.generate();
        return new ResponseData("成功");
    }
}
