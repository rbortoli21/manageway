package com.manageway.web.exception;

import org.springframework.http.HttpStatus;

public class ManagewayValidationException extends ManagewayException {

    public ManagewayValidationException(String message) {
        super(HttpStatus.BAD_REQUEST, message);
    }

    public ManagewayValidationException(HttpStatus statusCode, String message) {
        super(statusCode, message);
    }
}
