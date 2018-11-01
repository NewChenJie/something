package com.cj.exception;


import com.cj.utils.KeyValue;

/**
 * Created with IntelliJ IDEA
 *自定义
 * Created on 2017/6/13 19:45.
 */
public class EntityValidException extends RuntimeException {
    private KeyValue keyValue;

    public EntityValidException() {
    }

    public EntityValidException(KeyValue keyValue) {
        this.keyValue = keyValue;
    }

    public EntityValidException(String message) {
        super(message);
    }

    public EntityValidException(String message, Throwable cause) {
        super(message, cause);
    }

    public EntityValidException(Throwable cause) {
        super(cause);
    }

    public EntityValidException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }

    public KeyValue getKeyValue() {
        return keyValue;
    }

    public void setKeyValue(KeyValue keyValue) {
        this.keyValue = keyValue;
    }
}
