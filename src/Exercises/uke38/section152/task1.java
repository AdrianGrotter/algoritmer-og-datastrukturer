package Exercises.uke38.section152;

public class task1 {
    public static void main(String... args)
    {
        System.out.println("main() starter!");
        int sum = tverrsum(72953235);
        System.out.println("main() er ferdig!");
    }

    public static int tverrsum(int n)
    {
        System.out.println("tverrsum(" + n + ") starter!");
        int sum = (n < 10) ? n : tverrsum(n / 10) + (n % 10);
        System.out.println("tverrsum(" + n + ") er ferdig!");
        return sum;
    }

}
