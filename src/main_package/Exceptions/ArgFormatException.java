package main_package.Exceptions;

public class ArgFormatException extends Exception {
    public ArgFormatException(){
        super("First argument must be a string, second - a number");
    }
}
