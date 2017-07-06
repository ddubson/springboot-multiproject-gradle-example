package com.ddubson.exceptions;

public class BootCustomException extends RuntimeException {
    public BootCustomException(String message) {
        super("[BootCustom] " + message);
    }
}
