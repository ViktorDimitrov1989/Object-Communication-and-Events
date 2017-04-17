package dependencyInversion.strategies;

import dependencyInversion.contracts.MathStrategy;

public class DividingStrategy implements MathStrategy {

    @Override
    public int calculate(int firstOperand, int secondOperand) {
        return firstOperand / secondOperand;
    }
}
