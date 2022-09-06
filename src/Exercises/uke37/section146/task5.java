package Exercises.uke37.section146;

import structure.Tabell;

import java.util.Arrays;

public class task5 {
    public static void main(String[] args) {
        String[] s = {"Lars","Anders","Bodil","Kari","Per","Berit","21","18","8","13","20","6","16","25","3","10"};
        Tabell.innsettingssortering(s, (s1, s2) -> {
            int a = s1.length() - s2.length();
            return a != 0 ? a : s1.compareTo(s2);
        });
        System.out.println(Arrays.toString(s));
    }
}
