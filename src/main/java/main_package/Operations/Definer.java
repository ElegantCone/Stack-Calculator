package main_package.Operations;

import main_package.Exceptions.ArgFormatException;
import main_package.Context;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Definer implements Product {
    private static Logger log = Logger.getLogger(Definer.class.getName());

    public void doWork(Context context) throws NumberFormatException, ArgFormatException{
        Double num;
        String str;
            str = context.getSplStr()[1];
            try{
                Double.parseDouble(str);
                //Exception e = new ArgFormatException();
                //log.log(Level.SEVERE, "Define exception: " + e.getMessage());
                throw new ArgFormatException();
            }
            catch (NumberFormatException e){
                try{
                    num = Double.parseDouble(context.getSplStr()[2]);
                    context.setDefines(str, num);
                    log.info("Successfully defined: " + str + " = " + num);
                }
                catch (NumberFormatException ee){
                    //log.log(Level.SEVERE, "Define exception: " + ee.getMessage());
                    throw new ArgFormatException();
                }
            }
    }

    public Boolean isCorrect(Context context){
        return (context.getSplStr().length == 3);
    }

    public Definer(){
    }
}
