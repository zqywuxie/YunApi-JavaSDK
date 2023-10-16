package com.wuxie.yunapi.yunapiclientsdk.exception;


import lombok.Getter;

/**
 * 自定义异常类
 *
 * @author wuxie

 */
@Getter
public class ApiException extends RuntimeException {

    private static final long serialVersionUID = -5337672305491820198L;
    /**
     * 错误码
     */
    private final int code;

    public ApiException(int code, String message) {
        super(message);
        this.code = code;
    }

    public ApiException(ErrorCode errorCode) {
        super(errorCode.getMessage());
        this.code = errorCode.getCode();
    }

    public ApiException(ErrorCode errorCode, String message) {
        super(message);
        this.code = errorCode.getCode();
    }

}
