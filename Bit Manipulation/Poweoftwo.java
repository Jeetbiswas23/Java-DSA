package BitManipulation;

public class Poweoftwo {
    public static boolean isPowerofTwo(int n) {
        return (n & (n - 1)) == 0;
    }

    public static void main(String args[]) {
        System.out.println(isPowerofTwo(16));
    }
    
}
/*The binary representation of 16 is 10000.

Subtracting 1 from 16, we get 15, which in binary is 1111.

When we perform a bitwise AND operation between 16 (10000 in binary) and 15 (1111 in binary), we get 0.

Since the result is equal to 0, the method returns true.

So, the correct output of isPowerofTwo(16) is true. Thank you for pointing out the error.
 */