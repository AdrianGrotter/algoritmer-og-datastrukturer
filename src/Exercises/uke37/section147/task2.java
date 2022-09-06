package Exercises.uke37.section147;

import eksempelklasser.Komparator;
import structure.Tabell;

import java.util.Arrays;

public class task2 {
    public static void main(String[] args) {
        Double[] d = {5.7,3.14,7.12,3.9,6.5,7.1,7.11};

        Tabell.innsettingssortering(d,Komparator.naturligOrden());
        System.out.println(Arrays.toString(d));

        Tabell.innsettingssortering(d,Komparator.omvendtOrden());
        System.out.println(Arrays.toString(d));
    }
}
