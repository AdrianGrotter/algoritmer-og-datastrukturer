package Exercises.uke41.section411;

import java.util.Stack;

public class task1 {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<Integer>();
        stack.push(5);
        stack.push(7);
        stack.pop();
        stack.push(3);
        stack.push(7);
        stack.pop();
        System.out.println(stack);
    }
}
