package dev.osmanthus.fleet.tool.develop.controller;

import dev.osmanthus.fleet.common.controller.AbstractController;
import dev.osmanthus.fleet.tool.develop.entity.Enumeration;
import dev.osmanthus.fleet.tool.develop.model.EnumerationModel;
import dev.osmanthus.fleet.tool.develop.repository.EnumerationRepository;
import dev.osmanthus.fleet.tool.develop.service.EnumerationService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/develop/enumeration")
public class EnumerationController extends AbstractController<Enumeration, EnumerationModel, EnumerationRepository, EnumerationService> {
    private final EnumerationService enumerationService;
    public EnumerationController(EnumerationService enumerationService) {
        super(enumerationService);
        this.enumerationService = enumerationService;
    }
}
