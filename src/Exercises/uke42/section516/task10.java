package Exercises.uke42.section516;

import eksempelklasser.BinTre;
import structure.Tabell;

import java.util.Arrays;

public class task10 {
    public static void main(String[] args) {
        int[] posisjon = {1,2,3,4,5,6,7,10,11,13,14,22,23,28,29};  // nodeposisjoner
        String[] verdi = "EIBGAHKLODNMCJF".split("");              // verdier i nivåorden

        BinTre<String> tre = new BinTre<>(posisjon, verdi);        // en konstruktør

        int[] nivåer = tre.nivåer();  // bruker Programkode 5.1.6 k)

        System.out.print("Nivåer: " + Arrays.toString(nivåer));
        System.out.println(" Treets høyde: " + (nivåer.length - 1));
    }
}
