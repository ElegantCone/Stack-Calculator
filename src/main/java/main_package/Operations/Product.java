package main_package.Operations;

import main_package.Context;
public interface Product {
    void doWork(Context context) throws Exception;
    Boolean isCorrect(Context context);
}
