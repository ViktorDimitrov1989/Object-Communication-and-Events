package kingGambit.commands.implementCommands;

import kingGambit.commands.Command;
import kingGambit.contracts.Attackable;

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
