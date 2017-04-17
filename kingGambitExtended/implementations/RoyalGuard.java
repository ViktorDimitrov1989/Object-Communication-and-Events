package kingGambitExtended.implementations;

import kingGambitExtended.contracts.Attackable;

public class RoyalGuard extends BaseHero implements Attackable {
    private static final int INITIAL_HEALTH = 3;

    private int health;

    public RoyalGuard(String name) {
        super(name);
        this.health = INITIAL_HEALTH;
    }

    @Override
    public void takeAttack() {
        this.health -= 1;
    }

    @Override
    public void respond() {
        System.out.println(String.format("Royal Guard %s is defending!", super.getName()));
    }

    @Override
    public int getHealth() {
        return this.health;
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public String toString() {
        return super.getName();
    }

}
