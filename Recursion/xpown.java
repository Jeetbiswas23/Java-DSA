package Recursion;

public class xpown {
    public static int power(int x, int n) {
        if (n == 0) {
            return 1;
        }
        return x * power(x, n - 1);
    }

    public static int optimizedpower(int x, int n) {
        if (n == 0) {
            return 1;
        }
        int halfpower = optimizedpower(x, n / 2) * optimizedpower(x, n / 2);

        // If n is odd
        if (n % 2 != 0) {
            halfpower = x * halfpower;
        }

        return halfpower; // Return the calculated result
    }

    public static void main(String args[]) {
        System.out.println(optimizedpower(2, 100));
    }
}
