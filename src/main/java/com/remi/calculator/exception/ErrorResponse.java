package com.remi.calculator.exception;

import org.springframework.http.HttpStatus;

import java.sql.Timestamp;
import java.util.Date;

public class ErrorResponse {

    private final String message;
    private final HttpStatus status;
    private final Date timestamp;

    public ErrorResponse(String message, HttpStatus status) {
        this.message = message;
        this.status = status;
        this.timestamp = new Timestamp(System.currentTimeMillis());
    }

    public String getMessage() {
        return message;
    }

    public HttpStatus getStatus() {
        return status;
    }

    public Date getTimestamp() {
        return timestamp;
    }
}
