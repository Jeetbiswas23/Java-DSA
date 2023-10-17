package Arrays;

import java.util.*;

public class kadenesarraysubsum { //optimised code of time complexity of  "O(n)"
    public static void Kadensarraysum(int num[]) {
        int ms = Integer.MIN_VALUE;
        int cs = 0;
        for (int i = 0; i < num.length; i++) {
            cs = cs + num[i];
            if (cs < 0) {
                cs = 0;
            }
            ms = Math.max(cs, ms);

        }
        System.out.println("The max Sum is "+ms);
    }
    public static void main( String args[]){
        int num[] = {-2,-3,4,-1,-2,1,5,-3};
        Kadensarraysum(num);
    }
    
}

/*

"DRY RUN"


The time complexity of the `Kadensarraysum` function is \( O(n) \).(MORE OPTIMISED CODE)

Initialize the maximum sum ms to the smallest possible integer (Integer.MIN_VALUE) and the current sum cs to 0.

Begin iterating over the elements of the array num:

a. For i = 0 (element is -2): - `cs = 0 - 2 = -2`
 - `ms` becomes the max of `-2` and `Integer.MIN_VALUE`, which is `-2`.
 - Since `cs` is < 0, reset `cs` to 0.
For i = 1 (element is -3):
 - `cs = 0 - 3 = -3`
 - `ms` remains `-2` since `-2` > `-3`.
 - Reset `cs` to 0 since it's < 0.
 For i = 2 (element is 4):
  - `cs = 0 + 4 = 4`
 - `ms` becomes `4` since `4` > `-2`.
 - No reset of `cs` as it's > 0.
For i = 3 (element is -1):
 - `cs = 4 - 1 = 3`
 - `ms` remains `4` since `4` > `3`.
 - No reset of `cs`.
For i = 4 (element is -2):
 - `cs = 3 - 2 = 1`
 - `ms` remains `4`.
 - No reset of `cs`.
For i = 5 (element is 1):

 - `cs = 1 + 1 = 2`
 - `ms` remains `4`.
 - No reset of `cs`.
 For i = 6 (element is 5):
  - `cs = 2 + 5 = 7`
 - Now, `ms` becomes `7` since `7` > `4`.
 - No reset of `cs`.
For i = 7 (element is -3):

 - `cs = 7 - 3 = 4`
 - `ms` remains `7`.
 - No reset of `cs`.
After processing the entire array, ms contains the maximum subarray sum which is 7.

The function then prints: The max Sum is 7. */