package com.scaler.productserviceapi;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    @DisplayName("Testing 1+2 = 3")
    void Test_WhenAddTwoNumber_Return_Sum() {
        //Arrange
        int a = 1;
        int b = 2;
        Calculator calculator = new Calculator();
        //Act
        int result = calculator.add(a,b);
        //Assert
        assertEquals(3, result);
    }

    @Test
    void subtract() {
    }

    @Test
    void multiply() {
    }

    @Test
    void Test_DivideByZero_ThrowException() {
        //Arrange
        Calculator calculator = new Calculator();
        //Act and Assert
        assertThrows(ArithmeticException.class, () -> calculator.divide(1,0));
    }
}