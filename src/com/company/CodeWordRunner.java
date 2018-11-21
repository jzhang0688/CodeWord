package com.company;

public class CodeWordRunner {
    public static void main(String[] args)
    {
        StringChecker sc1 = new CodeWordChecker(5,6,"$");


        System.out.println(sc1.isValid("happy"));
        System.out.println(sc1.isValid("happy$"));
        System.out.println(sc1.isValid("Code"));
        System.out.println(sc1.isValid("happyCode"));



    }
}
