package Exercises.uke36.section134;

import java.util.Arrays;
import structure.Tabell;

public class task3 {
    public static void main(String[] args){
        int[] a = Tabell.randPerm(10);
        int[] b = Tabell.utvalgssortering(a);
        System.out.print(Arrays.toString(b));
    }


}
