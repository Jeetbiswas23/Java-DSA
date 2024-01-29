package Recursion;

public class fabonicaseries {
    public static int fib(int n) {
        if (n == 0 || n == 1) {
            return n;
        }
        int Fibnm1 = fib(n - 1);
        int Fibnm2 = fib(n - 2);
        return Fibnm1 + Fibnm2;
    }

    public static void main(String[] args) {
        int n = 5;
        System.out.println(fib(n));
    }
}
