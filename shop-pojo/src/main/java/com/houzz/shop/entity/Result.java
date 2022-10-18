package com.houzz.shop.entity;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

/**
 * 结果实体类
 */
public class Result implements Serializable {
    private Boolean success;
    private String message;
    private Map<String,Object> bean;
    private List<Map<String,Object>> beans;

    public Result() {
    }

    public Result(Boolean success, String message) {
        this.success = success;
        this.message = message;
    }

    public Result(Boolean success, String message, Map<String, Object> bean) {
        this.success = success;
        this.message = message;
        this.bean = bean;
    }

    public Result(Boolean success, String message, Map<String, Object> bean, List<Map<String, Object>> beans) {
        this.success = success;
        this.message = message;
        this.bean = bean;
        this.beans = beans;
    }

    public Boolean getSuccess() {
        return success;
    }

    public void setSuccess(Boolean success) {
        this.success = success;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Map<String, Object> getBean() {
        return bean;
    }

    public void setBean(Map<String, Object> bean) {
        this.bean = bean;
    }

    public List<Map<String, Object>> getBeans() {
        return beans;
    }

    public void setBeans(List<Map<String, Object>> beans) {
        this.beans = beans;
    }

    @Override
    public String toString() {
        return "Result{" +
                "success=" + success +
                ", message='" + message + '\'' +
                '}';
    }
}
