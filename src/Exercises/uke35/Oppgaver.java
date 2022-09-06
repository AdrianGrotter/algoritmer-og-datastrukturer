package Exercises.uke35;

import structure.Tabell;

import java.util.Arrays;

public class Oppgaver {
    public static void main(String[] args){
        int[] a = Tabell.randPerm(10);
        int minsteverdi = Tabell.min(a);
        System.out.println("Tabell: "+ Arrays.toString(a)+"\nMinste verdi: "+a[minsteverdi]);
    }
}
