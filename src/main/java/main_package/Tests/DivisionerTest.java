package main_package.Tests;

import main_package.Context;
import main_package.Creators.Creator;
import main_package.Creators.DivCreator;
import main_package.Operations.Product;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DivisionerTest {

    @Test
    void div_by_zero() {
        //Scanner scanner = new Scanner("test_div_by_zero.txt");
        Context context = new Context();
        context.setNums("0");
        context.setNums("2");
        Creator crDiv = new DivCreator();
        Product prod = crDiv.create();

        Exception exception = assertThrows(Exception.class, () -> {
            prod.doWork(context);
        });

        String expectedMessage = "Division by zero!";
        String actualMessage = exception.getMessage();

        assertTrue(actualMessage.contains(expectedMessage));
    }

    @Test
    void div_correct() throws Exception {
        //Scanner scanner = new Scanner("test_div_by_zero.txt");
        Context context = new Context();
        context.setNums("5");
        context.setNums("3");
        Creator crDiv = new DivCreator();
        Product prod = crDiv.create();
        prod.doWork(context);
        double num = 3.0 / 5.0;

        assertEquals(num, context.getANumber());
    }

    @Test
    void div_empty_stack() {
        //Scanner scanner = new Scanner("test_div_by_zero.txt");
        Context context = new Context();
        Creator crDiv = new DivCreator();
        Product prod = crDiv.create();

        context.setNums("0");

        Exception exception = assertThrows(Exception.class, () -> {
            prod.doWork(context);
        });

        String expectedMessage = "Not enough arguments";
        String actualMessage = exception.getMessage();

        assertTrue(actualMessage.contains(expectedMessage));
    }
}