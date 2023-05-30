package Seminar7.HW.math;

import Seminar7.HW.model.ComplexNumber;
import Seminar7.HW.util.ConsoleLogger;
import Seminar7.HW.util.Logger;

public class ComplexCalculator implements Calculable<ComplexNumber> {
    private static final Logger logger = new ConsoleLogger();

    @Override
    public ComplexNumber addition(ComplexNumber first, ComplexNumber second) {
        double actualPart = first.getActualPart() + second.getActualPart();
        double imaginaryPart = first.getImaginaryPart() + second.getImaginaryPart();
        ComplexNumber result = new ComplexNumber(actualPart, imaginaryPart);
        logger.log(String.format("Сложение: %s + %s = %s", first, second, result));
        return result;
    }

    @Override
    public ComplexNumber subtraction(ComplexNumber first, ComplexNumber second) {
        double actualPart = first.getActualPart() - second.getActualPart();
        double imaginaryPart = first.getImaginaryPart() - second.getImaginaryPart();
        ComplexNumber result = new ComplexNumber(actualPart, imaginaryPart);
        logger.log(String.format("Вычитание: %s - %s = %s", first, second, result));
        return result;
    }
}
