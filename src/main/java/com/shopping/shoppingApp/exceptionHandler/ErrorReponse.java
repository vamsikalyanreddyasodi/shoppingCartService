package com.shopping.shoppingApp.exceptionHandler;

public class ErrorReponse {
    private int httpStatus;
    private String errorMessage;
    private Long timeStamp;

    public ErrorReponse(int httpStatus, String errorMessage, Long timeStamp) {
        this.httpStatus = httpStatus;
        this.errorMessage = errorMessage;
        this.timeStamp = timeStamp;
    }
    public ErrorReponse(){}
    public int getHttpStatus() {
        return httpStatus;
    }

    public void setHttpStatus(int httpStatus) {
        this.httpStatus = httpStatus;
    }

    public String getErrorMessage() {
        return errorMessage;
    }

    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }

    public Long getTimeStamp() {
        return timeStamp;
    }

    public void setTimeStamp(Long timeStamp) {
        this.timeStamp = timeStamp;
    }
}
