package BitManipulation;

public class ClearRangeofBits {
    public static int clearrangeofbits(int n, int i, int j) {
        int a = ((~0) << (j + 1));
        int b = (1 << i) - 1;
        int BitMask = a | b;
        return BitMask & n;
    }

    public static void main(String args[]) {
        System.out.println(clearrangeofbits(10, 2, 4));
    }
}
/*Let's dry run the `clearrangeofbits` method with the input values `n = 10`, `i = 2`, and `j = 4`:

1. Binary representation of `10` is `1010`.
2. Calculate the value of `a`:
   - `j + 1` is `4 + 1 = 5`, and we shift all `1` bits to the left by `5` positions, so `a` is set to `11100000` in binary.

3. Calculate the value of `b`:
   - `1 << i` is `1 << 2`, which is `100` in binary. We then subtract `1` to set all bits to the right of the second bit to `1`, resulting in `11` in binary.

4. Calculate `BitMask`:
   - `a | b` is a bitwise OR operation between `11100000` and `11`, resulting in `11100011` in binary.

5. Perform a bitwise AND operation between `BitMask` and `n`:
   - `11100011` (BitMask)
   - `00001010` (n)

6. The result is `00000010` in binary, which is `2` in decimal.

So, the output of the `clearrangeofbits(10, 2, 4)` call is `2`. */