package dev.osmanthus.fleet.tool.develop.transform;

import dev.osmanthus.fleet.common.transform.Transform;
import dev.osmanthus.fleet.tool.develop.entity.Enumeration;
import dev.osmanthus.fleet.tool.develop.entity.Module;
import dev.osmanthus.fleet.tool.develop.model.EnumerationModel;
import dev.osmanthus.fleet.tool.develop.model.EnumerationValueModel;
import dev.osmanthus.fleet.tool.develop.model.ModuleModel;
import dev.osmanthus.fleet.tool.develop.repository.ModuleRepository;
import dev.osmanthus.fleet.tool.develop.service.EnumerationValueService;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class EnumerationTransform implements Transform<Enumeration, EnumerationModel> {
    private final ModuleRepository moduleRepository;
//    private final EnumerationValueRepository enumerationValueRepository;
    private final EnumerationValueService enumerationValueService;

    public EnumerationTransform(ModuleRepository moduleRepository, EnumerationValueService enumerationValueService) {
        this.moduleRepository = moduleRepository;
        this.enumerationValueService = enumerationValueService;
    }

    @Override
    public EnumerationModel toModel(Enumeration enumeration) {
        EnumerationModel enumerationModel = new EnumerationModel(enumeration);

        Module module = this.moduleRepository.findOneById(enumeration.getModule());
        if (module != null) {
            enumerationModel.setModule(new ModuleModel(module));
        }

        List<EnumerationValueModel> enumerationValues = this.enumerationValueService.findManyById("enumeration", enumeration.getId());
        enumerationModel.setValues(enumerationValues);

        return enumerationModel;
    }

    @Override
    public Enumeration toEntity(EnumerationModel enumerationModel) {
        return enumerationModel.toEntity();
    }

}
