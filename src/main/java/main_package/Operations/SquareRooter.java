package main_package.Operations;

import main_package.Context;
import main_package.Exceptions.NegativeNumberException;
import main_package.Exceptions.NotDefinedException;
import main_package.Exceptions.NotEnoughArgsException;

import java.util.logging.Logger;

import static java.lang.Math.sqrt;

public class SquareRooter implements Product {
    private static Logger log = Logger.getLogger(Definer.class.getName());

    //Get a number from context and find sqrt of it (if possible, else - ignore)
    public void doWork(Context context) throws NegativeNumberException, NotDefinedException, NotEnoughArgsException {
        Double num;

        num = context.getANumber();
        if (num < 0.0) {
            context.setNums(num.toString());
            throw new NegativeNumberException();
        }
        num = sqrt(num);
        context.setNums(num.toString());

        log.info("Sqrt successfully");
    }

    public Boolean isCorrect(Context context) {
        return (context.getSplStr().length == 1);
    }

    public SquareRooter() {

    }
}
