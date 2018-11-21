package com.company;

public class CodeWordChecker implements StringChecker{
    private int min;
    private int max;
    private String symbol;
    public CodeWordChecker(int min, int max, String symbol)
    {
        this.min = min;
        this.max = max;
        this.symbol = symbol;
    }
    public boolean isValid()
    {
        if(str.length()<min || str.lentgh() > max || str.contains(symbol))
        {
            return false;
        }
        else
        {
            return true;
        }
    }
}
