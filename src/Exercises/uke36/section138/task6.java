package Exercises.uke36.section138;

import structure.Tabell;

public class task6 {
    public static void main(String[] args) {

        int[] a = Tabell.randPerm(100000);

        long tid = 0;

        tid = System.currentTimeMillis();
        Tabell.innsettingssortering(a);
        tid = System.currentTimeMillis() - tid;
        System.out.println("Tidsforbruk innsettingssortering: "+tid);

        a = Tabell.randPerm(100000);

        tid = System.currentTimeMillis();
        Tabell.utvalgssortering(a);
        tid = System.currentTimeMillis() - tid;
        System.out.println("Tidsforbruk utvalgssortering: "+tid);
    }
}
