package com.shop.miecomerce.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class ResourceNotFoundException extends RuntimeException {
    // Constructor que recibe el mensaje de error
    public ResourceNotFoundException(String message) {
        super(message);
    }
    // Constructor que recibe el mensaje de error y la causa
    public ResourceNotFoundException(String message, Throwable cause) {
        super(message, cause);
    }
}
