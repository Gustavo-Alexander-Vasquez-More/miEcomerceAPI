package com.shop.miecomerce.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class ResourceNotFoundException extends RuntimeException {
    // Constructor que recibe el mensaje de error
    public ResourceNotFoundException(String message) {
        // Llama al constructor de RuntimeException para establecer el mensaje
        super(message);
    }

    // Opcional: Constructor para incluir la causa raíz (otra excepción)
    public ResourceNotFoundException(String message, Throwable cause) {
        super(message, cause);
    }
}
