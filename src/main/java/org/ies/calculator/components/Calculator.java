package org.ies.calculator.components;

import org.ies.calculator.exception.DivideByZeroException;
import org.ies.calculator.exception.EmptyListException;

import java.util.List;

public class Calculator {
    public double divide (double num1, double num2) throws DivideByZeroException {
        if (num2 == 0){
            throw new DivideByZeroException();
        }
        return num1/num2;
    }

    public double average(List<Double> numbers) throws EmptyListException {
        if (numbers.isEmpty()) {
            throw new EmptyListException();
        } else {
            double sum = 0;
            for (double number : numbers) {
                sum += number;
            }
            return sum / numbers.size();
        }
    }
}



