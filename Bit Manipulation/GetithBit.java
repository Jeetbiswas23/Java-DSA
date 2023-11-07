package BitManipulation;

public class GetithBit {
    public static Integer getithBit(int n, int i) {
        int BitMask = 1 << i;
        if ((n & BitMask) == 0) {
            return 0; 
        } else {
            return 1;
        }

    }

    public static void main(String args[]) {
        System.out.println(getithBit(10, 3));
    }
    
}
/*int n = 10; // Binary representation: 1010
int i = 3;  // We want to get the value of the 3rd bit (from the right)

// 1 << i = 1 << 3 = 8
// Binary representation of 8: 1000

// n & Bitmask:
//  1010
//& 1000
//-----------
//  1000
//-----------

// Since the result is 1000 in binary, which is equivalent to 8 in decimal, the function will return 1 because the 3rd bit is 1.

System.out.println(getithBit(10, 3)); // Output: 1
 */
