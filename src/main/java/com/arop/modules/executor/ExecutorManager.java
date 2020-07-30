package com.arop.modules.executor;

import com.view.Console;
import com.view.ExecuteConsole;

public class ExecutorManager {
    public static void execute(){
        Console console = new ExecuteConsole();
        console.show();
    }
}
