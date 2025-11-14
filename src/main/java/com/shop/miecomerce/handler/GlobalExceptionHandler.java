package com.shop.miecomerce.handler;

import com.shop.miecomerce.dto.ErrorResponseDTO;
import com.shop.miecomerce.exception.ResourceNotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;

import java.util.HashMap;
import java.util.Map;

@ControllerAdvice // Indica que esta clase maneja excepciones a nivel global, es decir para todos los controladores.
public class GlobalExceptionHandler {

    //Manejo de errores de validacion (@Valid) - HTTP 400 Bad Request
    //Captura las excepciones de validacion @NotNull, @NotBlank, @Min, etc.
    @ExceptionHandler(MethodArgumentNotValidException.class)
    public ResponseEntity<Map<String, String>> handleValidationException(MethodArgumentNotValidException exception) {
        Map<String, String> errors = new HashMap<>(); // Mapa para almacenar los errores de validación
        for(FieldError error: exception.getBindingResult().getFieldErrors()) { // Itera sobre los errores de validación
          errors.put(error.getField(), error.getDefaultMessage()); // Agrega el campo y el mensaje de error al mapa
        }
        return new ResponseEntity<>(errors, HttpStatus.BAD_REQUEST);
    }

    //Manejo de errores de Negocio/Recuso no encontrado - HTTP 404 Not Found
    @ExceptionHandler(ResourceNotFoundException.class)
    public ResponseEntity<ErrorResponseDTO> handleResourceNotFoundException(ResourceNotFoundException exception, WebRequest request) {
        ErrorResponseDTO errorResponse = new ErrorResponseDTO(
                HttpStatus.NOT_FOUND.value(),
                exception.getMessage(),
                request.getDescription(false).replace("uri=", "")
        );
        return new ResponseEntity<>(errorResponse, HttpStatus.NOT_FOUND);
    }

    //Manejo de errores genericos - HTTP 500 Internal Server Error
    @ExceptionHandler(Exception.class)
    public ResponseEntity<ErrorResponseDTO> handleGenericException(Exception exception, WebRequest request) {
        ErrorResponseDTO errorResponse = new ErrorResponseDTO(
                HttpStatus.INTERNAL_SERVER_ERROR.value(),
                exception.getMessage(),
                request.getDescription(false).replace("uri=", "")
        );
        return new ResponseEntity<>(errorResponse, HttpStatus.INTERNAL_SERVER_ERROR);
    }
}
