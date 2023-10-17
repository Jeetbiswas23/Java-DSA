package Arrays;

public class MaxsubbBrute {
    public static void MaxsubbarrBruteforce(int num[]) {
        int currentsum = 0;
        int maxsum = Integer.MIN_VALUE;
        for (int i = 0; i < num.length; i++) {
            int start = i;
            for (int j = i; j < num.length; j++) {
                int end = j;
                currentsum = 0;
                for (int k = start; k <= end; k++) {
                    currentsum += num[k];
                }
                System.out.println("Current Sum" + currentsum);
                if (maxsum < currentsum) {
                    maxsum = currentsum;
                }
            }

        }
        System.out.println("Max Sum is" + maxsum);
    }

    public static void main(String args[]) {
        int num[] = { 2, 4, 6, 8, 10 };
        MaxsubbarrBruteforce(num);
    }
    
}

/*
""The time complexity of the `MaxsubbarrBruteforce` function is \( O(n^3) \).""

"DRY RUN"

Initialize currentsum to 0 and maxsum to the smallest possible integer (Integer.MIN_VALUE).

Begin with the outer loop, which iterates over the starting point of our sub-arrays:

a. For i = 0 (starting point of sub-array is the 1st element, 2):

 i. For `j = 0` (end point of sub-array is also the 1st element):

     - Reset `currentsum` to `0`.
     - Calculate sum from `i=0` to `j=0` using the innermost loop: sum is `2`.
     - Print: `Current Sum2`.
     - `maxsum` is updated to `2`.

 ii. For `j = 1` (end point of sub-array is the 2nd element, `4`):

     - Reset `currentsum` to `0`.
     - Calculate sum from `i=0` to `j=1`: sum is `2 + 4 = 6`.
     - Print: `Current Sum6`.
     - `maxsum` is updated to `6`.

 iii. For `j = 2` (end point of sub-array is the 3rd element, `6`):

     - Reset `currentsum` to `0`.
     - Calculate sum from `i=0` to `j=2`: sum is `2 + 4 + 6 = 12`.
     - Print: `Current Sum12`.
     - `maxsum` is updated to `12`.

 ... (continue in similar fashion for `j = 3` and `j = 4`)
 For i = 1 (starting point of sub-array is the 2nd element, 4): i. For `j = 1` (end point of sub-array is also the 2nd element):

     - Reset `currentsum` to `0`.
     - Calculate sum from `i=1` to `j=1`: sum is `4`.
     - Print: `Current Sum4`.
     - `maxsum` remains `12` (from previous iteration).

 ii. For `j = 2`:

     - Reset `currentsum` to `0`.
     - Calculate sum from `i=1` to `j=2`: sum is `4 + 6 = 10`.
     - Print: `Current Sum10`.
     - `maxsum` remains `12`.

 ... (continue in similar fashion for `j = 3` and `j = 4`)
... (and so on for i = 2, i = 3, and i = 4)

After processing all possible sub-arrays, the function concludes that the maximum sum is 30 (which is the sum of the entire array in this case).

The function then prints: Max Sum is 30.
""The time complexity of the `MaxsubbarrBruteforce` function is \( O(n^3) \).""
 */