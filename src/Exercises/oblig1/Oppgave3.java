package Exercises.oblig1;

import structure.Tabell;

import java.util.HashSet;
import java.util.NoSuchElementException;
import java.util.Set;

public class Oppgave3 {
    public static void main(String[] args) {
        int[] a = {1, 2, 2, 2, 2, 2, 3};
        int antall = antallUlike(a);
        System.out.println("Antall ulike: " + antall);
    }

    public static int antallUlike(int[] a) {
        if (a.length == 0) return 0;
        int antall = 0;

        int maksverdi = a[0];

        for (int i = 1; i < a.length; i++) {
            if (a[i] > maksverdi) {
                maksverdi = a[i];
            }
        }

        int i = 0;
        while (i <= maksverdi) {
            for (int j : a) {
                if (j == i) {
                    antall++;
                    break;
                }
            }
            i++;
        }

        return antall;
    }
}
