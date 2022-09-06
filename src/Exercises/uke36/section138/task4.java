package Exercises.uke36.section138;

import java.util.Arrays;

import static java.lang.System.arraycopy;

public class task4 {
    //Metoden arraycopy kopierer en
    //del av et array og limer det
    //inn fra en index i et annet array

    public static void main(String[] args) {
        int[] a = {1,2,3,4,5};
        int[] b = {10, 20, 30, 40, 50, 60, 70, 80};
        arraycopy(a, 0, b, 2, 5);
        System.out.println(Arrays.toString(a)+"\n");
        System.out.println(Arrays.toString(b));

    }


}
