package StacksAndQueues;

import java.util.ArrayDeque;
import java.util.Collections;
import java.util.Objects;
import java.util.*;

public class ReversePolishNotation {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>();

        for (String token : tokens) {

            if (isNumber(token)) {
                stack.push(Integer.parseInt(token));
            } else {

                int b = stack.pop();
                int a = stack.pop();
                int result = 0;

                switch (token) {
                    case "+":
                        result = a + b;
                        break;
                    case "-":
                        result = a - b;
                        break;
                    case "*":
                        result = a * b;
                        break;
                    case "/":
                        result = a / b;
                        break;
                }
                stack.push(result);
            }
        }

        return stack.pop();
    }


    private boolean isNumber(String token) {
        try {
            Integer.parseInt(token);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}
