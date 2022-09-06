package Exercises.uke38.section151;

public class task3 {
    public static void main(String[] args) {
        int toPrint = 956847;
        System.out.println("Tverrsum med rekursjon: "+tverrsum(toPrint) + "\nTverrsum iterativt: " + tverrsumIterativ(toPrint));
    }
    public static int tverrsum(int n)              // n må være >= 0
    {
        if (n < 10) return n;                        // kun ett siffer
        else return tverrsum(n / 10) + (n % 10);     // metoden kalles
    }
    public static int tverrsumIterativ(int n){
        String temp = Integer.toString(n);
        int[] array = new int[temp.length()];
        for(int i = 0; i<temp.length(); i++){
            array[i] = temp.charAt(i)-'0';
        }
        int sum = 0;
        for (int j : array) sum += j;
        return sum;
    }
}
