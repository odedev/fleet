package dev.odes.fleet.develop.transform;

import dev.odes.fleet.common.transform.Transform;
import dev.odes.fleet.develop.entity.Enumeration;
import dev.odes.fleet.develop.entity.Model;
import dev.odes.fleet.develop.entity.ModelField;
import dev.odes.fleet.develop.model.EnumerationModel;
import dev.odes.fleet.develop.model.ModelFieldModel;
import dev.odes.fleet.develop.model.ModelModel;
import dev.odes.fleet.develop.repository.EnumerationRepository;
import dev.odes.fleet.develop.repository.ModelRepository;
import org.springframework.stereotype.Component;

@Component
public class ModelFieldTransform implements Transform<ModelField, ModelFieldModel> {
    private final ModelRepository modelRepository;
    private final EnumerationRepository enumerationRepository;
    public ModelFieldTransform(ModelRepository modelRepository, EnumerationRepository enumerationRepository) {
        this.modelRepository = modelRepository;
        this.enumerationRepository = enumerationRepository;
    }

    @Override
    public ModelFieldModel toModel(ModelField modelField) {
        ModelFieldModel modelFieldModel = new ModelFieldModel(modelField);

        Model model = this.modelRepository.findOneById(modelField.getModel());
        Model dataModel = this.modelRepository.findOneById(modelField.getDataModel());
        Enumeration dataEnum = this.enumerationRepository.findOneById(modelField.getDataEnum());

        if (model != null) {
            modelFieldModel.setModel(new ModelModel(model));
        }
        if (dataModel != null) {
            modelFieldModel.setDataModel(new ModelModel(dataModel));
        }
        if (dataEnum != null) {
            modelFieldModel.setDataEnum(new EnumerationModel(dataEnum));
        }

        return modelFieldModel;
    }

    @Override
    public ModelField toEntity(ModelFieldModel modelFieldModel) {
        return modelFieldModel.toEntity();
    }
}
