package kingGambitExtended;

import kingGambitExtended.commands.CommandExecutor;
import kingGambitExtended.commands.implementCommands.AttackKingCommand;
import kingGambitExtended.commands.implementCommands.KillCommand;
import kingGambitExtended.implementations.Footman;
import kingGambitExtended.implementations.KingImpl;
import kingGambitExtended.implementations.RoyalGuard;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        CommandExecutor executor = new CommandExecutor();

        String kingName = reader.readLine();
        KingImpl king = new KingImpl(kingName);

        String[] royalGuardsNames = reader.readLine().split("\\s+");
        for (String royalGuardsName : royalGuardsNames) {
            king.registerGuard("royalGuard",royalGuardsName, new RoyalGuard(royalGuardsName));
        }

        String[] footMenNames = reader.readLine().split("\\s+");
        for (String footMenName : footMenNames) {
            king.registerGuard("footman",footMenName, new Footman(footMenName));
        }

        String line;
        while (!"End".equals(line = reader.readLine())){
            String[] tokens = line.split("\\s+");

            switch (tokens[0].toLowerCase()){
                case "attack":
                    executor.executeCommand(new AttackKingCommand(king));
                    break;
                case "kill":
                    executor.executeCommand(new KillCommand(king, tokens[1]));
                    break;
            }
        }

    }
}
