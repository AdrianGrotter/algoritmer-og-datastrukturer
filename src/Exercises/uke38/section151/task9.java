package Exercises.uke38.section151;

import structure.Tabell;

public class task9 {
    public static void main(String[] args) {
        int[] a = {32,6,54,7,9,4,21,1,3,4,98,32,123,45,6547,1,34,6};
        int biggestInt = biggestint(a, 0, a.length);
        System.out.println("Største tall er: "+a[biggestInt]);
    }
    public static int biggestint(int[] array, int v, int h){
        Integer m = (v+h)/2;
        int maksVenstre = maks(array,v,m);
        int maksHoyre = maks(array,m,h);
        return array[maksVenstre] > array[maksHoyre] ? maksVenstre : maksHoyre;
    }
    static int maks(int[] a, int  v, int h){
        return Tabell.maks(a,v,h);
    }
}
