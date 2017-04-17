package kingGambit.implementations;

import kingGambit.contracts.Observer;

public class Footman extends Hero implements Observer{


    public Footman(String name) {
        super(name);
    }

    @Override
    public void update() {
        System.out.println(String.format("Footman %s is panicking!", super.getName()));
    }

    @Override
    public String toString() {
        return super.getName();
    }
}
