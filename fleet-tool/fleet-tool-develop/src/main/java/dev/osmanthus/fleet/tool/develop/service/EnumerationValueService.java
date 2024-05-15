package dev.osmanthus.fleet.tool.develop.service;

import dev.osmanthus.fleet.common.service.AbstractService;
import dev.osmanthus.fleet.tool.develop.entity.EnumerationValue;
import dev.osmanthus.fleet.tool.develop.model.EnumerationValueModel;
import dev.osmanthus.fleet.tool.develop.repository.EnumerationValueRepository;
import dev.osmanthus.fleet.tool.develop.transform.EnumerationValueTransform;
import org.springframework.stereotype.Service;

@Service
public class EnumerationValueService extends AbstractService<EnumerationValue, EnumerationValueModel, EnumerationValueRepository> {
    private final EnumerationValueTransform enumerationValueTransform;
    private final EnumerationValueRepository enumerationValueRepository;
    public EnumerationValueService(EnumerationValueTransform enumerationValueTransform, EnumerationValueRepository enumerationValueRepository) {
        super(enumerationValueRepository);
        this.enumerationValueTransform = enumerationValueTransform;
        this.enumerationValueRepository = enumerationValueRepository;
    }

    @Override
    public EnumerationValueModel transform(EnumerationValue enumerationValue) {
        return this.enumerationValueTransform.toModel(enumerationValue);
    }

    @Override
    public EnumerationValue transform(EnumerationValueModel enumerationValueModel) {
        return this.enumerationValueTransform.toEntity(enumerationValueModel);
    }

    @Override
    public void setDefaultValue(EnumerationValueModel enumerationValueModel) {
        super.setDefaultValue(enumerationValueModel);
    }

    @Override
    public void validate(EnumerationValueModel enumerationValueModel) {
        super.validate(enumerationValueModel);
    }

    @Override
    public void beforeInsert(EnumerationValueModel enumerationValueModel) {
        super.beforeInsert(enumerationValueModel);
    }

    @Override
    public void beforeUpdate(EnumerationValueModel enumerationValueModel) {
        super.beforeUpdate(enumerationValueModel);
    }

    @Override
    public void beforeDelete(EnumerationValueModel enumerationValueModel) {
        super.beforeDelete(enumerationValueModel);
    }
}
