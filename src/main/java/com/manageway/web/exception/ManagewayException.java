package com.manageway.web.exception;

import org.springframework.http.HttpStatus;

public class ManagewayException extends RuntimeException {
    HttpStatus statusCode;
    String message;

    public ManagewayException(HttpStatus statusCode, String message) {
        super(message);
        this.statusCode = statusCode;
        this.message = message;
    }


    public ManagewayException(String message) {
        super(message);
        this.message = message;
    }

    public HttpStatus getStatusCode() {
        return statusCode;
    }

    public void setStatusCode(HttpStatus statusCode) {
        this.statusCode = statusCode;
    }

    @Override
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
