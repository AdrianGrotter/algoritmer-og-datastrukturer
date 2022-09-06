package Exercises.uke42.section515;

import eksempelklasser.BinTre;

import java.util.Arrays;

public class task2 {
    public static void main(String[] args) {
        String s = "DIHLOBAENGKMJFC";
        Character[] liste = new Character[s.length()];
        int[] pos = {1,2,3,5,6,7,10,11,12,13,21,24,25,42,43};

        for (int i = 0; i<s.length(); i++){
            liste[i] = s.charAt(i);
        }

        String s2 = "EIBGAHKLODNMCJF";
        Character[] liste2 = new Character[s.length()];
        int[] pos2 = {1,2,3,5,6,7,10,11,12,13,21,24,25,42,43};

        for (int i = 0; i<s.length(); i++){
            liste2[i] = s2.charAt(i);
        }
        System.out.println(Arrays.toString(liste));
        System.out.println(Arrays.toString(liste2));

        BinTre<Character> tre = new BinTre<>(pos, liste);  // den nye konstruktøren
        BinTre<Character> tre2 = new BinTre<>(pos2, liste2);  // den nye konstruktøren
    }
}
