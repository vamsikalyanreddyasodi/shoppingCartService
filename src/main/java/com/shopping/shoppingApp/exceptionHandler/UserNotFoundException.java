package com.shopping.shoppingApp.exceptionHandler;

public class UserNotFoundException extends RuntimeException{
public UserNotFoundException(String errorMessage){
    super(errorMessage);
    }
}
