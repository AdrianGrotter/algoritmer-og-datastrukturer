package Exercises.uke37.section142;

import structure.Tabell;

public class task1 {
    public static void main(String[] args) {
        String[] s = {"Sohil","Per","Thanh","Fatima","Kari","Jasmin"};
        int k = Tabell.maks(s);        // hvilken maks-metode?
        System.out.println(s[k]);      // Utskrift:  Thanh

        //Velger den som ikke har comparable først.
    }
}
