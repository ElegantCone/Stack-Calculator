public class Definer implements Product {
    public void doWork(Context context){
        Double num;
        String str;
        try{
            str = context.getSplStr()[1];
            num = Double.parseDouble(context.getSplStr()[2]);
        }
        catch (Exception e){
            return;
        }
        context.setDefines(str, num);
    }

    public Boolean isCorrect(Context context){
        return (context.getSplStr().length == 3);
    }

    public Definer(Context context){
        if (!isCorrect(context)) {
            System.out.println("Wrong format");
            return;
        }
        doWork(context);
    }
}
