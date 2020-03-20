package main_package.Operations;

import main_package.Context;
import main_package.Exceptions.NotDefinedException;
import main_package.Exceptions.NotEnoughArgsException;

public class Multiplier implements Product {
    public void doWork(Context context) throws NotEnoughArgsException, NotDefinedException {
        Double mul, first, second;

            if (context.getNums().size() < 2) throw new NotEnoughArgsException();
            first = context.getANumber();
            second = context.getANumber();

            mul = first * second;
        context.setNums(mul.toString());
    }

    public Boolean isCorrect(Context context){
        return (context.getSplStr().length == 1);
    }

    public Multiplier(){
    }

}
