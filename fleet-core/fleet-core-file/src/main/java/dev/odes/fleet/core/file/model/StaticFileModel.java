package dev.odes.fleet.core.file.model;

import dev.odes.fleet.common.model.AbstractModel;
import dev.odes.fleet.core.file.entity.StaticFile;
import dev.odes.fleet.core.file.enumeration.LocationEnum;

public class StaticFileModel extends AbstractModel<StaticFile> {
    private String id;
    private String name;
    private Long size;
    private String type;
    private String path;
    private String url;
    private LocationEnum location;
    private String folder;
    private String category;
    private String status;
    private String user;

    public StaticFileModel() {
    }

    public StaticFileModel(StaticFile staticFile) {
        this.fromEntity(staticFile);
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

    public String getFolder() {
        return folder;
    }

    public void setFolder(String folder) {
        this.folder = folder;
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

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    @Override
    public void fromEntity(StaticFile staticFile) {
        if (staticFile == null) {
            return;
        }
        this.setId(staticFile.getId());
        this.setName(staticFile.getName());
        this.setSize(staticFile.getSize());
        this.setType(staticFile.getType());
        this.setPath(staticFile.getPath());
        this.setUrl(staticFile.getUrl());
        this.setLocation(LocationEnum.getByValue(staticFile.getLocation()));
        this.setFolder(staticFile.getFolder());
        this.setCategory(staticFile.getCategory());
        this.setStatus(staticFile.getStatus());
        this.setUser(staticFile.getUser());
    }

    @Override
    public StaticFile toEntity() {
        StaticFile staticFile = new StaticFile();
        staticFile.setId(this.getId());
        staticFile.setName(this.getName());
        staticFile.setSize(this.getSize());
        staticFile.setType(this.getType());
        staticFile.setPath(this.getPath());
        staticFile.setUrl(this.getUrl());
        staticFile.setLocation(this.getLocation().getValue());
        staticFile.setFolder(this.getFolder());
        staticFile.setCategory(this.getCategory());
        staticFile.setStatus(this.getStatus());
        staticFile.setUser(this.getUser());
        return staticFile;
    }
}
