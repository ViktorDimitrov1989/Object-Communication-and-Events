package dependencyInversion.strategies;

import dependencyInversion.contracts.Strategy;

public class MultiplyingStrategy implements Strategy {
    @Override
    public int calculate(int firstOperand, int secondOperand) {
        return firstOperand * secondOperand;
    }
}
