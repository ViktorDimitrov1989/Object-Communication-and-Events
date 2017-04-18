package dependencyInversion;


import dependencyInversion.contracts.Strategy;
import dependencyInversion.strategies.AdditionStrategy;
import dependencyInversion.strategies.DividingStrategy;
import dependencyInversion.strategies.MultiplyingStrategy;
import dependencyInversion.strategies.SubtractionStrategy;

public class PrimitiveCalculator {
    private Strategy strategy;

    public PrimitiveCalculator(){
        this.strategy = new AdditionStrategy();
    }

    public void changeStrategy(String operator){
        switch (operator){
            case "+":
                this.strategy = new AdditionStrategy();
                break;
            case "-":
                this.strategy = new SubtractionStrategy();
                break;
            case "/":
                this.strategy = new DividingStrategy();
                break;
            case "*":
                this.strategy = new MultiplyingStrategy();
                break;
        }
    }

    public int performCalculation(int firstOperand, int secondOperand){
        return this.strategy.calculate(firstOperand,secondOperand);
    }
}
