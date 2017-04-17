package kingGambitExtended.commands.implementCommands;

import kingGambitExtended.commands.Command;
import kingGambitExtended.contracts.Attackable;
import kingGambitExtended.contracts.IKing;

public class KillCommand implements Command{
    private IKing king;
    private Attackable defender;

    public KillCommand(IKing king, Attackable defender) {
        this.king = king;
        this.defender = defender;
    }

    @Override
    public void execute() {
        this.defender.takeAttack();
        if(this.defender.getHealth() <= 0){
            this.king.removeGuard(defender.getName());
        }
    }
}
