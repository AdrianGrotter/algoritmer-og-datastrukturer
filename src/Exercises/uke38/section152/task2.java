package Exercises.uke38.section152;

public class task2 {
    public static void main(String[] args) {
        System.out.println("main() starter!");
        euklid(2, 100);
        System.out.println("main() er ferdig!");

    }

    public static int euklid(int a, int b) {
        System.out.println("euklid("+a+", "+b+") starter!");
        if (b == 0) return a;
        int r = a % b;            // r er resten
        System.out.println("euklid("+a+", "+b+") slutter!");
        return euklid(b,r);       // rekursivt kall
    }
}
