package kingGambitExtended.implementations;

import kingGambitExtended.contracts.KingGuard;

public abstract class KingGuardImpl implements KingGuard{
    private String name;
    private int health;

    public KingGuardImpl(String name, int health) {
        this.name = name;
        this.health = health;
    }

    public String getName(){
        return this.name;
    }
    
    protected void decreaseHealth() {
        this.health -= 1;
    }

    @Override
    public boolean isDead() {
        return this.health <= 0;
    }
}
