package org.varg.Commands;

import org.varg.Managers.CollectionManager;
import org.varg.util.Environment;

public class Clean implements ICommand{
    @Override
    public void execute(Environment environment, String message) {
        CollectionManager collectionManager = environment.getCollectionManager();
        collectionManager.removeAllElements();
        environment.getPrintStream().println("Collection cleaned!");
    }

    @Override
    public String getName() {
        return "clean";
    }

    @Override
    public String getDescription() {
        return "clean : clear the collection";
    }
}
