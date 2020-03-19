import java.util.Scanner;

public class Sum implements Product {
    @Override
    public void doWork(Context context){
        Double first, second;
        Double sum;

        try {
            if (context.getNums().empty()) throw new NumberFormatException();
            first = context.getANumber();
            if (context.getNums().empty()){
                context.setNums(first.toString());
                throw new NumberFormatException();
            }
            second = context.getANumber();


            sum = first + second;
        }
        catch (Exception e){

            return;
        }
        context.setNums(sum.toString());
    }

    @Override

    public Boolean isCorrect(Context context){
        return (context.getSplStr().length == 1);
    }

    Sum(Context context){
        if (!isCorrect(context)) {
            System.out.println("Bad format");
            return;
        }
        doWork(context);
    }

}
