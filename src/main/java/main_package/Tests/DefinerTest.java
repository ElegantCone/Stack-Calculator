package main_package.Tests;

import main_package.Context;
import main_package.Creators.Creator;
import main_package.Creators.DefCreator;
import main_package.Operations.Product;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DefinerTest {

    @Test
    void def_correct() throws Exception {
        Context context = new Context();
        Creator crDef = new DefCreator();
        Product prod = crDef.create();
        context.setSplStr("DEFINE n 4");
        prod.doWork(context);
        assertEquals(4, context.getDefines().get("n"));
    }

    @Test
    void def_BadArg() {
        Context context = new Context();
        Creator crDef = new DefCreator();
        Product prod = crDef.create();
        context.setSplStr("DEFINE n n");

        Exception exception = assertThrows(Exception.class, () -> {
            prod.doWork(context);
        });

        String expectedMessage = "First argument must be a string, second - a number";
        String actualMessage = exception.getMessage();

        assertTrue(actualMessage.contains(expectedMessage));

        context.setSplStr("DEFINE 4 n");

        exception = assertThrows(Exception.class, () -> {
            prod.doWork(context);
        });

        expectedMessage = "First argument must be a string, second - a number";
        actualMessage = exception.getMessage();

        assertTrue(actualMessage.contains(expectedMessage));

        context.setSplStr("DEFINE 4 4");

        exception = assertThrows(Exception.class, () -> {
            prod.doWork(context);
        });

        expectedMessage = "First argument must be a string, second - a number";
        actualMessage = exception.getMessage();

        assertTrue(actualMessage.contains(expectedMessage));

    }

}