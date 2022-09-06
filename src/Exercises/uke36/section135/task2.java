package Exercises.uke36.section135;

import structure.Tabell;

public class task2 {
    public static void main(String[] args) {
       int[] a = {3,8,10,12,14,16,21,24,27,30,32,33,34,37,40};

       int b = Tabell.lineærsøk(a, 41);
        System.out.println(b);
    }

    //Søker på verdiene 2, 15, 16, 40 og 41 og får disse resultatene:
    //-1, -6, 5, 14, 16
}
