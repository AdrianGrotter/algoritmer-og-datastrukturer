package Exercises.uke39.section322;

import eksempelklasser.Liste;
import eksempelklasser.TabellListe;

public class task2 {
    public static void main(String[] args) {
        String[] s = {"Sohil",null,"Per","Thanh","Ann","Kari","Jon",null};
        Liste<String> liste = new TabellListe<>(s);
        // liste inneholder nå: "Sohil","Per","Thanh","Ann","Kari","Jon"

        System.out.println(liste.hent(4));
        System.out.println(liste.indeksTil("Kari"));
        System.out.println(liste.inneholder("Kari"));
    }
}
