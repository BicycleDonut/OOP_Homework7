package OOPhw07ComplexNumCalculator.Logs;

import OOPhw07ComplexNumCalculator.Calculator.Calculable;
import OOPhw07ComplexNumCalculator.Calculator.Calculator;
import OOPhw07ComplexNumCalculator.Calculator.ICalculableFactory;
import OOPhw07ComplexNumCalculator.ComplexNum;

public class LogCalculableFactory implements ICalculableFactory {
    Logger logger;

    public LogCalculableFactory(Logger logger) {
        this.logger = logger;
    }

    @Override
    public Calculable create(ComplexNum primaryArg) {
        return new LogCalculator(new Calculator(primaryArg), logger);
    }
}
