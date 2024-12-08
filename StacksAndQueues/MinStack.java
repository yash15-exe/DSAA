package StacksAndQueues;

import java.util.ArrayList;
import java.util.List;

class MinStack {
    List<Integer> stack;
    List<Integer> minStack;
    int min = Integer.MAX_VALUE;
    public MinStack() {
        stack = new ArrayList<>();
        minStack = new ArrayList<>();
    }

    public void push(int val) {
        stack.add(val);
        if (minStack.isEmpty()) {
            minStack.add(val);
        } else {
            minStack.add(Math.min(val, minStack.get(minStack.size() - 1)));
        }
    }

    public void pop() {
        stack.remove(stack.size()-1);
        minStack.remove(minStack.size()-1);
    }

    public int top() {
        return stack.get(stack.size()-1);
    }

    public int getMin() {
        return minStack.get(minStack.size()-1);
    }
}