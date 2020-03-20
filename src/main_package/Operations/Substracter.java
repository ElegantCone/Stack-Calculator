package main_package.Operations;

import main_package.Context;
import main_package.Exceptions.NotDefinedException;
import main_package.Exceptions.NotEnoughArgsException;

public class Substracter implements Product {
    public Substracter() {
    }

    public void doWork(Context context) throws NotEnoughArgsException, NotDefinedException {
        Double first, second, sub;

        if (context.getNums().size() < 2) throw new NotEnoughArgsException();
        first = context.getANumber();
        second = context.getANumber();

        sub = first - second;

        context.setNums(sub.toString());
    }

    public Boolean isCorrect(Context context) {
        return (context.getSplStr().length == 3);
    }
}
