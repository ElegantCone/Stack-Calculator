package main_package.Tests;

import main_package.Context;
import main_package.Creators.Creator;
import main_package.Creators.MulCreator;
import main_package.Operations.Product;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MultiplierTest {

    @Test
    void mul_correct() throws Exception {
        Context context = new Context();
        context.setNums("5");
        context.setNums("3");
        Creator crMul = new MulCreator();
        Product prod = crMul.create();
        prod.doWork(context);
        double num = 3.0 * 5.0;

        assertEquals(num, context.getANumber());
    }

    @Test
    void mul_empty_stack(){
        Context context = new Context();
        Creator crMul = new MulCreator();
        Product prod = crMul.create();

        context.setNums("0");

        Exception exception = assertThrows(Exception.class, () -> {
            prod.doWork(context);
        });

        String expectedMessage = "Not enough arguments";
        String actualMessage = exception.getMessage();

        assertTrue(actualMessage.contains(expectedMessage));
    }
}