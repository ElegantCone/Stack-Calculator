public class Divisioner implements Product {
    public void doWork(Context context){
        Double first, second;
        Double div;

        try {
            if (context.getNums().empty()) throw new NumberFormatException();
            first = context.getANumber();
            if (context.getNums().empty()){
                context.setNums(first.toString());
                throw new NumberFormatException();
            }
            second = context.getANumber();

            div = first / second;
        }
        catch (Exception e){
            return;
        }
        context.setNums(div.toString());
    }

    public Boolean isCorrect(Context context){
        return (context.getSplStr().length == 1);
    }

    Divisioner(Context context){
        if (!isCorrect(context)){
            System.out.println("Bad format");
            return;
        }
        doWork(context);
    }
}
