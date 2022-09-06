package Exercises.uke38.section152;

public class task6 {
    //Treet får 25 noder.
    public static void main(String[] args) {
        System.out.println("main() starter!");
        fib(6);
        System.out.println("main() er ferdig!");
    }
    public static int fib(int n)         // med utskriftssetninger
    {
        System.out.println("fib(" + n + ") starter!");
        int fib = n > 1 ? fib(n-1) + fib(n-2) : n;
        System.out.println("fib(" + n + ") er ferdig!");
        return fib;      // metoden er ferdig
    }
}
