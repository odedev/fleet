package dev.osmanthus.fleet.common.parameter;

import java.io.Serializable;
import java.util.List;

public class Parameter implements Serializable {
    private static final long serial = 1L;

    private List<ParameterProperty> properties;
    private Integer pageNumber;
    private Integer pageSize;

    public List<ParameterProperty> getProperties() {
        return properties;
    }

    public void setProperties(List<ParameterProperty> properties) {
        this.properties = properties;
    }

    public Integer getPageNumber() {
        return pageNumber;
    }

    public void setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
    }

    public Integer getPageSize() {
        return pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }
}
