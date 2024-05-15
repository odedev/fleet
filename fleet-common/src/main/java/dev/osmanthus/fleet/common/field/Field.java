package dev.osmanthus.fleet.common.field;

import dev.osmanthus.fleet.common.enumeration.DataTypeEnum;

public class Field {

    /**
     * 编码
     */
    private String code;

    /**
     * 名称
     */
    private String name;

    /**
     * 数据类型
     */
    private DataTypeEnum dataType;

    /**
     * 长度
     * default: 255
     */
    private Integer length;

    /**
     * 默认值
     */
    private String defaultValue;

    /**
     * 引用枚举
     */
    private String referenceEnum;

    /**
     * 引用实体
     */
    private String referenceEntity;

    /**
     * 引用实体字段
     */
    private String referenceEntityField;

    /**
     * 是否弱引用, 如果为 true 则类型为String或Integer, 不是对应的实体或枚举
     * 可达到解耦模块依赖
     * default: false
     */
    public Boolean isWeakReference;

    /**
     * 是否可空
     * default: true
     */
    private Boolean isNullable;

    /**
     * 是否可搜索
     * default: true
     */
    private Boolean isSearchable;

    /**
     * 是否默认显示, 只能有一个字段为 true
     * default: false
     */
    private Boolean isDefaultDisplay;

    /**
     * 是否主实体字段, 只能有一个字段为 true, 主从关系使用
     * default: false
     */
    private Boolean isMasterField;

    /**
     * 是否从实体字段, 主从关系使用
     * default: false
     */
    private Boolean isSlaveField;

}
