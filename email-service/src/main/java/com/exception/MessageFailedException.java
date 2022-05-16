package com.exception;

public class MessageFailedException extends RuntimeException{
    public MessageFailedException(String message){
        super(message);
    }
}
