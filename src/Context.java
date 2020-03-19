import java.util.*;

class Context {
    private Scanner scanner;
    private Map<String, Double> defines;
    private Stack<String> nums;
    private boolean isNum;
    private String[] splStr;

    Context(Scanner scanner){
        this.scanner = scanner;
        this.defines = new HashMap <String, Double>();
        this.nums = new Stack<String>();
        this.isNum = true;
    }

    public Scanner getScanner() {
        return scanner;
    }

    public void setScanner(Scanner scanner) {
        this.scanner = scanner;
    }

    public Map<String, Double> getDefines() {
        return defines;
    }

    public void setDefines(String str, Double num) {
        this.defines.put(str, num);
    }

    public Stack<String> getNums() {
        return nums;
    }

    public void setNums(String str) {
        this.nums.push(str);
    }

    public boolean getFlag(){
        return this.isNum;
    }

    //Get a number from stack (work with defines too) and change the flag "isNumber"

    public Double getANumber(){
        String str = "EMPTY";
        try{
            str = this.getNums().pop();
            try {
                isNum = true;
                return Double.parseDouble(str);
            }
            catch(NumberFormatException e){
                isNum = true;
                return defines.get(str);
            }
        }
        catch (EmptyStackException e){
            System.out.println("Exception! Stack is empty");
            isNum = false;
            return -1.0;
        }
        catch (NullPointerException e){
            System.out.println("Exception! Can't find define of " + str);
            isNum = false;
            return -1.0;
        }
    }

    public String[] getSplStr() {
        return splStr;
    }

    public void setSplStr(String str) {
        this.splStr = str.split(" ");
    }

    public Boolean isNum(String str){
        Double num;
        try{
            num = Double.parseDouble(str);
        }
        catch (Exception e){
            return false;
        }
        return true;
    }

}

