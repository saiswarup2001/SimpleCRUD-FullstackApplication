package com.saiProject.fullstackbackend.exception;

public class UserNotFoundException extends RuntimeException{

    //constructor'
    public UserNotFoundException(Long id){
        super("User Record Not Found: "+ id);
    }
}
