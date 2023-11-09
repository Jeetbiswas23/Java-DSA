package BitManipulation;

public class CountsetithBit {
    public static int countsetithbit(int n) {
        int count = 0;
        while (n > 0) {
            if ((n & 1) != 0) {
                count++;
            }
            n = n >> 1;
        }
        return count;
    }

    public static void main(String args[]) {
        System.out.println(countsetithbit(15));
        
    }
    
}
/*Input: 15 (binary: 1111)
Initialize count to 0.
In the first iteration:
Check the last bit using (n & 1), which is 1. Increment count to 1.
Right-shift n by one bit, resulting in 7 (binary: 0111).
In the second iteration:
Check the last bit (n & 1), which is 1. Increment count to 2.
Right-shift n by one bit, resulting in 3 (binary: 0011).
In the third iteration:
Check the last bit (n & 1), which is 1. Increment count to 3.
Right-shift n by one bit, resulting in 1 (binary: 0001).
In the fourth iteration:
Check the last bit (n & 1), which is 1. Increment count to 4.
Right-shift n by one bit, resulting in 0 (binary: 0000).
The loop exits as n becomes 0.
The final count is 4.
Output: 4

Therefore, the output of countsetithbit(15) is 4. */