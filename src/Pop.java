public class Pop implements Product {
    public void doWork(Context context){
        String str;
        try {
            str = context.getNums().pop();
        }
        catch (Exception e){
            System.out.println("Error! Stack is empty");
            return;
        }
        System.out.println("Popped element was: " + str);
    }

    public Boolean isCorrect(Context context){
        return (context.getSplStr().length == 1);
    }

    Pop(Context context){
        if (!isCorrect(context)){
            System.out.println("Wrong format");
            return;
        }
        doWork(context);
    }
}
