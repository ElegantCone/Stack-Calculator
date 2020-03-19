public class Sub implements Product{
    Sub(Context context){
        if (!isCorrect(context)){
            System.out.println("Wrong format!");
            return;
        }
        doWork(context);
    }

    public void doWork(Context context){
        Double first, second, sub;
        try {
            if (context.getNums().empty()) throw new NumberFormatException();
            first = context.getANumber();
            if (context.getNums().empty()){
                context.setNums(first.toString());
                throw new NumberFormatException();
            }
            second = context.getANumber();

            sub = first - second;
        }
        catch (Exception e){
            return;
        }

        context.setNums(sub.toString());
    }

    public Boolean isCorrect(Context context){
        return (context.getSplStr().length == 3);
    }
}
