package com.arop.exceptionOperations.exceptions;

import java.io.IOException;

public class ExceptionsDemonstration {
    public void catchExceptionA() {
        try {
            throw new ExceptionA("ExeptionA String constructor");
        } catch (ExceptionA exceptionA) {
            System.out.println("Catch exception A");
        }
    }

    public void catchExceptionB() {
        try {
            throw new ExceptionB("ExeptionA String constructor");
        } catch (ExceptionB exceptionB) {
            System.out.println("Catch exception B");
        }
    }

    public void catchNullPointerException() {
        try {
            throw new NullPointerException();
        } catch (NullPointerException e) {
            System.out.println("Catch NullPointerException");
        }
    }

    public void catchIOException() {
        try {
            throw new IOException();
        } catch (IOException e) {
            System.out.println("Catch IOException");
        }
    }
}