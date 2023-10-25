package Sorting;

import java.util.*;

public class SelectionSort {
    public static void Selectionsort(int num[]) {
        for (int i = 0; i < num.length - 1; i++) {
            int MinPos = i;//MinPos is Minimum Position
            for (int j = i + 1; j < num.length; j++) {
                if (num[MinPos] > num[j]) { //If num[MinPos] < num[j] It will Sort in descending order output will be 5 4 3 2 1
                    MinPos = j;
                }
            }
            //swap
            int temp = num[MinPos];
            num[MinPos] = num[i];
            num[i] = temp;
        }
    }

    public static void Printarr(int num[]) {
        for (int k = 0; k < num.length; k++) {
            System.out.print(num[k] + " ");

        }
        System.out.println();

    }

    public static void main(String args[]) {
        int num[] = { 5, 4, 1, 3, 2 };
        Selectionsort(num);
        Printarr(num);

    }

}

/*Sure, let's dry run the given Selection Sort code with the input `num[] = {5, 4, 1, 3, 2}`.

### Dry Run:

**Initial array**: 
`5, 4, 1, 3, 2`

**1st Iteration** (i = 0):

- Set `MinPos` to 0. The initial minimum value is `5`.
- Compare with all elements after the 0th position:
  - For `j = 1`: `4 < 5`, so update `MinPos` to 1.
  - For `j = 2`: `1 < 4`, so update `MinPos` to 2.
  - For `j = 3`: `3` is not less than `1`. No change.
  - For `j = 4`: `2` is not less than `1`. No change.
- After the loop, `MinPos` is 2. So, swap `num[0]` and `num[2]`.
  
**Resultant array**:
`1, 4, 5, 3, 2`

**2nd Iteration** (i = 1):

- Set `MinPos` to 1. The initial minimum value is `4`.
- Compare with all elements after the 1st position:
  - For `j = 2`: `5` is not less than `4`. No change.
  - For `j = 3`: `3 < 4`, so update `MinPos` to 3.
  - For `j = 4`: `2 < 3`, so update `MinPos` to 4.
- After the loop, `MinPos` is 4. So, swap `num[1]` and `num[4]`.

**Resultant array**:
`1, 2, 5, 3, 4`

**3rd Iteration** (i = 2):

- Set `MinPos` to 2. The initial minimum value is `5`.
- Compare with all elements after the 2nd position:
  - For `j = 3`: `3 < 5`, so update `MinPos` to 3.
  - For `j = 4`: `4` is not less than `3`. No change.
- After the loop, `MinPos` is 3. So, swap `num[2]` and `num[3]`.

**Resultant array**:
`1, 2, 3, 5, 4`

**4th Iteration** (i = 3):

- Set `MinPos` to 3. The initial minimum value is `5`.
- Compare with all elements after the 3rd position:
  - For `j = 4`: `4 < 5`, so update `MinPos` to 4.
- After the loop, `MinPos` is 4. So, swap `num[3]` and `num[4]`.

**Resultant array**:
`1, 2, 3, 4, 5`

**5th Iteration** (i = 4):

- As `i = num.length - 1`, the outer loop terminates without further iterations.

The final sorted array is `1, 2, 3, 4, 5`, which will be printed by the `Printarr` method. */