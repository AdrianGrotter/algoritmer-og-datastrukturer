package Exercises.uke38.section157;

import structure.Tabell;

import java.util.Arrays;

public class task1 {
    public static void main(String[] args) {
        int[] a = {32,6,54,7,9,4,21,1,3,4,98,32,123,45,6547,1,34,6};
        kvikksortering0(a, 0, a.length-1);
        System.out.println(Arrays.toString(a));
    }
    private static void kvikksortering0(int[] a, int v, int h)
    {
        if (h-v > 1){
            System.out.println("Kallet med [" + v + ":" + h + "] starter!");
            if (v >= h) return;   // tomt eller maks ett element

            int k = Tabell.sParter0(a,v,h,(v + h)/2);   // se Programkode 1.3.9 f)
            kvikksortering0(a,v,k-1);
            kvikksortering0(a,k+1,h);
            System.out.println( "Kallet med [" + v + ":" + h + "] er ferdig!");
        }
    }
}
