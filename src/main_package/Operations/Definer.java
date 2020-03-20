package main_package.Operations;

import main_package.Exceptions.ArgFormatException;
import main_package.Context;

public class Definer implements Product {
    public void doWork(Context context) throws NumberFormatException, ArgFormatException{
        Double num;
        String str;
            str = context.getSplStr()[1];
            try{
                Double.parseDouble(str);
                throw new ArgFormatException();
            }
            catch (NumberFormatException e){
                try{
                    num = Double.parseDouble(context.getSplStr()[2]);
                    context.setDefines(str, num);
                }
                catch (NumberFormatException ee){
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
