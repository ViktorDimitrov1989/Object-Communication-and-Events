package kingGambit;

import kingGambit.commands.Command;
import kingGambit.commands.CommandExecutor;
import kingGambit.commands.implementCommands.AttackKingCommand;
import kingGambit.commands.implementCommands.KillCommand;
import kingGambit.implementations.Footman;
import kingGambit.implementations.King;
import kingGambit.implementations.RoyalGuard;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        CommandExecutor executor = new CommandExecutor();
        Command command;

        String kingName = reader.readLine();
        King king = new King(kingName);

        String[] royalGuardsNames = reader.readLine().split("\\s+");
        for (String royalGuardsName : royalGuardsNames) {
            king.register(new RoyalGuard(royalGuardsName));
        }

        String[] footMenNames = reader.readLine().split("\\s+");
        for (String footMenName : footMenNames) {
            king.register(new Footman(footMenName));
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
