package com.shopping.shoppingApp.exceptionHandler;

public class UserAlreadyExists extends RuntimeException{
    public UserAlreadyExists(String errorMessage){
        super(errorMessage);
    }
}
