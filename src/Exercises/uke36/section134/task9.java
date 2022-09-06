package Exercises.uke36.section134;

import structure.Tabell;

import java.util.Arrays;

public class task9 {
    public static void main(String[] args){
        int[] a = Tabell.randPerm(15);

        int[] b = utvalgssorteringIntervall(a, 3, 15);
        System.out.println(Arrays.toString(b));
    }
    public static int[] utvalgssorteringIntervall(int[] a, int fra, int til) {/*
        for (int i = 0; i < a.length - 1; i++)
            bytt(a, i, min(a, i, a.length));  // to hjelpemetoder
    }*/

        //Lag uten hjelpemetoder


        for (int i = fra; i < til - 1; i++) {
            int min = i;
            int minverdi = a[i];

            for (int j = i+1; j < til;j++){
                if(a[j] < minverdi){
                    minverdi = a[j];
                    min = j;
                }
            }
            int temp = a[i];
            a[i] = a[min];
            a[min] = temp;
        }
        return a;
    }
}
