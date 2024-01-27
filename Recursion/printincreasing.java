package Recursion;

public class printincreasing {
    public static void printincr(int n) {
        if (n == 1) {
            System.out.print(n +" ");
            return;
        }
        printincr(n-1);
        System.out.print(n + " ");
    }
    public static void main(String args[]) {
        int n = 10;
        printincr(n);
    }
    
}
