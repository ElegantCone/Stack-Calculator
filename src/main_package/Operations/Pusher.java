package main_package.Operations;

import main_package.Context;
import main_package.Exceptions.NotDefinedException;

public class Pusher implements Product{

    public void doWork(Context context) throws NotDefinedException {
        String str = context.getSplStr()[1];

            if (!context.isNum(str)){
                if (context.getDefines().get(str) == null) throw new NotDefinedException();
            }

        context.setNums(str);
    }

    public Boolean isCorrect(Context context){
        return (context.getSplStr().length == 2);
    }

    public Pusher(){
    }
}
