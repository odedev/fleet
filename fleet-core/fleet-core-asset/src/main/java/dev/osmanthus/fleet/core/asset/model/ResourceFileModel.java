package dev.osmanthus.fleet.core.asset.model;

import dev.osmanthus.fleet.common.model.AbstractModel;
import dev.osmanthus.fleet.core.asset.entity.ResourceFile;
import dev.osmanthus.fleet.core.asset.enumeration.LocationEnum;

public class ResourceFileModel extends AbstractModel<ResourceFile> {
    private String id;
    private String name;
    private Long size;
    private String type;
    private String path;
    private String url;
    private LocationEnum location;
    private String directory;
    private String category;
    private String status;
    private String scope;

    public ResourceFileModel() {
    }

    @Override
    public String getId() {
        return id;
    }

    @Override
    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getSize() {
        return size;
    }

    public void setSize(Long size) {
        this.size = size;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public LocationEnum getLocation() {
        return location;
    }

    public void setLocation(LocationEnum location) {
        this.location = location;
    }

    public String getDirectory() {
        return directory;
    }

    public void setDirectory(String directory) {
        this.directory = directory;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getScope() {
        return scope;
    }

    public void setScope(String scope) {
        this.scope = scope;
    }

}
