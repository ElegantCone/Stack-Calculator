package main_package.Tests;

import main_package.Context;
import main_package.Creators.Creator;
import main_package.Creators.PrintCreator;
import main_package.Operations.Product;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PrinterTest {
    @Test
    void print_correct() throws Exception {
        Context context = new Context();
        context.setNums("5");
        Creator crPrint = new PrintCreator();
        Product prod = crPrint.create();
        prod.doWork(context);

        assertEquals(5.0, context.getANumber());
    }

    @Test
    void print_empty_stack() {
        Context context = new Context();
        Creator crPrint = new PrintCreator();
        Product prod = crPrint.create();

        Exception exception = assertThrows(Exception.class, () -> {
            prod.doWork(context);
        });

        String expectedMessage = "Not enough arguments";
        String actualMessage = exception.getMessage();

        assertTrue(actualMessage.contains(expectedMessage));
    }
}
