package com.knoldus;

public class EmptyStringException extends Exception{
    EmptyStringException(){
        super("The string is empty.");
    }
}