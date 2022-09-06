package Exercises.uke36.section138;

import structure.Tabell;

import java.util.Arrays;

public class task7 {
    public static void main(String[] args) {

        //Sorterer i intervall

        int[] a = {10,0,4,7,8,1,2,9,5,3,6};

        System.out.println(Arrays.toString(a)+"\n");

        Tabell.innsettingssorteringIntervall(a, 3, 9);

        System.out.println(Arrays.toString(a));
    }
}
