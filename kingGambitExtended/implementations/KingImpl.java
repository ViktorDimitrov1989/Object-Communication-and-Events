package kingGambitExtended.implementations;

import kingGambitExtended.contracts.King;
import java.util.LinkedHashMap;
import java.util.Map;

public class KingImpl implements King{
    private String name;
    private Map<String, KingGuardImpl> royalGuards;
    private Map<String, KingGuardImpl> footmen;

    public KingImpl(String name) {
        this.name = name;
        this.royalGuards = new LinkedHashMap<>();
        this.footmen = new LinkedHashMap<>();
    }

    @Override
    public void registerGuard(String type, String name, KingGuardImpl observer) {
        switch (type){
            case "royalGuard":
                this.royalGuards.putIfAbsent(name, observer);
                break;
            case "footman":
                this.footmen.putIfAbsent(name, observer);
                break;
        }
    }

    /*@Override
    public void unregister(String type, String observer) {
        switch (type){
            case "royalGuard":
                this.royalGuards.remove(name, observer);
                break;
            case "footman":
                this.footmen.remove(name);
                break;
        }
    }*/

    @Override
    public void notifyObservers() {
        for (KingGuardImpl royalGuard : this.royalGuards.values()) {
            if(!royalGuard.isDead()){
                royalGuard.takeHit();
            }
        }

        for (KingGuardImpl footman : this.footmen.values()) {
            if(!footman.isDead()){
                footman.takeHit();
            }
        }

    }

    @Override
    public void notifyObserver(String guardName) {
        if(this.royalGuards.containsKey(guardName)){
            this.royalGuards.get(guardName).decreaseHealth();
            return;
        }
        this.footmen.get(guardName).decreaseHealth();
    }

    @Override
    public void takeAttack() {
        if(this.footmen.size() > 0 || this.royalGuards.size() > 0){
            System.out.println(String.format("King %s is under attack!", this.name));
            this.notifyObservers();
        }

    }
}
