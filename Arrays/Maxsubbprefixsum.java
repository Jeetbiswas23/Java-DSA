package Arrays;
import java.util.*;

public class Maxsubbprefixsum {
    public static void MaxsubbarrayPrefixSum(int num[]) {
        int currSum = 0;
        int maxsum = Integer.MIN_VALUE;
        int prefix[] = new int[num.length];
        prefix[0] = num[0];
        //Calculating the prefix Array
        for (int i = 1; i < prefix.length; i++) {
            prefix[i] = prefix[i - 1] + num[i];
            for (i = 0; i < num.length; i++) {
                int start = i;
                for (int j = i; j < num.length; j++) {
                    int end = j;
                    //For Calculating Sum
                    currSum = start == 0 ? prefix[end] : prefix[end] - prefix[start - 1];
                    if (maxsum < currSum) {
                        maxsum = currSum;
                        
                    }
                }
            }

        }
        System.out.println("The Maximum Sum is"+maxsum);

    }
    public static void main(String args[]) {
        int num[] = { 2, 4, 6, 8, 10 };
        MaxsubbarrayPrefixSum(num);
    }
    
}

/*

"DRY RUN"
"The time complexity of the `MaxsubbarrayPrefixSum` function is \( O(n^2) \)."

Initialize currSum to 0 and maxsum to the smallest possible integer (Integer.MIN_VALUE).

Create an array prefix of the same length as num and initialize its first element to num[0], which means prefix[0] = 2.

Calculate the prefix sum:

a. For i = 1 (2nd element of num): 
 - `prefix[1] = prefix[0] + num[1] = 2 + 4 = 6`
b. For i = 2 (3rd element of num):
 - `prefix[2] = prefix[1] + num[2] = 6 + 6 = 12`
... (and so on for the entire length of num)

After this step, the prefix array will be: { 2, 6, 12, 20, 30 }

Now, to calculate the maximum sub-array sum using prefix sums:

a. For i = 0:
 i. For `j = 0`:

     - `currSum` is `prefix[0] = 2` since `start = 0`.
     - `maxsum` is updated to `2`.

 ii. For `j = 1`:

     - `currSum` is `prefix[1] = 6` since `start = 0`.
     - `maxsum` remains `6`.

 ... (continue in similar fashion for other values of `j`)
 i. For `j = 0`:

     - `currSum` is `prefix[0] = 2` since `start = 0`.
     - `maxsum` is updated to `2`.

 ii. For `j = 1`:

     - `currSum` is `prefix[1] = 6` since `start = 0`.
     - `maxsum` remains `6`.

 ... (continue in similar fashion for other values of `j`)
For i = 1:
 i. For `j = 1`:

     - `currSum` is `prefix[1] - prefix[0] = 4`.
     - `maxsum` remains `6`.

 ... (continue in similar fashion for other values of `j`)
... (and so on for other values of i)

After processing all possible sub-arrays using prefix sums, the function concludes that the maximum sum is 30 (which is the sum of the entire array in this case).

The function then prints: The Maximum Sum is30.*/