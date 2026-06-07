package com.mohamdy.grok150.stack;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Disabled;
import java.util.*;
import static com.mohamdy.grok150.support.Cases.*;
import static org.junit.jupiter.api.Assertions.*;

@Disabled("Solution not implemented yet.")
class EvaluateReversePolishNotationTest {
    private final EvaluateReversePolishNotation sol = new EvaluateReversePolishNotation();

    @Test void example() { assertEquals(9, sol.evalRPN(new String[]{"2", "1", "+", "3", "*"})); }
    @Test void division() { assertEquals(6, sol.evalRPN(new String[]{"4", "13", "5", "/", "+"})); }
    @Test void singleNumber() { assertEquals(42, sol.evalRPN(new String[]{"42"})); }
    @Test void negativeResult() { assertEquals(-4, sol.evalRPN(new String[]{"3", "7", "-"})); }
    @Test void truncationTowardZero() { assertEquals(-1, sol.evalRPN(new String[]{"5", "-3", "/"})); }
    @Test void complex() { assertEquals(22, sol.evalRPN(new String[]{"10", "6", "9", "3", "+", "-11", "*", "/", "*", "17", "+", "5", "+"})); }
}
