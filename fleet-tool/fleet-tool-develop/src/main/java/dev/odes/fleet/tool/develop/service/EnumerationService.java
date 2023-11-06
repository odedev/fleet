package dev.odes.fleet.tool.develop.service;

import dev.odes.fleet.common.service.AbstractService;
import dev.odes.fleet.tool.develop.entity.Enumeration;
import dev.odes.fleet.tool.develop.model.EnumerationModel;
import dev.odes.fleet.tool.develop.model.ModuleModel;
import dev.odes.fleet.tool.develop.repository.EnumerationRepository;
import dev.odes.fleet.tool.develop.transform.EnumerationTransform;
import org.springframework.stereotype.Service;

@Service
public class EnumerationService extends AbstractService<Enumeration, EnumerationModel, EnumerationRepository> {
    private final EnumerationTransform enumerationTransform;
    private final EnumerationRepository enumerationRepository;
    public EnumerationService(EnumerationTransform enumerationTransform, EnumerationRepository enumerationRepository) {
        super(enumerationRepository);
        this.enumerationTransform = enumerationTransform;
        this.enumerationRepository = enumerationRepository;
    }

    @Override
    public EnumerationModel transform(Enumeration enumeration) {
        return this.enumerationTransform.toModel(enumeration);
    }

    @Override
    public Enumeration transform(EnumerationModel enumerationModel) {
        return this.enumerationTransform.toEntity(enumerationModel);
    }

    @Override
    public void setDefaultValue(EnumerationModel enumerationModel) {
        super.setDefaultValue(enumerationModel);
        String enumCode = enumerationModel.getCode();
        String moduleCode = "";
        ModuleModel module = enumerationModel.getModule();
        if (module != null) {
            moduleCode = module.getCode();
        }
        enumerationModel.setFullName("dev.odes.fleet.module." + moduleCode + ".enumeration." + enumCode + "Enum");
    }

    @Override
    public void validate(EnumerationModel enumerationModel) {
        super.validate(enumerationModel);
    }

    @Override
    public void beforeInsert(EnumerationModel enumerationModel) {
        super.beforeInsert(enumerationModel);
    }

    @Override
    public void beforeUpdate(EnumerationModel enumerationModel) {
        super.beforeUpdate(enumerationModel);
    }

    @Override
    public void beforeDelete(EnumerationModel enumerationModel) {
        super.beforeDelete(enumerationModel);
    }
}
