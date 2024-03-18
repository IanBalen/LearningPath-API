package com.api.test.exception;

import com.api.test.exception.custom.ExceptionMessage;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalHandler {

    @ExceptionHandler(Exception.class)
    public ExceptionMessage handleException(Exception e) {
        return new ExceptionMessage(e.getMessage());
    }

}
