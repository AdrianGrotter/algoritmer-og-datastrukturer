package Exercises.uke37.section148;

import eksempelklasser.Komparator;
import structure.Tabell;

import java.util.Arrays;

public class task4 {
    public static void main(String[] args) {

        String[] s = {"Lars","Anders","Bodil","Kari","Per","Berit"};
        s = new String[] {"21", "18", "8", "13", "20", "6", "16", "25", "3", "10"};
        //Tabell.innsettingssortering(s, Komparator.orden(String::length).deretter(s1 -> s2)); //Kanskje s1.compareTo(s2)?

        System.out.println(Arrays.toString(s));
        // Utskrift: [Per, Kari, Lars, Berit, Bodil, Anders]
    }
}
