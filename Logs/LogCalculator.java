package OOPhw07ComplexNumCalculator.Logs;

import OOPhw07ComplexNumCalculator.Calculator.Calculable;
import OOPhw07ComplexNumCalculator.ComplexNum;

public class LogCalculator implements Calculable {
    private Calculable calculable;
    private Logger logger;

    public LogCalculator(Calculable calculable, Logger logger) {
        this.calculable = calculable;
        this.logger = logger;
        logger.writeLog("Calculable first complex number:\t" + getResult());
    }

    @Override
    public Calculable sum(ComplexNum complexNum) {
        logger.writeLog("Finding the sum  with complex number: \t:" + complexNum);
        return calculable.sum(complexNum);
    }

    @Override
    public Calculable multi(ComplexNum complexNum) {
        logger.writeLog("Finding the product with complex number: \t:" + complexNum);
        return calculable.multi(complexNum);
    }

    @Override
    public ComplexNum getResult() {
        ComplexNum result = calculable.getResult();
        logger.writeLog("Getting result: \t" + result);
        return result;
    }
}
