package dev.odes.fleet.develop.controller;

import dev.odes.fleet.common.controller.AbstractController;
import dev.odes.fleet.develop.entity.Enumeration;
import dev.odes.fleet.develop.model.EnumerationModel;
import dev.odes.fleet.develop.repository.EnumerationRepository;
import dev.odes.fleet.develop.service.EnumerationService;
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
