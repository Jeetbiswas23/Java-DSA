package BitManipulation;

public class UpdateithBit {
    public static int updateIthBit(int n, int i) {
        int Bitmask = ~(1 << i);
        return n & Bitmask;

    }

    public static void main(String args[]) {
        System.out.println(updateIthBit(10, 1));
    }
    
}
/*int n = 10; // Binary representation: 1010
int i = 1;  // We want to update the 1st bit (from the right) to 0

// 1 << i = 1 << 1 = 2
// Binary representation of 2: 0010
// ~2 = -3
// Binary representation of -3 (in 2's complement): 1111 1101

// n & Bitmask:
//  1010
//& 1111 1101
//-----------
//  1010
//-----------

// So, the result is 10 in decimal, which is equivalent to the binary 1010.

System.out.println(updateIthBit(10, 1)); // Output: 10
 */