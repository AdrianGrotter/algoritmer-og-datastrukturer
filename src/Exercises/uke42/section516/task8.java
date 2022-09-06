package Exercises.uke42.section516;

import eksempelklasser.BinTre;

public class task8 {
    public static void main(String[] args) {
        int[] posisjon = {1,2,3,4,5,6,7,10,11,13,14,22,23,28,29};

        String s = "EIBGAHKLODNMCJF";
        Character[] verdi = new Character[s.length()];

        for (int i = 0; i<s.length(); i++){
            verdi[i] = s.charAt(i);
        }

        BinTre<Character> tre = new BinTre<>(posisjon, verdi);

        tre.nivåorden();


        char[] d = {(char)0};
        tre.nivåorden(c -> { if (c > d[0]) d[0] = c;});
        System.out.println(d[0]);
    }
}
