package Exercises.uke38.section151;

public class task8 {
    public static void main(String[] args) {
        int a = 4;
        int b = 13;
        int c = heltallSum(a, b);
        System.out.println("Summen av heltallene mellom "+a+" og "+b+" er "+c);
    }

    public static int heltallSum(int a, int b){
        if (a == b || a>b) return a;
        int m = (a+b)/2;
        return heltallSum(a, m)+heltallSum(m+1, b); //Hvorfor går ikke return heltallSum(a, m-1)+heltallSum(m, b);
    }
}
