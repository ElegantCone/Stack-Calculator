public class Pusher implements Product{
    public void doWork(Context context){
        String str = context.getSplStr()[1];
        try {
            if (!context.isNum(str)){
                if (context.getDefines().get(str) == null) throw new NullPointerException();
            }
        }
        catch (NullPointerException e){
            System.out.println("Can't push this element (not found in defines)");
            return;
        }
        context.setNums(str);
    }

    public Boolean isCorrect(Context context){
        return (context.getSplStr().length == 2);
    }

    public Pusher(Context context){
        if (!isCorrect(context)){
            System.out.println("Wrong format");
            return;
        }
        doWork(context);
    }
}
