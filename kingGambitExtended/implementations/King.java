package kingGambitExtended.implementations;

import kingGambitExtended.contracts.Attackable;
import kingGambitExtended.contracts.IKing;
import java.util.LinkedHashMap;
import java.util.Map;

public class King extends BaseHero implements IKing{
    private Map<String, Attackable> defenders;

    public King(String name) {
        super(name);
        this.defenders = new LinkedHashMap<>();
    }


    @Override
    public void addGuard(String name, Attackable guard) {
        this.defenders.put(name, guard);
    }

    @Override
    public void notifyGuards() {
        System.out.println(String.format("King %s is under attack!", super.getName()));
        for (Attackable defender : this.defenders.values()) {
            defender.respond();
        }
    }

    @Override
    public void removeGuard(String guardName) {
        this.defenders.remove(guardName);
    }

    @Override
    public Attackable getGuard(String name) {
        return this.defenders.get(name);
    }
}
