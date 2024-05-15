package dev.osmanthus.fleet.common.response;

import java.io.Serializable;

public class ResponseError implements Serializable {
    private static final long serialVersionUID = 1L;

    private Integer code;
    private String title;
    private String message;
    private Object error;

    public ResponseError(Object error) {
        this.setCode(500);
        this.setTitle("");
        this.setMessage("");
        this.setError(error);
    }

    public ResponseError(String title, String message) {
        this.setCode(500);
        this.setTitle(title);
        this.setMessage(message);
        this.setError(null);
    }

    public ResponseError(String title, String message, Object error) {
        this.setCode(500);
        this.setTitle(title);
        this.setMessage(message);
        this.setError(error);
    }

    public ResponseError(Integer code, String title, String message) {
        this.setCode(code);
        this.setTitle(title);
        this.setMessage(message);
        this.setError(null);
    }

    public ResponseError(Integer code, String title, String message, Object error) {
        this.setCode(code);
        this.setTitle(title);
        this.setMessage(message);
        this.setError(error);
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

    public Object getError() {
        return error;
    }

    public void setError(Object error) {
        this.error = error;
    }
}
