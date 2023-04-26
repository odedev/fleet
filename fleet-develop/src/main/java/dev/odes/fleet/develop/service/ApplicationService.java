package dev.odes.fleet.develop.service;

import dev.odes.fleet.common.parameter.Parameter;
import dev.odes.fleet.develop.model.ApplicationModel;
import dev.odes.fleet.develop.repository.ApplicationRepository;

public class ApplicationService {
    private final ApplicationRepository applicationRepository;
    public ApplicationService(ApplicationRepository applicationRepository) {
        this.applicationRepository = applicationRepository;
    }

    public ApplicationModel findOne(Parameter parameter) {
        this.applicationRepository.findOne();
        return null;
    }
}
