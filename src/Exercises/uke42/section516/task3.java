package Exercises.uke42.section516;

import eksempelklasser.BinTre;
import eksempelklasser.Liste;
import eksempelklasser.TabellListe;

public class task3 {
    public static void main(String[] args) {
        int[] posisjon = {1,2,3,4,5,6,7,10,11,13,14,22,23,28,29};  // posisjoner og
        String[] verdi = "EIBGAHKLODNMCJF".split("");              // verdier i nivåorden

        BinTre<String> tre = new BinTre<>(posisjon, verdi);        // en konstruktør
        tre.nivåorden(c -> System.out.print(c + " "));

        Liste<String> liste = new TabellListe<>();  // en liste
        tre.nivåorden(c -> liste.leggInn(c));          // lambda-uttrykk som argument
        System.out.println("\n"+liste);                     // skriver ut listen
    }
}
