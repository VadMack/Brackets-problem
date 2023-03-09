package com.vadmack.brackets;

public class Main {

    public static void main(String[] args) {

        BracketExpressionValidator validator = new BracketExpressionValidator();
        System.out.println(validator.getValidBrackets(")(()())"));
    }
}
