package dev.odes.fleet.core.file.dto;

import org.springframework.web.multipart.MultipartFile;

public class ResourceUploadDto {
    private MultipartFile file;
    private String name;
    private String folder;
    private String category;

    public MultipartFile getFile() {
        return file;
    }

    public void setFile(MultipartFile file) {
        this.file = file;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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
}
