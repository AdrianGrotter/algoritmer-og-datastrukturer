package Exercises.uke37.section149;

import eksempelklasser.Komparator;
import structure.Tabell;

import java.util.Arrays;
import java.util.Comparator;

public class task1 {
    public static void main(String[] args) {
        String[] s = {"Sohil","Per","Thanh","Ann","Kari","Jon"};       // String-tabell
        Comparator<String> c =  Comparator.comparing(String::length);  // etter lengde

        innsettingssortering(s, c.thenComparing(x -> x));       // vanlig orden
        System.out.println(Arrays.toString(s));                        // skriver ut
        System.out.println(maks(s, 0, s.length, c));// skriver ut
    }
    public static <T> void innsettingssortering(T[] a, Comparator<? super T> c)
    {
        for (int i = 1; i < a.length; i++)  // starter med i = 1
        {
            T verdi = a[i];        // verdi er et tabellelemnet
            int  j = i - 1;        // j er en indeks

            // sammenligner og forskyver:
            for (; j >= 0 && c.compare(verdi,a[j]) < 0 ; j--) a[j+1] = a[j];

            a[j + 1] = verdi;      // j + 1 er rett sortert plass
        }
    }

    public static <T> int maks(T[] a, int fra, int til, Comparator<? super T> c){
        Tabell.fratilKontroll(a.length, fra, til);
        int maksindex = 0;
        T maksverdi = a[fra]; //T fordi det kan være int, string, double etc...

        for (int i = maksindex + 1; i < til; i++){
            if (c.compare(a[i], maksverdi) > 0){
                maksindex = i;
                maksverdi = a[i];
            }
        }
        return maksindex;
    }
}
