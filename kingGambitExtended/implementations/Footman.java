package kingGambitExtended.implementations;

public class Footman extends KingGuardImpl {
    private static final int HEALTH = 2;


    public Footman(String name) {
        super(name, HEALTH);
    }

    @Override
    public void takeHit() {
        super.decreaseHealth();
        System.out.println(String.format("Footman %s is panicking!", super.getName()));

    }

    @Override
    public String toString() {
        return super.getName();
    }

}
