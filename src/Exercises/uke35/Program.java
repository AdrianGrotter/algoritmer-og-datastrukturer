package Exercises.uke35;

import structure.Tabell;

public class Program
{
    public static void main(String ... args)      // hovedprogram
    {
        /*int[] a = Tabell.randPerm(20);              // en tilfeldig tabell
        for (int k : a) System.out.print(k + " ");  // skriver ut a

        int m = Tabell.maks(a, 4, 7);   // finner posisjonen til største verdi

        System.out.println("\nStørste verdi ligger på plass " + m);

        Tabell.fratilKontroll(a.length,2, 7);

        Tabell.skrivIntervall(a,2,7);*/

        int[] a = Tabell.randPerm(20); // tilfeldig permutasjon av 1 . . 20
        //a = new int[]{1, 2, 3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};
        int[] b = Tabell.nestMaks(a);  // metoden returnerer en tabell

        int m = b[0], nm = b[1];       // m for maks, nm for nestmaks
        Tabell.skrivln(a);        // se Oppgave 5 i Avsnitt 1.2.2
        System.out.print("Størst(" + a[m] + ") har posisjon " + m);
        System.out.println(", nest størst(" + a[nm] + ") har posisjon " + nm);

        Tabell.sortering(a);

        // Eksempel på en utskrift:

        // 12 16 15 6 10 8 9 2 14 19 5 18 20 13 3 7 11 1 4 17
        // Størst(20) har posisjon 12, nest størst(19) har posisjon 9

    } // main

} // class Program