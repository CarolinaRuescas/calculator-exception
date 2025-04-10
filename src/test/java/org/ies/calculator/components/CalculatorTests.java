package org.ies.calculator.components;
import org.ies.calculator.exception.EmptyListException;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;


public class CalculatorTests {

    @Test
    public void averagePositiveTest() throws EmptyListException {
        // Preparación del test
        Calculator calculator = new Calculator();
        List<Double> numbers = List.of(3d, 4d, 5d);

        // Ejecución del test
        double average = calculator.average(numbers);

        // Comprobaciones
        assertEquals(4d, average);
    }

    @Test
    public void averageNegativeTest() {
        // Preparación del test
        Calculator calculator = new Calculator();
        List<Double> numbers = List.of();
        assertThrows(
                EmptyListException.class,
                () -> {
                    double average = calculator.average(numbers);
                }
        );
        // Ejecución del test

    }
}