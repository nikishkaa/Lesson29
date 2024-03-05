package by.itstep.goutor.javalesson.lesson29.model.logic;

import org.junit.Assert;
import org.junit.Test;

// AAA
// Arrange 60%
// Act 10%
// Assert 30%

public class CalculatorTest {
    @Test
    public void testSum() {
        // Arrange
        int a = 10;
        int b = 20;
        int expected = 30;

        //act
        int actual = Calculator.sum(a, b);

        // Assert
        if (expected != actual) {
            Assert.fail();
        }
    }

    @Test
    public void testSub(){
        int a = 20;
        int b = 10;
        int expected = 10;

        int actual = Calculator.sub(a,b);

        if (expected != actual) {
            Assert.fail();
        }
    }

    @Test
    public void testMul(){
        int a = 20;
        int b = 10;
        int expected = 200;

        int actual = Calculator.mul(a,b);

        if (expected != actual) {
            Assert.fail();
        }
    }
    @Test
    public void testDiv(){
        int a = 100;
        int b = 10;
        int expected = 10;

        int actual = Calculator.div(a,b);

        if (expected != actual) {
            Assert.fail();
        }
    }

    @Test
    public void testDivByZero(){
        int a = 10;
        int b = 0;


        try{
            Calculator.div(a,b);
            Assert.fail();
        } catch (ArithmeticException exception){

        }



    }

}
