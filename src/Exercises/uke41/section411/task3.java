package Exercises.uke41.section411;

import java.util.Stack;

public class task3 {
    public static void main(String[] args) {
        Stack<Integer> a = new Stack<>();
        Stack<Integer> b = new Stack<>();
        Stack<Integer> c = new Stack<>();

        a.push(1);
        a.push(7);
        a.push(2);
        a.push(4);
        a.push(0);

        System.out.println(a);

        while (!a.isEmpty()) b.push(a.pop());
        while (!b.isEmpty()) c.push(b.pop());
        while (!c.isEmpty()) a.push(c.pop());
        System.out.println(a);

        //Flytter til b med samme rekkefølge som A
        while (!a.isEmpty()) c.push(a.pop());
        while (!c.isEmpty()) b.push(c.pop());

        System.out.println(b);
    }
}
