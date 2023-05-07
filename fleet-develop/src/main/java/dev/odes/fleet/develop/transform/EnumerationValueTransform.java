package dev.odes.fleet.develop.transform;

import dev.odes.fleet.common.transform.Transform;
import dev.odes.fleet.develop.entity.Enumeration;
import dev.odes.fleet.develop.entity.EnumerationValue;
import dev.odes.fleet.develop.model.EnumerationModel;
import dev.odes.fleet.develop.model.EnumerationValueModel;
import dev.odes.fleet.develop.repository.EnumerationRepository;
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
