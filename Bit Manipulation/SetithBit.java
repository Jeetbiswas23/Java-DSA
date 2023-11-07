package BitManipulation;

import java.beans.IntrospectionException;

public class SetithBit {
    public static int setithBit(int n, int i) {
        int Bitmask = 1 << i;
        return n | Bitmask;
    }

    public static void main(String args[]) {
        System.out.println(setithBit(10, 2));
        
        
    }
    
}
/*int n = 10; // Binary representation: 1010
int i = 2;  // We want to set the value of the 2nd bit (from the right) to 1

// 1 << i = 1 << 2 = 4
// Binary representation of 4: 0100

// n | Bitmask:
//  1010
//| 0100
//-----------
//  1110
//-----------

// The result is 1110 in binary, which is equivalent to 14 in decimal. This means that the 2nd bit (from the right) of the number 10 has been set to 1.

System.out.println(setithBit(10, 2)); // Output: 14
 */
