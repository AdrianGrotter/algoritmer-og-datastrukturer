package Exercises.uke39.section333;

import eksempelklasser.EnkeltLenketListe;
import eksempelklasser.Liste;

public class task2 {
    public static void main(String[] args) {
        Liste<Integer> liste = new EnkeltLenketListe<>();


        for (int i = 0; i<10; i++) liste.leggInn(i+1);
        System.out.println(liste);

        int testtall = 91;
        System.out.println("Indeks til "+testtall+": "+liste.indeksTil(testtall));

        int sjekkInneholder = 7;
        boolean inneholder = liste.inneholder(sjekkInneholder);
        if (inneholder) System.out.println("Tabellen inneholder tallet "+sjekkInneholder);
        else
            System.out.println("Tabellen inneholder ikke tallet "+sjekkInneholder);
        System.out.println(liste);
    }
}
