package main_package.Operations;

import main_package.Context;
import main_package.Exceptions.NotEnoughArgsException;

public class Popper implements Product {
    public void doWork(Context context) throws NotEnoughArgsException {
        String str;

        if (context.getNums().empty()) throw new NotEnoughArgsException();

        str = context.getNums().pop();

        System.out.println("Popped element was: " + str);
    }

    public Boolean isCorrect(Context context) {
        return (context.getSplStr().length == 1);
    }

    public Popper() {
    }
}
