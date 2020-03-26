package main_package.Operations;

import main_package.Context;
import main_package.Exceptions.NotDefinedException;
import main_package.Exceptions.NotEnoughArgsException;

import java.util.logging.Logger;

public class Multiplier implements Product {
    private static Logger log = Logger.getLogger(Definer.class.getName());

    public void doWork(Context context) throws NotEnoughArgsException, NotDefinedException {
        Double mul, first, second;

            if (context.getNums().size() < 2) throw new NotEnoughArgsException();
            first = context.getANumber();
            second = context.getANumber();

            mul = first * second;
        context.setNums(mul.toString());
        log.info("Multiplied successfully");
    }

    public Boolean isCorrect(Context context){
        return (context.getSplStr().length == 1);
    }

    public Multiplier(){
    }

}
