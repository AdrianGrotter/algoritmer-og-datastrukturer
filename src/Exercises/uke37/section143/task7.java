package Exercises.uke37.section143;

import structure.Tabell;

import java.util.Arrays;

public class task7 {
    public static void main(String[] args) {
        double[] d = {5.7,3.14,7.12,3.9,6.5,7.1,7.11};
        Double[] a = new Double[d.length];

        for (int i = 0; i<d.length; i++) a[i] = d[i];
        System.out.println(Arrays.toString(a));

        Tabell.innsettingssortering(a);
        System.out.println(Arrays.toString(a));

    }
}
