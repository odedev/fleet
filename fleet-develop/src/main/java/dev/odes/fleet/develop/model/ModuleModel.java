package dev.odes.fleet.develop.model;

import dev.odes.fleet.common.model.AbstractModel;
import dev.odes.fleet.develop.entity.Module;

public class ModuleModel extends AbstractModel<Module> {
    private String id;
    private String code;
    private String name;
    private String description;
    private Integer moduleType;
    private Integer persistenceType;
}
