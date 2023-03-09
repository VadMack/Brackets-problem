package com.vadmack.brackets;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BracketExpressionValidatorTest {

    private final BracketExpressionValidator validator = new BracketExpressionValidator();

    @Test
    void getValidBrackets1() {
        assertEquals("2 - ()", validator.getValidBrackets("(()"));
    }

    @Test
    void getValidBrackets2() {
        assertEquals("4 - ()()", validator.getValidBrackets(")()())"));
    }

    @Test
    void getValidBrackets3() {
        assertEquals("6 - (()())", validator.getValidBrackets(")(()())"));
    }

    @Test
    void getValidBrackets4() {
        assertEquals("0", validator.getValidBrackets(")("));
    }

    @Test
    void getValidBrackets5() {
        assertEquals("2 - ()", validator.getValidBrackets("()))"));
    }

    @Test
    void getValidBrackets6() {
        assertEquals("0", validator.getValidBrackets(""));
    }

    @Test
    void getValidBrackets7() {
        assertEquals("6 - (())()", validator.getValidBrackets("((())((()"));
    }

    @Test
    void getValidBrackets8() {
        assertEquals("8 - ()((()))", validator.getValidBrackets("()(((()))"));
    }

    @Test
    void getValidBrackets9() {
        assertEquals("18 - ()(((())(())))(())", validator.getValidBrackets(")(()((((())(())))((())("));
    }

    @Test
    void getValidBrackets10() {
        assertEquals("0", validator.getValidBrackets("("));
    }

}