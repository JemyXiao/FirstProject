package com.recruit.common.exception;

/**
 * Created by jmx on 17/6/20.
 * 业务校验异常
 */
public class RecruitValidationException extends RuntimeException {
    private int errorCode;
    private Object data;

    public RecruitValidationException(int errorCode, Object data) {
        this.errorCode = errorCode;
        this.data = data;
    }

    public RecruitValidationException() {
        super();
    }

    public RecruitValidationException(String message) {
        super(message);
    }

    public int getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(int errorCode) {
        this.errorCode = errorCode;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public RecruitValidationException(String message, int errorCode, Object data) {
        super(message);
        this.errorCode = errorCode;
        this.data = data;
    }

    public RecruitValidationException(String message, Throwable cause, int errorCode, Object data) {
        super(message, cause);
        this.errorCode = errorCode;
        this.data = data;
    }

    public RecruitValidationException(Throwable cause, int errorCode, Object data) {
        super(cause);
        this.errorCode = errorCode;
        this.data = data;
    }

    public RecruitValidationException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace, int errorCode, Object data) {
        super(message, cause, enableSuppression, writableStackTrace);
        this.errorCode = errorCode;
        this.data = data;
    }
}
