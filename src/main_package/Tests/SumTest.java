package main_package.Tests;

import main_package.Context;
import main_package.Creators.Creator;
import main_package.Operations.Product;
import main_package.Creators.SumCreator;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SumTest {
    @Test
    void sum_correct() throws Exception {
        Context context = new Context();
        context.setNums("5");
        context.setNums("3");
        Creator crSum = new SumCreator();
        Product prod = crSum.create();
        prod.doWork(context);
        double num = 3.0 + 5.0;

        assertEquals(num, context.getANumber());
    }

    @Test
    void sum_empty_stack() {
        Context context = new Context();
        Creator crSum = new SumCreator();
        Product prod = crSum.create();

        context.setNums("0");

        Exception exception = assertThrows(Exception.class, () -> {
            prod.doWork(context);
        });

        String expectedMessage = "Not enough arguments";
        String actualMessage = exception.getMessage();

        assertTrue(actualMessage.contains(expectedMessage));
    }

}