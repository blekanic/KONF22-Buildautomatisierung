package org.campus02.lekanic;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BMICalculatorTest {

    private BMICalculator bmiCalculator;

    @BeforeEach
    void setUp() {
        bmiCalculator = new BMICalculator(180,1.80);
    }

    @Test
    @DisplayName("Konstruktor Test")
    void testConstructor(){
        Assertions.assertEquals(180,bmiCalculator.getWeightInKG());
        Assertions.assertEquals(1.8,bmiCalculator.getHeightInM());
    }

    @Test
    void result() {
        String result = bmiCalculator.result();
        Assertions.assertEquals("obese",result);
    }
}