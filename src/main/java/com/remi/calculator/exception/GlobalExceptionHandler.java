package com.remi.calculator.exception;

import feign.FeignException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExceptionHandler {
    private static final String NBP_API_ERROR_MESSAGE = "Could not load currency from NBP WEB API";

    @ExceptionHandler({FeignException.class, MethodArgumentNotValidException.class})
    private ResponseEntity<ErrorResponse> handleResourceException() {
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body(
                new ErrorResponse(NBP_API_ERROR_MESSAGE, HttpStatus.NOT_FOUND));
    }
}
