package StacksAndQueues;

import java.util.Stack;

public class ValidParanthesis {

    public boolean isValid(String s) {


        Stack<Character> stack = new Stack<>();
        for(char ch:s.toCharArray()){
            if (ch == '('||ch=='{'||ch=='['){
                stack.push(ch);
                continue;
            }
            else{
                if (stack.isEmpty())return false;
            }
            if (ch == ')' && stack.peek() != '(') {
                return false;
            }
            if(ch == '}'&&stack.peek()!='{'){
                return false;
            }
            if(ch == ']'&&stack.peek()!='['){
                return false;
            }
            stack.pop();


        }
        return stack.isEmpty();
    }
}
