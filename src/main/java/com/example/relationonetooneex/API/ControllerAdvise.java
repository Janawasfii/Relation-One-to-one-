package com.example.relationonetooneex.API;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice

public class ControllerAdvise {

    @ExceptionHandler(value = APIException.class)
    public ResponseEntity ApiException(APIException e){
        return ResponseEntity.status(400).body(e.getMessage());}


}
