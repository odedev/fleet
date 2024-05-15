package dev.osmanthus.fleet.tool.develop.transform;

import dev.osmanthus.fleet.common.transform.Transform;
import dev.osmanthus.fleet.tool.develop.entity.Enumeration;
import dev.osmanthus.fleet.tool.develop.entity.EnumerationValue;
import dev.osmanthus.fleet.tool.develop.model.EnumerationModel;
import dev.osmanthus.fleet.tool.develop.model.EnumerationValueModel;
import dev.osmanthus.fleet.tool.develop.repository.EnumerationRepository;
import org.springframework.stereotype.Component;

@Component
public class EnumerationValueTransform implements Transform<EnumerationValue, EnumerationValueModel> {
    private final EnumerationRepository enumerationRepository;

    public EnumerationValueTransform(EnumerationRepository enumerationRepository) {
        this.enumerationRepository = enumerationRepository;
    }

    @Override
    public EnumerationValueModel toModel(EnumerationValue enumerationValue) {
        EnumerationValueModel enumerationValueModel = new EnumerationValueModel(enumerationValue);

        Enumeration enumeration = this.enumerationRepository.findOneById(enumerationValue.getEnumeration());
        if (enumeration != null) {
            enumerationValueModel.setEnumeration(new EnumerationModel(enumeration));
        }

        return enumerationValueModel;
    }

    @Override
    public EnumerationValue toEntity(EnumerationValueModel enumerationValueModel) {
        return enumerationValueModel.toEntity();
    }
}
