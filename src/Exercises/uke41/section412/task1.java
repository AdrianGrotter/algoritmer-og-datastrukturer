package Exercises.uke41.section412;

import java.util.Stack;

public class task1 {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(1);
        stack.push(1);
        stack.push(1);
        stack.push(1);
        stack.push(1);
        stack.push(1);

        System.out.println(stack);

        while(!stack.isEmpty()){
            stack.pop();
        }

        System.out.println(stack);
    }
}
