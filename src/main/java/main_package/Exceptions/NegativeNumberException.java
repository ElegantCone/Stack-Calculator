package main_package.Exceptions;

public class NegativeNumberException extends Exception {
    public NegativeNumberException(){
        super("Can't work with negative numbers");
    }
}
