package main_package.Tests;

import main_package.Context;
import main_package.Creators.Creator;
import main_package.Operations.Product;
import main_package.Creators.SqrtCreator;
import org.junit.jupiter.api.Test;

import static java.lang.Math.sqrt;
import static org.junit.jupiter.api.Assertions.*;

class SqrtTest {
    @Test
    void sqrt_correct() throws Exception {
        Context context = new Context();
        context.setNums("5");
        Creator crSqrt = new SqrtCreator();
        Product prod = crSqrt.create();
        prod.doWork(context);
        double num = sqrt(5.0);

        assertEquals(num, context.getANumber());
    }

    @Test
    void sqrt_emptyStack() {
        Context context = new Context();
        Creator crSqrt = new SqrtCreator();
        Product prod = crSqrt.create();

        Exception exception = assertThrows(Exception.class, () -> {
            prod.doWork(context);
        });

        String expectedMessage = "Not enough arguments";
        String actualMessage = exception.getMessage();

        assertTrue(actualMessage.contains(expectedMessage));
    }

    @Test
    void sqrt_negativeNums() {
        Context context = new Context();
        Creator crSqrt = new SqrtCreator();
        Product prod = crSqrt.create();

        context.setNums("-1.0");

        Exception exception = assertThrows(Exception.class, () -> {
            prod.doWork(context);
        });

        String expectedMessage = "Can't work with negative numbers";
        String actualMessage = exception.getMessage();

        assertTrue(actualMessage.contains(expectedMessage));
    }
}