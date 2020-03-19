public class Printer implements Product {
    public void doWork(Context context){
        Double num;
        try {
            num = context.getANumber();
            if (!context.getFlag()) throw new Exception();
        }
        catch (Exception e){
            return;
        }
        System.out.println("Print: " + num);
        context.setNums(num.toString());
    }

    public Boolean isCorrect(Context context){
        return (context.getSplStr().length == 1);
    }

    public Printer(Context context){
        if (!isCorrect(context)){
            System.out.println("Wrong format");
            return;
        }
        doWork(context);
    }
}
