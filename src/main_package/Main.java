package main_package;

public class Main {

    public static void main(String[] args){
        Parser parser;
        try{
            if (args.length == 0)
                parser = new Parser();
            else
                parser = new Parser(args[0]);

            parser.doWork();
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
