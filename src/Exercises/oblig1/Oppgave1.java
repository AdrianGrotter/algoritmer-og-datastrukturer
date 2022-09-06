package Exercises.oblig1;

import java.util.Arrays;

public class Oppgave1 {
    public static void main(String[] args) {
        int[] a = {1,2,3,4,5,6,7,8,9,10};
        int[] b = {10,9,8,7,6,5,4,3,2,1};
        int sum = maks(b);
        System.out.println("Antall ombyttinger: "+sum);
    }
    public static int maks(int[] a){

        System.out.println("Usortert array "+Arrays.toString(a));
        int ombyttinger = 0;
        for (int j = 0; j < a.length-1; j++){
            for (int i = 0; i < a.length-1; ++i){
                if(a[i] > a[i+1]){
                    bytt(a, i, i+1);
                    ombyttinger++;
                }
            }
        }

        System.out.println("Sortert array "+Arrays.toString(a));
        return ombyttinger;
    }
    public static void bytt(int[] a, int i, int j){
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }
}
/*
* Et ferdigsortert array, altså 1-10 gir 0 ombyttinger.
* Et motsatt array 10-1 gir maks ombyttinger, altså 45
* */