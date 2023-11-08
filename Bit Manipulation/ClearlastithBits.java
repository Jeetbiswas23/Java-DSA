package BitManipulation;

public class ClearlastithBits {
    public static int clearithlastbit(int n, int i) {
        int BitMask = (~0) << i;
        return n & BitMask;
    }

    public static void main(String args[]) {
        System.out.println(clearithlastbit(10, 2));
    }
    
}
/*int n = 10; // Binary representation: 1010
int i = 2;  // We want to clear the last 2 bits

// Calculate the BitMask to clear the last i bits:
// (~0) is a bitmask of all 1s, so when we shift it to the left by i positions, it will have i 0s in the least significant bits.
// In this case, i = 2, so we will have 2 trailing 0s in the bitmask.

// (~0) << i:
// (~0) = 1111
// Shift left by 2:
//  1111
// <<<<
//  1100
// Binary representation of 12: 1100

// n & BitMask:
//  1010
//& 1100
//-----------
//  1000
//-----------

// The result is 1000 in binary, which is equivalent to 8 in decimal. This means that the last 2 bits of the number 10 have been cleared.

System.out.println(clearithlastbit(10, 2)); // Output: 8
 */