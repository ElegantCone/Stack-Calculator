package main_package.Operations;

import main_package.Context;
import main_package.Exceptions.NotDefinedException;
import main_package.Exceptions.NotEnoughArgsException;
import main_package.Exceptions.ZeroDivisionException;


public class Divisioner implements Product {
    public void doWork(Context context) throws ZeroDivisionException, NotEnoughArgsException, NotDefinedException {
        Double first, second;
        Double div;

        if (context.getNums().size() < 2) throw new NotEnoughArgsException();
        first = context.getANumber();
        second = context.getANumber();

        if (second == 0) throw new ZeroDivisionException();

        div = first / second;

        context.setNums(div.toString());



//        if (context.getNums().empty()) throw new NotEnoughArgsException();
//
//        first = context.getANumber();
//
//        if (context.getNums().empty()) {
//            context.setNums(first.toString());
//            throw new NotEnoughArgsException();
//        }
//
//        second = context.getANumber();
//
//        if (second == 0) {
//            context.setNums(second.toString());
//            context.setNums(first.toString());
//            throw new ZeroDivisionException();
//        }
//        div = first / second;
//        context.setNums(div.toString());
    }

    public Boolean isCorrect(Context context) {
        return (context.getSplStr().length == 1);
    }

    public Divisioner() {
    }
}
