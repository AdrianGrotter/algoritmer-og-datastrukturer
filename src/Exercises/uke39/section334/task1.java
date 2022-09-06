package Exercises.uke39.section334;

import eksempelklasser.EnkeltLenketListe;
import eksempelklasser.Liste;

import java.util.Iterator;

public class task1 {
    public static void main(String[] args) {
        Liste<Integer> liste = new EnkeltLenketListe<>();
        for (int i = 1; i <= 10; i++) liste.leggInn(i);

        Iterator<Integer> iterator = liste.iterator();
        liste.fjern(0);   // fjerner verdi med indeks 0
        System.out.println(iterator.next());
    }
}
