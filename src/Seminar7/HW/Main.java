package Seminar7.HW;

import Seminar7.HW.math.Calculable;
import Seminar7.HW.math.ComplexCalculator;
import Seminar7.HW.model.ComplexNumber;
import Seminar7.HW.model.ComplexParser;
import Seminar7.HW.model.NumberParsable;
import Seminar7.HW.view.ViewCalculator;

/**
 * 1. Написать проект калькулятор для комплексных чисел, с элементами логирования действий пользователя.
 * Достаточно сделать хотя-бы два действия.
 * 2. Продумать, какие паттерны можно использовать в вашем проекте
 */
public class Main {
    public static void main(String[] args) {
        Calculable<ComplexNumber> calculator = new ComplexCalculator();
        NumberParsable<ComplexNumber> parser = new ComplexParser();
        ViewCalculator<ComplexNumber> viewCalculator = new ViewCalculator<>(calculator, parser);
        viewCalculator.run();
    }
}
