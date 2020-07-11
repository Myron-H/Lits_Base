package com.lits.hw9;

public class MyException extends RuntimeException {

    // в конструкторі меседж з класу RuntimeException
    public MyException(String message) {
        super(message);
    }
}
