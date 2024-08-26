/*
package com.numan.ahmad.restjwt.exceptions;

import lombok.extern.slf4j.Slf4j;
import org.springframework.core.Ordered;
import org.springframework.core.annotation.Order;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.http.converter.HttpMessageNotReadableException;
import org.springframework.web.bind.MissingRequestHeaderException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.multipart.MaxUploadSizeExceededException;
import org.springframework.web.multipart.support.MissingServletRequestPartException;

@Slf4j
@Order(Ordered.HIGHEST_PRECEDENCE)
@RestControllerAdvice
public class GenericExceptionHandler {

    @ExceptionHandler(HttpMessageNotReadableException.class)
    public ResponseEntity<ClientErrorResponse> handleHttpMessageNotReadableException(HttpMessageNotReadableException ex) {

        log.error("HttpMessageNotReadableException: {}", ex.getMessage());
        log.error(ex.getMessage(), ex);
        return ResponseEntity.status(HttpStatus.BAD_REQUEST)
                .body(ClientErrorResponse.builder()
                        .ok(false)
                        .errors("Required request body is missing")
                        .build());
    }

    @ExceptionHandler(NullPointerException.class)
    public ResponseEntity<ClientErrorResponse> handleNullPointerException(NullPointerException ex) {

        log.error("NullPointerException: {}", ex.getMessage());
        log.error(ex.getMessage(), ex);
        return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR)
                .body(ClientErrorResponse.builder()
                        .ok(false)
                        .errors(Constants.SOMETHING_BAD_HAPPENED)
                        .build());
    }

    @ExceptionHandler(MaxUploadSizeExceededException.class)
    public ResponseEntity<ClientErrorResponse> handleMaxUploadSizeExceededException(MaxUploadSizeExceededException ex) {

        log.error("MaxUploadSizeExceededException: {}", ex.getMessage());
        log.error(ex.getMessage(), ex);

        return ResponseEntity.status(HttpStatus.BAD_REQUEST)
                .body(ClientErrorResponse.builder().ok(false).errors(ex.getMessage()).build());
    }

    @ExceptionHandler(MissingServletRequestPartException.class)
    public ResponseEntity<ClientErrorResponse> handleMMissingServletRequestPartException(MissingServletRequestPartException ex) {

        log.error("MissingServletRequestPartException: {}", ex.getMessage());
        log.error(ex.getMessage(), ex);

        return ResponseEntity.status(HttpStatus.BAD_REQUEST)
                .body(ClientErrorResponse.builder().ok(false).errors(ex.getMessage()).build());
    }

    @ExceptionHandler(MissingRequestHeaderException.class)
    public ResponseEntity<ClientErrorResponse> handleMissingRequestHeaderException(MissingRequestHeaderException ex) {

        log.error("MissingRequestHeaderException: {}", ex.getMessage());
        log.error(ex.getMessage(), ex);
        return ResponseEntity.status(HttpStatus.BAD_REQUEST)
                .body(ClientErrorResponse.builder()
                        .ok(false)
                        .errors(ex.getMessage())
                        .build());
    }

    @ExceptionHandler(Exception.class)
    public ResponseEntity<ClientErrorResponse> handleException(Exception ex) {

        log.error("Exception: {}", ex.getMessage());
        log.error(ex.getMessage(), ex);
        return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR)
                .body(ClientErrorResponse.builder()
                        .ok(false)
                        .errors(Constants.SOMETHING_BAD_HAPPENED)
                        .build());
    }
}
*/
