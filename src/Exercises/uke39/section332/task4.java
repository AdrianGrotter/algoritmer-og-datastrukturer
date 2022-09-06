package Exercises.uke39.section332;

import eksempelklasser.EnkeltLenketListe;
import eksempelklasser.Liste;

public class task4 {
    public static void main(String[] args) {
        Liste<Integer> liste = new EnkeltLenketListe<>();

        System.out.println("Antall verdier: "+liste.antall());
        System.out.println("Listen: "+liste);

        for (int i = 0; i<10; i++) liste.leggInn(i+1);

        System.out.println("Antall verdier: "+liste.antall());
        System.out.println("Listen: "+liste);

        System.out.println("Før nullstilling: "+liste);

        liste.nullstill();

        System.out.println("Etter nullstilling: "+liste);
    }
}
