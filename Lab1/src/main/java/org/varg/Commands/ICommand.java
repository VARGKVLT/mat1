package org.varg.Commands;


import org.varg.util.Environment;

import java.io.IOException;

public interface ICommand {
    void execute(Environment environment, String message) throws IOException;
    String getName();
    String getDescription();
}
