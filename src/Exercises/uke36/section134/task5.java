package Exercises.uke36.section134;

public class task5 {

    public static void utvalgssortering(int[] a) {/*
        for (int i = 0; i < a.length - 1; i++)
            bytt(a, i, min(a, i, a.length));  // to hjelpemetoder
    }*/

        //Lag uten hjelpemetoder


        for (int i = 0; i < a.length - 1; i++) {
            int min = i;
            int minverdi = a[i];

            for (int j = i+1; j < a.length-1;j++){
                if(a[j] < minverdi){
                    minverdi = a[j];
                    min = j;
                }
            }
            int temp = a[i];
            a[i] = a[min];
            a[min] = temp;
        }

    }
}
