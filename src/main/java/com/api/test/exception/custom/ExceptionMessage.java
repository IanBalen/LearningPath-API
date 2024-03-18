package com.api.test.exception.custom;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class ExceptionMessage {

    private String message;
    private LocalDateTime timestamp;
    private int status;

    public ExceptionMessage(String message) {
        this.message = message;
        this.timestamp = LocalDateTime.now();
        this.status = 500;
    }

}
