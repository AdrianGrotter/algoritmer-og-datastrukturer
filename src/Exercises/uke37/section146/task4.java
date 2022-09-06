package Exercises.uke37.section146;

import eksempelklasser.Komparator;
import structure.Tabell;

public class task4 {
    public static <T> int maks(T[] a, Komparator<? super T> c){
        return maks(a, 0, a.length, c);
    }
    public static <T> int maks(T[] a, int fra, int til, Komparator<? super T> c){
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

