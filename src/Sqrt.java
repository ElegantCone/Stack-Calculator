import java.util.Map;
import java.util.Stack;

import static java.lang.Math.sqrt;

public class Sqrt implements Product {
    @Override
    //Get a number from context and find sqrt of it (if possible, else - ignore)
    public void doWork(Context context) {
        Double num = -1.0;
        try {
            num = context.getANumber();
            if (!context.getFlag()) throw new NumberFormatException("Stack can be empty");
            if (num < 0.0) throw new NegativeNumberException("SQRT can't work with negative numbers");
            num = sqrt(num);

        }
        catch (NegativeNumberException e){
            System.out.println(e.getMessage());
            context.setNums(num.toString());
            return;
        }
        catch (NumberFormatException e){
            System.out.println(e.getMessage());
            return;
        }
        context.setNums(num.toString());
    }

    public Boolean isCorrect(Context context){
        return (context.getSplStr().length == 1);
    }

    Sqrt(Context context){
        if (!isCorrect(context)) {
            System.out.println("Wrong format of string");
            return;
        }
        doWork(context);
    }
}
