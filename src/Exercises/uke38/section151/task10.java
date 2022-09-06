package Exercises.uke38.section151;

public class task10 {
    public static void main(String[] args) {
        System.out.println(rekursivFakultet(5)); //5 skal gi 120 fordi 5*24 = 120
    }
    static long rekursivFakultet(long n){
        if(n == 1) return 1;
        return n*rekursivFakultet(n-1);
    }
}
