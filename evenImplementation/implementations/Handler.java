package evenImplementation.implementations;

import evenImplementation.contracts.NameChangeListener;

public class Handler implements NameChangeListener{


    @Override
    public void handleChangedName(String name) {
        System.out.printf("Dispatcher's name changed to %s.\n", name);
    }
}
