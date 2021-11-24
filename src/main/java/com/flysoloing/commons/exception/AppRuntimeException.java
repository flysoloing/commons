package com.flysoloing.commons.exception;

/**
 * 通用的应用运行时异常类
 *
 * @author laitao
 * @date 2014-08-03 23:21:00
 */
public class AppRuntimeException extends RuntimeException {

    private static final long serialVersionUID = -1540851313130932011L;
    /**
     * 用来反应业务异常的错误码，一般会结合配置文件
     */
    private String errorCode;

    /**
     * 用来反应业务异常信息的错误信息，一般会结合配置来说明<code>errorCode</code>
     */
    private String errorMessage;

    public AppRuntimeException(String errorCode, String errorMessage) {
        this.errorMessage = errorMessage;
        this.errorCode = errorCode;
    }

    public String getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }

    public String getErrorMessage() {
        return errorMessage;
    }

    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }
}
