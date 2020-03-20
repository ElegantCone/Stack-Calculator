package main_package.Tests;

import main_package.Context;
import main_package.Creators.Creator;
import main_package.Creators.PopCreator;
import main_package.Exceptions.NotEnoughArgsException;
import main_package.Operations.Product;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PopperTest {

    @Test
    void pop_correct() throws Exception {
        Context context = new Context();
        context.setNums("5");

        Creator crPop = new PopCreator();
        Product prod = crPop.create();
        prod.doWork(context);

        Exception exception = assertThrows(Exception.class, () -> {
            prod.doWork(context);
        });

        String expectedMessage = "Not enough arguments";
        String actualMessage = exception.getMessage();

        assertTrue(actualMessage.contains(expectedMessage));
    }

}