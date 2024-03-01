package com.shopping.shoppingApp.exceptionHandler;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class RestExceptionHandler {

    ErrorReponse errorReponse;
    @ExceptionHandler
    public ResponseEntity<ErrorReponse> UserException(UserNotFoundException ex){
        errorReponse=new ErrorReponse();
        errorReponse.setTimeStamp(System.currentTimeMillis());
        errorReponse.setHttpStatus(HttpStatus.NOT_FOUND.value());
        errorReponse.setErrorMessage(ex.getMessage());
        return new ResponseEntity<>(errorReponse,HttpStatus.NOT_FOUND);
    }
    @ExceptionHandler
    public ResponseEntity<ErrorReponse> UserException(UserAlreadyExists ex){
        errorReponse=new ErrorReponse();
        errorReponse.setTimeStamp(System.currentTimeMillis());
        errorReponse.setHttpStatus(HttpStatus.BAD_REQUEST.value());
        errorReponse.setErrorMessage(ex.getMessage());
        return new ResponseEntity<>(errorReponse,HttpStatus.BAD_REQUEST);
    }
    @ExceptionHandler
    public ResponseEntity<ErrorReponse> UserException(Exception ex){
        errorReponse=new ErrorReponse();
        errorReponse.setTimeStamp(System.currentTimeMillis());
        errorReponse.setHttpStatus(HttpStatus.INTERNAL_SERVER_ERROR.value());
        errorReponse.setErrorMessage(ex.getMessage());
        return new ResponseEntity<>(errorReponse,HttpStatus.INTERNAL_SERVER_ERROR);
    }
}
