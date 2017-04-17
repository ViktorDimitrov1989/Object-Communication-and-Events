package kingGambitExtended.contracts;

import kingGambitExtended.implementations.KingGuardImpl;

public interface King extends Attackable{

    void registerGuard(String type, String name, KingGuardImpl observer);

    //void unregister(String type, String observer);

    void notifyObservers();

    void notifyObserver(String guardName);
}
