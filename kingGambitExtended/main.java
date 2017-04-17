package kingGambitExtended;

import kingGambitExtended.commands.CommandExecutor;
import kingGambitExtended.commands.implementCommands.KillCommand;
import kingGambitExtended.implementations.Footman;
import kingGambitExtended.implementations.King;
import kingGambitExtended.implementations.RoyalGuard;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        CommandExecutor executor = new CommandExecutor();

        String kingName = reader.readLine();
        King king = new King(kingName);

        String[] royalGuardsNames = reader.readLine().split("\\s+");
        for (String royalGuardsName : royalGuardsNames) {
            king.addGuard(royalGuardsName, new RoyalGuard(royalGuardsName));
        }

        String[] footMenNames = reader.readLine().split("\\s+");
        for (String footMenName : footMenNames) {
            king.addGuard(footMenName, new Footman(footMenName));
        }

        String line;
        while (!"End".equals(line = reader.readLine())){
            String[] tokens = line.split("\\s+");

            switch (tokens[0].toLowerCase()){
                case "attack":
                    king.notifyGuards();
                    break;
                case "kill":
                    executor.executeCommand(new KillCommand(king, king.getGuard(tokens[1])));
                    break;
            }
        }
    }
}
