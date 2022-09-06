package Exercises.uke41.section411;

import java.util.Stack;

public class task4 {
    public static void main(String[] args) {
        Stack<Integer> a = new Stack<>();
        Stack<Integer> b = new Stack<>();

        a.push(1);
        a.push(7);
        a.push(2);
        a.push(4);
        a.push(0);
        System.out.println(a);
        snu(a, b);
        System.out.println(a);

    }

    public static void snu(Stack<Integer> a, Stack<Integer> b){
        int antall = 0;
        int teller = 0;
        while(antall < 5){
            antall++;
            metode(a, b, teller);
            teller++;
        }
    }
    public static void metode(Stack<Integer> a, Stack<Integer> b, int teller){
        int c = a.pop();
        int counter = a.size();
        while(counter > teller){
            b.push(a.pop());
            counter--;
        }
        a.push(c);
        while(!b.isEmpty()) a.push(b.pop());
    }
}
