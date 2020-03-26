package main_package.Operations;

import main_package.Context;
import main_package.Exceptions.NotDefinedException;
import main_package.Exceptions.NotEnoughArgsException;

import java.util.logging.Logger;

public class Substracter implements Product {
    private static Logger log = Logger.getLogger(Definer.class.getName());

    public Substracter() {
    }

    public void doWork(Context context) throws NotEnoughArgsException, NotDefinedException {
        Double first, second, sub;

        if (context.getNums().size() < 2) throw new NotEnoughArgsException();
        first = context.getANumber();
        second = context.getANumber();

        sub = first - second;

        context.setNums(sub.toString());
        log.info("Substract successfully");
    }

    public Boolean isCorrect(Context context) {
        return (context.getSplStr().length == 3);
    }
}
