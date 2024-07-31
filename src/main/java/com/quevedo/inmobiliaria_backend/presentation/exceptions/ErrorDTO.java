package com.quevedo.inmobiliaria_backend.presentation.exceptions;

public class ErrorDTO {
    private int errorCode;
    private String reason;

    public static ErrorDTO of(int errorCode, String reason) {
        return new ErrorDTO(errorCode, reason);
    }

    public ErrorDTO() {
    }

    public ErrorDTO(int errorCode, String reason) {
        this.errorCode = errorCode;
        this.reason = reason;
    }

    public int getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(int errorCode) {
        this.errorCode = errorCode;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }
}
