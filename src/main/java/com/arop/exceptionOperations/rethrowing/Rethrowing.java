package com.arop.exceptionOperations.rethrowing;

public class Rethrowing {
    public void someMethod() throws NullPointerException {
        someMethod2();
    }

    public void someMethod2() throws NullPointerException {
        throw new NullPointerException();
    }
}