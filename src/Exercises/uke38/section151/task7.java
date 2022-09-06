package Exercises.uke38.section151;

public class task7 {
    public static void main(String[] args) {
        int n = 5;
        int kvadratSum = kvadratsum(n);
        System.out.println("Kvadratsummen til tallet n er "+kvadratSum);
    }
    public static int kvadratsum(int n){
        if(n == 1) return 1;
        return n*n+kvadratsum(n-1);
    }
}
