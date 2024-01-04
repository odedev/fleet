package dev.odes.fleet.common.response;

import java.io.Serializable;

public class ResponseData implements Serializable {
    private static final long serialVersionUID = 1L;

    private String title;
    private String message;
    private Integer status;
    private Object data;

    public ResponseData(Object data) {
        this.setTitle("");
        this.setMessage("");
        this.setStatus(200);
        this.setData(data);
    }

    public ResponseData(String title, String message) {
        this.setTitle(title);
        this.setMessage(message);
        this.setStatus(200);
        this.setData(null);
    }

    public ResponseData(String title, String message, Object data) {
        this.setTitle(title);
        this.setMessage(message);
        this.setStatus(200);
        this.setData(data);
    }

    public ResponseData(String title, String message, Integer status) {
        this.setTitle(title);
        this.setMessage(message);
        this.setStatus(status);
        this.setData(null);
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }
}
