package kingGambitExtended.implementations;

public class RoyalGuard extends KingGuardImpl {
    private static final int HEALTH = 3;

    public RoyalGuard(String name) {
        super(name, HEALTH);
    }

    @Override
    public void takeHit() {
        super.decreaseHealth();
        System.out.println(String.format("Royal Guard %s is defending!", super.getName()));
    }

    @Override
    public String toString() {
        return super.getName();
    }

}
