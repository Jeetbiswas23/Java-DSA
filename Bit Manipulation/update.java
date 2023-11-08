package BitManipulation;

public class update {
    public static int ClearIthBit(int n, int i) {
        int Bitmask = ~(1 << i);
        return n & Bitmask;

    }
    public static int setithBit(int n, int i) {
        int Bitmask = 1 << i;
        return n | Bitmask;
    }

    public static int updateithBit(int n, int i, int newBit) {
        // if (newBit == 0) {
        //      return ClearIthBit(n, i);
        // } else {                             //Basic Logic
        //     return setithBit(n, i);
        // }

        n = ClearIthBit(n, i);
        int Bitmask = newBit << i;             //Sigma Logic
        return Bitmask | n;
    }

    public static void main(String args[]) {
        System.out.println(updateithBit(10, 2, 1));
    }
    
}
/*int n = 10; // Binary representation: 1010
int i = 2;  // We want to update the value of the 2nd bit (from the right) to 1
int newBit = 1;

// Clear the 2nd bit (from the right) to 0:
// 1 << i = 1 << 2 = 4
// Binary representation of 4: 0100
// ~4 = 1111

// n & Bitmask:
//  1010
//& 1111
//-----------
//  1010
//-----------

// n = 10

// Set the 2nd bit (from the right) to newBit (1):
// newBit << i = 1 << 2 = 4
// Binary representation of 4: 0100

// Bitmask | n:
//  0100
//| 1010
//-----------
//  1110
//-----------

// The result is 1110 in binary, which is equivalent to 14 in decimal. This means that the 2nd bit (from the right) of the number 10 has been updated to 1.

System.out.println(updateithBit(10, 2, 1)); // Output: 14
 */