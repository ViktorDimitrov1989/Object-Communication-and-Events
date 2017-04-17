package kingGambitExtended.implementations;

import kingGambitExtended.contracts.Attackable;

public class Footman extends BaseHero implements Attackable {
    private static final int INITIAL_HEALTH = 2;

    private int health;

    public Footman(String name) {
        super(name);
        this.health = INITIAL_HEALTH;
    }

    @Override
    public void takeAttack() {
        this.health -= 1;
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public void respond() {
        System.out.println(String.format("Footman %s is panicking!", super.getName()));
    }

    @Override
    public int getHealth() {
        return this.health;
    }

    @Override
    public String toString() {
        return super.getName();
    }
}
