package com.manageway.web.exception;

public record ErrorResponse(
        Integer statusCode,
        String message
) {
    public ErrorResponse(Integer statusCode, String message) {
        this.statusCode = statusCode;
        this.message = message;
    }

    public Integer getStatusCode() {
        return statusCode;
    }

    public String getMessage() {
        return message;
    }
}
