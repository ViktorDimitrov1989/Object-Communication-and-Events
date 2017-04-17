package kingGambit.implementations;

import kingGambit.contracts.Observer;

public class RoyalGuard extends Hero implements Observer{

    public RoyalGuard(String name) {
        super(name);
    }

    @Override
    public void update() {
        System.out.println(String.format("Royal Guard %s is defending!", super.getName()));
    }

    @Override
    public String toString() {
        return super.getName();
    }
}
