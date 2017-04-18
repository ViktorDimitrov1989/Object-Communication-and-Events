package eventImplementation.implementations;

import eventImplementation.contracts.NameChangeListener;

public class Handler implements NameChangeListener{


    @Override
    public void handleChangedName(String name) {
        System.out.printf("Dispatcher's name changed to %s.\n", name);
    }
}
