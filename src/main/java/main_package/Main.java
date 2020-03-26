package main_package;


import java.io.IOException;
import java.util.logging.LogManager;

public class Main {

    public static void main(String[] args){
        try {
            LogManager.getLogManager().readConfiguration(
                    Main.class.getResourceAsStream("/log4j.properties"));
        } catch (IOException e) {
            System.err.println("Could not setup logger configuration: " + e.toString());
        }

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
