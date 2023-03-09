package com.vadmack.brackets;

import java.util.ArrayDeque;
import java.util.Deque;

public class BracketExpressionValidator {

    public String getValidBrackets(String ex) {
        Deque<Integer> positionOfOpen = new ArrayDeque<>();
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < ex.length(); i++) {
            if (ex.charAt(i) == '(') {
                positionOfOpen.push(result.length());
            } else {
                if (!positionOfOpen.isEmpty()) {
                    result.insert(positionOfOpen.peek(), "(");
                    result.append(")");
                    positionOfOpen.pop();
                }
            }
        }
        return result.isEmpty() ? "0" : result.length() + " - " + result;
    }
}
