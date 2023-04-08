package org.example;

public class EmptyStringException extends Exception{
    EmptyStringException(){
        super("The string is empty.");
    }
}