package com.telusTest.api.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.AccessDeniedException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.dao.EmptyResultDataAccessException;

import java.time.LocalDateTime;

@RestControllerAdvice
public class GlobalExceptionHandler {
    public record RestErrorResponse(int httpStatus, String message,
                                    LocalDateTime timestamp) {}

    @ExceptionHandler(EmptyResultDataAccessException.class)
    @ResponseStatus(HttpStatus.NOT_FOUND)
    RestErrorResponse handleCustomerNotFoundException(
            EmptyResultDataAccessException ex) {
        return new RestErrorResponse(
                HttpStatus.NOT_FOUND.value(),
                "Unable to find the given todo id",
                LocalDateTime.now());
    }

    @ExceptionHandler(RuntimeException.class)
    @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
    public final RestErrorResponse handleAllExceptions(RuntimeException ex) {
        return new RestErrorResponse(
                HttpStatus.INTERNAL_SERVER_ERROR.value(),
                ex.getMessage(),
                LocalDateTime.now());
    }

    @ExceptionHandler(AccessDeniedException.class)
    public RestErrorResponse handleAccessDeniedException(AccessDeniedException e) {
        return new RestErrorResponse(HttpStatus.FORBIDDEN.value(), e.getMessage(),
                LocalDateTime.now());
    }

    // Handle any other exception too.
    @ExceptionHandler(Exception.class)
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    RestErrorResponse handleException(Exception ex) {
        return new RestErrorResponse(
                HttpStatus.BAD_REQUEST.value(),
                ex.getMessage(),
                LocalDateTime.now());
    }
}
