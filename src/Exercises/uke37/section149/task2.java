package Exercises.uke37.section149;

import structure.Tabell;

import java.util.Comparator;

public class task2 {
    public static void main(String[] args) {

    }
    public static <T> void utvalgssortering(T[] a, Comparator<? super T> c)
    {
        for (int i = 0; i < a.length - 1; i++)
        {
            int m = i;             // indeks til den foreløpig minste
            T  minverdi = a[i];  // verdien til den foreløpig minste

            for (int j = i + 1; j < a.length; j++)
            {
                if (c.compare(a[j], minverdi) < 0)
                {
                    minverdi = a[j];  // ny minste verdi
                    m = j;            // indeksen til ny minste verdi
                }
            }
            // bytter om a[i] og a[m]
            T temp = a[i];
            a[i] = a[m];
            a[m] = temp;
        }
    }

    public <T> int binærsøk(T[] a, int fra, int til, T verdi, Comparator<? super T> c)
    {
        Tabell.fratilKontroll(a.length,fra,til);  // se Programkode 1.2.3 a)
        int v = fra, h = til - 1;    // v og h er intervallets endepunkter

        while (v <= h)  // fortsetter så lenge som a[v:h] ikke er tom
        {
            int m = (v + h)/2;     // heltallsdivisjon - finner midten
            T midtverdi = a[m];  // hjelpevariabel for  midtverdien

            if (c.compare(verdi, midtverdi) > 0) v = m + 1;        // verdi i a[m+1:h]
            else if (c.compare(verdi, midtverdi) < 0) h = m - 1;   // verdi i a[v:m-1]
            else return m;                                          // funnet
        }

        return -(v + 1);   // ikke funnet, v er relativt innsettingspunkt
    }

    private static <T> void kvikksortering0(T[] a, int v, int h , Comparator<? super T> c)  // en privat metode
    {
        if (v >= h) return;  // a[v:h] er tomt eller har maks ett element
        /*int k = Tabell.sParter0(a, v, h, (v + h)/2);  // bruker midtverdien
        kvikksortering0(a, v, k - 1);     // sorterer intervallet a[v:k-1]
        kvikksortering0(a, k + 1, h);     // sorterer intervallet a[k+1:h]
    }

    public static <T> void kvikksortering(int[] a, int fra, int til, Comparator<? super T> c) // a[fra:til>
    {
        Tabell.fratilKontroll(a.length, fra, til);  // sjekker når metoden er offentlig
        kvikksortering0(a, fra, til - 1);  // v = fra, h = til - 1*/
    }
}
