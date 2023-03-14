package org.varg.Commands;

import org.varg.util.Environment;

import java.io.IOException;

public class Info implements ICommand{
    @Override
    public void execute(Environment environment, String message) throws IOException {
        environment.getPrintStream().println("Created by Vladimir Kuznetsov, ISU: 315544, Group: P32141\n" +
                "Firstly, you need to create matrix. " +
                "After that, you are free to use any commands you want))");
    }

    @Override
    public String getName() {
        return "info";
    }

    @Override
    public String getDescription() {
        return "info : returns main information about this work.";
    }
}






