package Exercises.uke39.section334;

import eksempelklasser.EnkeltLenketListe;
import eksempelklasser.Liste;

import java.util.Iterator;

public class task2 {
    public static void main(String[] args) {
        Liste<Integer> liste = new EnkeltLenketListe<>();
        for (int i = 1; i <= 10; i++) liste.leggInn(i);

        Iterator<Integer> iterator = liste.iterator();
        //iterator.forEach(x -> System.out.print(x + " ")); Neivel...
        //Iterator.fjernHvis();
    }
}
