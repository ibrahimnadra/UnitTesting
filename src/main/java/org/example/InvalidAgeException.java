package org.example;

public class InvalidAgeException extends Exception{
    InvalidAgeException(){
        super("The age is invalid.");
    }
}