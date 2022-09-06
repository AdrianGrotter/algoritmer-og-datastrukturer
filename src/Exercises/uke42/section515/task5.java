package Exercises.uke42.section515;

import eksempelklasser.BinTre;

public class task5 {
    public static void main(String[] args) {
        int[] pos = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15};
        Integer[] liste = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15};

        BinTre<Integer> tre= new BinTre<>(pos, liste);
    }
}
