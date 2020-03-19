public class Mul implements Product {
    public void doWork(Context context){
        Double mul, first, second;
        try {
            if (context.getNums().empty()) throw new NumberFormatException();
            first = context.getANumber();
            if (context.getNums().empty()){
                context.setNums(first.toString());
                throw new NumberFormatException();
            }
            second = context.getANumber();

            mul = first * second;
        }
        catch (Exception e){
            return;
        }
        context.setNums(mul.toString());
    }

    public Boolean isCorrect(Context context){
        return (context.getSplStr().length == 1);
    }

    Mul(Context context){
        if (!isCorrect(context)){
            System.out.println("Wrong format");
            return;
        }
        doWork(context);
    }

}
