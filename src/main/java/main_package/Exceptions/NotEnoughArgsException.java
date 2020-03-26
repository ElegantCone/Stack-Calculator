package main_package.Exceptions;

public class NotEnoughArgsException extends Exception {
    public NotEnoughArgsException(){
        super("Not enough arguments");
    }
}
