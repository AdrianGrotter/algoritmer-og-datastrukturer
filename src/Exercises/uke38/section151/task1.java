package Exercises.uke38.section151;

//1.3.4.6.7.8.9.10,11
public class task1 {
    public static void main(String[] args) {

        int tall = 3;
        System.out.println(a(tall));
        System.out.println(b(tall));
    }

   static long rekursivFakultet(long n){
        if(n == 1) return 1;
        return n*rekursivFakultet(n-1);
    }

    public static int a(int n)           // n må være et ikke-negativt tall
    {
        if (n == 0) return 1;              // a0 = 1
        else if (n == 1) return 2;         // a1 = 2
        else return 2*a(n-1) + 3*a(n-2);   // to rekursive kall
    }

    //Fra kompendiet
    public static int b(int n){

            int x = 0, y = 1, z = 1;

            for (int i = 0; i < n; i++)
            {
                z = 2*y + 3*x; x = y; y = z;
            }
            return z;
    }
}
