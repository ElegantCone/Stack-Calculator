package main_package.Exceptions;

public class ZeroDivisionException extends Exception {
    public ZeroDivisionException(){
        super("Division by zero!");
    }
}
