package Exercises.uke39.section321;

public class task2 {
    public static void main(String[] args) {
        int[] array = {1,2,3,6,2,8,10,17,4,47,1,9,32,7,12,13,8,2};
        int antall = 0;
        for (int i : array)
            if (i > 10) antall++;

        System.out.println(antall);
    }
}
