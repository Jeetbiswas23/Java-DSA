package Recursion;

public class sumofn {
    public static int sum(int n) {
        if (n == 1) {
            return 1;
        }
        int fn=n+sum(n-1);
        return fn;
    }
    public static void main(String args[]) {
        int n = 5;
        System.out.print(sum(n));
    }
    
}
