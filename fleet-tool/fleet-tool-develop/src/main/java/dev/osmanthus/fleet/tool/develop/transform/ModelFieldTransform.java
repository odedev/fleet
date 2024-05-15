package dev.osmanthus.fleet.tool.develop.transform;

import dev.osmanthus.fleet.common.transform.Transform;
import dev.osmanthus.fleet.tool.develop.entity.Enumeration;
import dev.osmanthus.fleet.tool.develop.entity.Model;
import dev.osmanthus.fleet.tool.develop.entity.ModelField;
import dev.osmanthus.fleet.tool.develop.model.EnumerationModel;
import dev.osmanthus.fleet.tool.develop.model.ModelFieldModel;
import dev.osmanthus.fleet.tool.develop.model.ModelModel;
import dev.osmanthus.fleet.tool.develop.repository.EnumerationRepository;
import dev.osmanthus.fleet.tool.develop.repository.ModelRepository;
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
        if (model != null) {
            modelFieldModel.setModel(new ModelModel(model));
        }

        Model dataModel = this.modelRepository.findOneById(modelField.getModelType());
        if (dataModel != null) {
            modelFieldModel.setModelType(new ModelModel(dataModel));
        }

        Enumeration dataEnum = this.enumerationRepository.findOneById(modelField.getEnumType());
        if (dataEnum != null) {
            modelFieldModel.setEnumType(new EnumerationModel(dataEnum));
        }

        return modelFieldModel;
    }

    @Override
    public ModelField toEntity(ModelFieldModel modelFieldModel) {
        return modelFieldModel.toEntity();
    }
}
