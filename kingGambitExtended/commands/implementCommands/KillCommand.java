package kingGambitExtended.commands.implementCommands;

import kingGambitExtended.commands.Command;
import kingGambitExtended.contracts.King;

public class KillCommand implements Command{
    private King king;
    private String observerName;

    public KillCommand(King king, String observerName) {
        this.king = king;
        this.observerName = observerName;
    }

    @Override
    public void execute() {
        this.king.takeAttack();
        this.king.notifyObserver(this.observerName);
    }
}
