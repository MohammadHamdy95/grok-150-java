package com.mohamdy.grok150.stack;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Disabled;
import static org.junit.jupiter.api.Assertions.*;

@Disabled("Solution not implemented yet.")
class EvaluateReversePolishNotationTest {
    EvaluateReversePolishNotation sol = new EvaluateReversePolishNotation();

    @Test void example() { assertEquals(9, sol.evalRPN(new String[]{"2","1","+","3","*"})); }
    @Test void example2() { assertEquals(6, sol.evalRPN(new String[]{"4","13","5","/","+"})); }
}
