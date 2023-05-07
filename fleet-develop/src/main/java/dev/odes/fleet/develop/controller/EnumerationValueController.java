package dev.odes.fleet.develop.controller;

import dev.odes.fleet.common.controller.AbstractController;
import dev.odes.fleet.develop.entity.EnumerationValue;
import dev.odes.fleet.develop.model.EnumerationValueModel;
import dev.odes.fleet.develop.repository.EnumerationValueRepository;
import dev.odes.fleet.develop.service.EnumerationValueService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/develop/enumeration_value")
public class EnumerationValueController extends AbstractController<EnumerationValue, EnumerationValueModel, EnumerationValueRepository, EnumerationValueService> {
    private final EnumerationValueService enumerationValueService;
    public EnumerationValueController(EnumerationValueService enumerationValueService) {
        super(enumerationValueService);
        this.enumerationValueService = enumerationValueService;
    }
}
