package Exercises.uke41.section422;

import eksempelklasser.Kø;
import eksempelklasser.Stakk;
import eksempelklasser.TabellKø;
import eksempelklasser.TabellStakk;

public class section422 {
    public static void main(String[] args) {
        Kø<Character> s = new TabellKø<>();
        s.leggInn('A');
        s.leggInn('B');
        s.leggInn('C');
        System.out.println(s);
    }
}
