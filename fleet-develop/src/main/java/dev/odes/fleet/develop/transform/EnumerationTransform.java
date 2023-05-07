package dev.odes.fleet.develop.transform;

import dev.odes.fleet.common.transform.Transform;
import dev.odes.fleet.develop.entity.Enumeration;
import dev.odes.fleet.develop.entity.EnumerationValue;
import dev.odes.fleet.develop.model.EnumerationModel;
import dev.odes.fleet.develop.model.EnumerationValueModel;
import dev.odes.fleet.develop.repository.EnumerationValueRepository;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class EnumerationTransform implements Transform<Enumeration, EnumerationModel> {
    private final EnumerationValueRepository enumerationValueRepository;

    public EnumerationTransform(EnumerationValueRepository enumerationValueRepository) {
        this.enumerationValueRepository = enumerationValueRepository;
    }

    @Override
    public EnumerationModel toModel(Enumeration enumeration) {
        EnumerationModel enumerationModel = new EnumerationModel(enumeration);

        List<EnumerationValue> enumerationValueList = this.enumerationValueRepository.findManyById("enumeration", enumeration.getId());
        List<EnumerationValueModel> enumerationValues = new ArrayList<>();
        enumerationValueList.forEach(enumerationValue -> {
            enumerationValues.add(new EnumerationValueModel(enumerationValue));
        });
        enumerationModel.setEnumerationValues(enumerationValues);

        return enumerationModel;
    }

    @Override
    public Enumeration toEntity(EnumerationModel enumerationModel) {
        return enumerationModel.toEntity();
    }

}
