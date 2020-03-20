package main_package.Operations;

import main_package.Context;
import main_package.Exceptions.NotDefinedException;
import main_package.Exceptions.NotEnoughArgsException;

public class Summator implements Product {
    @Override
    public void doWork(Context context) throws NotEnoughArgsException, NotDefinedException {
        Double first, second;
        Double sum;

        if (context.getNums().size() < 2) throw new NotEnoughArgsException();
        first = context.getANumber();
        second = context.getANumber();

        sum = first + second;

        context.setNums(sum.toString());
    }

    @Override

    public Boolean isCorrect(Context context) {
        return (context.getSplStr().length == 1);
    }

    public Summator() {

    }

}
