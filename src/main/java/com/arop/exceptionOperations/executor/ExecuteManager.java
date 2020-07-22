package com.arop.exceptionOperations.executor;

import com.arop.exceptionOperations.division.SafeDivision;
import com.arop.exceptionOperations.exceptions.ExceptionsDemonstration;
import com.arop.exceptionOperations.rethrowing.Rethrowing;

public class ExecuteManager {
    ExceptionsDemonstration exceptionsDemonstration = new ExceptionsDemonstration();
    SafeDivision safeDivision = new SafeDivision();
    Rethrowing rethrowing = new Rethrowing();

    public void runProgram() {
        exceptionsDemonstration.catchExceptionA();
        exceptionsDemonstration.catchExceptionB();
        exceptionsDemonstration.catchIOException();
        exceptionsDemonstration.catchNullPointerException();

        safeDivision.outputDivideException();
        rethrowing.someMethod();
    }
}
