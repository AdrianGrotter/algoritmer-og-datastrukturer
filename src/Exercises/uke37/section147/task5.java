package Exercises.uke37.section147;

import eksempelklasser.Komparator;
import structure.Tabell;

import java.util.Arrays;

public class task5 {
    public static void main(String[] args) {
        String[] s = {"Lars","Anders","Bodil","Kari","Per","Berit"};
        Tabell.innsettingssortering(s, Komparator.orden(s1 -> -s1.length())); //aaaaaaaahhhhhhhhhh

        System.out.println(Arrays.toString(s));
        // Utskrift: [Per, Kari, Lars, Berit, Bodil, Anders]
    }
}
