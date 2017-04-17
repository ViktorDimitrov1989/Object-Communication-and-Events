package dependencyInversion;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        PrimitiveCalculator primitiveCalculator = new PrimitiveCalculator();


        String line;
        while (!"End".equals(line = reader.readLine())){
            String[] tokens = line.trim().split("\\s+");

            switch (tokens[0]){
                case "mode":
                    primitiveCalculator.changeStrategy(tokens[1]);
                    break;
                default:
                    int firstOperand = Integer.parseInt(tokens[0]);
                    int secondOperand = Integer.parseInt(tokens[1]);
                    int result = primitiveCalculator.performCalculation(firstOperand,secondOperand);
                    System.out.println(result);
                    break;
            }


        }



    }
}
