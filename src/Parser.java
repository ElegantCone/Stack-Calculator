import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Scanner;
import java.util.Stack;

public class Parser {
    private Context context;

    public Parser(String filename){
        Scanner scanner = new Scanner(filename);
        this.context = new Context(scanner);
    }

    public Parser(){
        Scanner scanner = new Scanner(System.in);
        this.context = new Context(scanner);
    }

    public void doWork(){
        String str;
        Creator creator;
        int spacePst;
        Scanner scanner = context.getScanner();

        try {
            while(scanner.hasNextLine()) {
                str = scanner.nextLine();
                context.setSplStr(str);
                switch (context.getSplStr()[0]){
                    case "#":
                        continue;
                    case "SQRT":
                        creator = new SqrtCreator();
                        break;
                    case "*":
                        creator = new MulCreator();
                        break;
                    case "/":
                        creator = new DivCreator();
                        break;
                    case "+":
                        creator = new SumCreator();
                        break;
                    case "-":
                        creator = new SubCreator();
                        break;
                    case "POP":
                        creator = new PopCreator();
                        break;
                    case "PUSH":
                        creator = new PushCreator();
                        break;
                    case "DEFINE":
                        creator = new DefCreator();
                        break;
                    case "PRINT":
                        creator = new PrintCreator();
                        break;
                    default:
                        System.out.println("Command " + str + " not found");
                        continue;
                }
                creator.create(context);
                if (context.getSplStr()[0].equals("PRINT")) return;
            }
        }

        catch(Exception e){
            System.out.println("Something goes wrong");
        }
    }







}
