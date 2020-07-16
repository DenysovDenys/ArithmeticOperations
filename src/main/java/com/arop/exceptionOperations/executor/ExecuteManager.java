package com.arop.exceptionOperations.executor;

import com.arop.exceptionOperations.division.SafeDivision;
import com.arop.exceptionOperations.rethrowing.Rethrowing;

public class ExecuteManager {
    SafeDivision safeDivision = new SafeDivision();
    Rethrowing rethrowing = new Rethrowing();

    public void runProgram() {
        safeDivision.outputDivideException();
        rethrowing.someMethod();
    }
}
