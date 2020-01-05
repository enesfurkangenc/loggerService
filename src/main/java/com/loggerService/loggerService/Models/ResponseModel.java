package com.loggerService.loggerService.Models;

/**
 * ResponseModel
 */
public class ResponseModel {

    private Boolean Status;
    private String Message;

    public ResponseModel(Boolean status, String message) {
        Status = status;
        Message = message;
    }

    public Boolean getStatus() {
        return Status;
    }

    public void setStatus(Boolean status) {
        Status = status;
    }

    public String getMessage() {
        return Message;
    }

    public void setMessage(String message) {
        Message = message;
    }

    @Override
    public String toString() {
        return "ResponseModel [Message=" + Message + ", Status=" + Status + "]";
    }
}