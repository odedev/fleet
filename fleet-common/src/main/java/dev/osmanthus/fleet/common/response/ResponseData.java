package dev.osmanthus.fleet.common.response;

import java.io.Serializable;

public class ResponseData implements Serializable {
    private static final long serialVersionUID = 1L;

    private Integer code;
    private String title;
    private String message;
    private Object data;

    public ResponseData(Object data) {
        this.setCode(200);
        this.setTitle("");
        this.setMessage("");
        this.setData(data);
    }

    public ResponseData(String title, String message) {
        this.setCode(200);
        this.setTitle(title);
        this.setMessage(message);
        this.setData(null);
    }

    public ResponseData(String title, String message, Object data) {
        this.setCode(200);
        this.setTitle(title);
        this.setMessage(message);
        this.setData(data);
    }

    public ResponseData(Integer code, String title, String message) {
        this.setCode(code);
        this.setTitle(title);
        this.setMessage(message);
        this.setData(null);
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
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

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }
}
