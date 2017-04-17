package kingGambitExtended.commands.implementCommands;

import kingGambitExtended.commands.Command;
import kingGambitExtended.contracts.Attackable;

public class AttackKingCommand implements Command{
    private Attackable king;

    public AttackKingCommand(Attackable king) {
        this.king = king;
    }

    @Override
    public void execute() {
        this.king.takeAttack();
    }
}
