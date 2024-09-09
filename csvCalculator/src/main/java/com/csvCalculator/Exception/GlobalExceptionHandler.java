package com.csvCalculator.Exception;

import java.io.IOException;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.opencsv.exceptions.CsvValidationException;

@ControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(IOException.class)
    public ResponseEntity<String> handleIOException(IOException e) {
        return new ResponseEntity<>("IOException" + e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
    }

    @ExceptionHandler(CsvValidationException.class)
    public ResponseEntity<String> handleCsvValidationExcepton(CsvValidationException e) {
        return new ResponseEntity<>("IOException" + e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
    }

    @ExceptionHandler(NumberFormatException.class)
    public ResponseEntity<String> handleNumberFormatException(NumberFormatException e) {
        return new ResponseEntity<>("IOException" + e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
    }

}
