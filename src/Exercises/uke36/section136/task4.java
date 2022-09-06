package Exercises.uke36.section136;

import structure.Tabell;

public class task4 {
    public static void main(String[] args) {

        int[] a = {1, 3, 4, 4, 5, 7, 7, 8, 9, 10, 10, 12, 15, 15, 15};

        int b = binærsøk(a, 0, 14, 10);
        System.out.println(b);
    }
    public static int binærsøk(int[] a, int fra, int til, int verdi)
    {
        Tabell.fratilKontroll(a.length,fra,til);  // se Programkode 1.2.3 a)
        int v = fra, h = til - 1;  // v og h er intervallets endepunkter

        while (v < h)  // obs. må ha v < h her og ikke v <= h
        {
            int m = (v + h)/2;  // heltallsdivisjon - finner midten

            if (verdi > a[m]) v = m + 1;   // verdi må ligge i a[m+1:h]
            else  h = m;                   // verdi må ligge i a[v:m]
        }
        if (h < v || verdi < a[v]) return -(v + 1);  // ikke funnet
        else if (verdi == a[v]) return v;            // funnet
        else  return -(v + 2);                       // ikke funnet
    }

    //           --Påstanden i oppgaven stemmer--
}
