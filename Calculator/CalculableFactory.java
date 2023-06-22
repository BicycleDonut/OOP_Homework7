package OOPhw07ComplexNumCalculator.Calculator;

import OOPhw07ComplexNumCalculator.ComplexNum;

public class CalculableFactory implements ICalculableFactory {

    @Override
    public Calculable create(ComplexNum primaryArg) {
        return new Calculator(primaryArg);
    }
}
