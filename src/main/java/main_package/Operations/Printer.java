package main_package.Operations;

import main_package.Context;
import main_package.Exceptions.NotANumberException;
import main_package.Exceptions.NotDefinedException;
import main_package.Exceptions.NotEnoughArgsException;
import main_package.Operations.Product;

import java.util.logging.Logger;

public class Printer implements Product {
    private static Logger log = Logger.getLogger(Definer.class.getName());
    public void doWork(Context context) throws NotANumberException, NotEnoughArgsException, NotDefinedException {
        Double num;
        if (context.getNums().empty()) throw new NotEnoughArgsException();
        num = context.getANumber();
        if (!context.getFlag()) throw new NotANumberException();

        System.out.println("Print: " + num);
        log.info("Printed element was: " + num + " . Success");

        context.setNums(num.toString());
    }

    public Boolean isCorrect(Context context) {
        return (context.getSplStr().length == 1);
    }

    public Printer() {
    }
}
