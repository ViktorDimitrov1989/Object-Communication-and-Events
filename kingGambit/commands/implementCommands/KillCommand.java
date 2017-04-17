package kingGambit.commands.implementCommands;

import kingGambit.commands.Command;
import kingGambit.contracts.Subject;

public class KillCommand implements Command{
    private Subject king;
    private String observerName;

    public KillCommand(Subject king, String observerName) {
        this.king = king;
        this.observerName = observerName;
    }


    @Override
    public void execute() {
        this.king.unregister(this.observerName);
    }
}
