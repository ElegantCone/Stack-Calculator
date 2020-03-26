package main_package.Tests;

import main_package.Context;
import main_package.Creators.Creator;
import main_package.Creators.PushCreator;
import main_package.Operations.Product;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PusherTest {
    @Test
    void push_correct() throws Exception {
        Context context = new Context();
        Creator crPush = new PushCreator();
        Product prod = crPush.create();
        context.setSplStr("PUSH 4");
        prod.doWork(context);

        assertEquals(4.0, context.getANumber());
    }

    @Test
    void push_BadArg() {
        Context context = new Context();
        Creator crPush = new PushCreator();
        Product prod = crPush.create();
        context.setSplStr("PUSH n");

        Exception exception = assertThrows(Exception.class, () -> {
            prod.doWork(context);
        });

        String expectedMessage = "Not defined";
        String actualMessage = exception.getMessage();

        assertTrue(actualMessage.contains(expectedMessage));

    }

    @Test
    void push_defArg() throws Exception {
        Context context = new Context();
        Creator crPush = new PushCreator();
        Product prod = crPush.create();
        context.setDefines("n", 4.0);
        context.setSplStr("PUSH n");

        prod.doWork(context);

        assertEquals(4.0, context.getANumber());
    }

}
