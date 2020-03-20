package main_package;

import main_package.Exceptions.NotDefinedException;
import main_package.Exceptions.NotEnoughArgsException;

import java.util.*;

public class Context {
    //private Scanner scanner;
    private Map<String, Double> defines;
    private Stack<String> nums;
    private Boolean isNum;
    private String[] splStr;
    private Boolean isFile;

    public Context() {
        //this.scanner = scanner;
        this.defines = new HashMap<>();
        this.nums = new Stack<>();
        this.isNum = true;
        this.isFile = false;
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

    public Boolean getFlag() {
        return this.isNum;
    }

    //Get a number from stack (work with defines too) and change the flag "isNumber"

    public Double getANumber() throws NotEnoughArgsException, NotDefinedException {
        String str;
        try {
            str = this.getNums().pop();
        } catch (Exception e) {
            throw new NotEnoughArgsException();
        }

        try {
            isNum = true;
            return Double.parseDouble(str);
        } catch (NumberFormatException e) {
            isNum = true;
            try {
                return defines.get(str);
            } catch (Exception ee) {
                throw new NotDefinedException();
            }
        }
    }

    public String[] getSplStr() {
        return splStr;
    }

    public void setSplStr(String str) {
        this.splStr = str.split(" ");
    }

    public Boolean isNum(String str) {
        try {
            Double.parseDouble(str);
        } catch (Exception e) {
            return false;
        }
        return true;
    }

    public void setFile() {
        this.isNum = true;
    }

    public Boolean isFile() {
        return this.isFile;
    }

}

