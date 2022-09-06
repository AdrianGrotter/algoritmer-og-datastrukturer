package Exercises.uke37.section144;

import eksempelklasser.Heltall;
import structure.Tabell;

import java.util.Arrays;

public class task1 {
    public static void main(String[] args) {
        int[] a = {5,2,7,3,9,1,8,10,4,6};          // en int-tabell
        Heltall[] h = new Heltall[a.length];       // en Heltall-tabell

        for (int i = 0; i < h.length; i++) h[i] = new Heltall(a[i]);
        Tabell.innsettingssortering(h);           // generisk sortering
        System.out.println(Arrays.toString(h));   // utskrift

        /*Heltall x = new Heltall(3), y = new Heltall(3);  // x og y er like
        System.out.println(x.compareTo(y) + "  " + x.equals(y));*/

        Heltall x = new Heltall(3), y = new Heltall(3);  // x og y er like
        System.out.println(x.hashCode() + "  " + y.hashCode());
    }
}
