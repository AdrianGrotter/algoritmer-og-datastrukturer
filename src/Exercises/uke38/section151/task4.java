package Exercises.uke38.section151;

public class task4 {
    public static void main(String[] args) {
        int toPrint = 956847;
        System.out.println("Sifferroten til tallet "+toPrint+" er "+sifferrot(toPrint));

    }
    public static int sifferrot(int n){
        if(n<10) return n;
        String temp = Integer.toString(n);
        int[] array = new int[temp.length()];
        for (int i = 0; i < temp.length(); i++) {
            array[i] = temp.charAt(i) - '0';
        }
        int sum = 0;
        for (int j : array) sum += j;
        return sifferrot(sum);
    }
}
