package dependencyInversion.strategies;

import dependencyInversion.contracts.Strategy;

public class DividingStrategy implements Strategy {

    @Override
    public int calculate(int firstOperand, int secondOperand) {
        return firstOperand / secondOperand;
    }
}
