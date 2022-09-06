package Exercises.uke37.section142;

import structure.Tabell;

import java.util.Arrays;

public class task2 {
    public static void main(String[] args) {
        String[] s = {"Per","Kari","Ole","Anne","Ali","Eva"};
        Tabell.innsettingssortering(s);
        System.out.println(Arrays.toString(s));  // [Ali, Anne, Eva, Kari, Ole, Per]
    }
}
