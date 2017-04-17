package kingGambitExtended.contracts;

import kingGambitExtended.implementations.BaseHero;

public interface IKing{

    void addGuard(String name, Attackable guard);

    void notifyGuards();

    void removeGuard(String guardName);

    Attackable getGuard(String name);
}
