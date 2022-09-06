package Exercises.uke42.section515;

import eksempelklasser.BinTre;

public class task4 {
    public static void main(String[] args) {
        int[] pos = {5,23,2,10,3,11,47,1,22,44};

        Integer[] liste = {4,8,2,5,3,6,10,1,7,9};

        BinTre<Integer> tre = new BinTre<>(pos, liste);  // den nye konstruktøren
    }
}
