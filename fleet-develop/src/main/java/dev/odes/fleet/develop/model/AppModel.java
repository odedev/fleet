package dev.odes.fleet.develop.model;

import dev.odes.fleet.common.model.AbstractModel;
import dev.odes.fleet.develop.entity.App;

public class AppModel extends AbstractModel<App> {
    private String id;
    private String code;
    private String name;
    private String port;
}
