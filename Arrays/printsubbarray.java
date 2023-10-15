package Arrays;

public class printsubbarray {
    public static void printsubbarr(int num[]) {
        int tp = 0;
        for (int i = 0; i < num.length; i++) {
            int start = i;
            for (int j = i; j < num.length; j++) {
                int end = j;
                for (int k = start; k <= end; k++) {//print
                    System.out.print(num[k]);

                }
                tp++;
                System.out.println();

            }
            System.out.println();
        }
        System.out.println("Total Pairs" + " " + tp);

    }

    public static void main(String args[]) {
        int num[] = { 2, 4, 6, 8, 10 };
        printsubbarr(num);

    }

}


/*

"DRY RUN"

The num array is initialized with values { 2, 4, 6, 8, 10 }.

Call printsubbarr(num):

a. Initialize tp to 0. This variable seems to keep track of the total number of subarrays printed.

b. Outer loop starts with i = 0: i. Set `start` to `i`, so `start = 0`.
 
 ii. Second loop starts with `j = i`, so `j = 0`:
     
     1. Set `end` to `j`, so `end = 0`.
     
     2. Innermost loop (printing loop) starts with `k = start` and ends with `k = end`, which means it runs just once for `k = 0`.
         - Print `num[0] = 2`. So, `2` is printed.
     
     3. Increment `tp` to `1`.
     
     4. Print a new line.

 iii. Increment `j` to `1`. The second loop continues:
     
     1. Set `end` to `j`, so `end = 1`.
     
     2. Innermost loop runs from `k = 0` to `k = 1`.
         - Print `num[0] = 2` and `num[1] = 4`. So, `24` is printed.
     
     3. Increment `tp` to `2`.
     
     4. Print a new line.

 ... (This pattern continues for all values of `j` from `i` to `num.length - 1`).

 iv. After the second loop ends for `i = 0`, print another new line.
Continue the outer loop for all values of i.

After all sub-arrays are printed, print the total count, which is the value of tp.

The console output for the given array { 2, 4, 6, 8, 10 } will be:2
24
246
2468
246810

4
46
468
46810

6
68
6810

8
810

10

Total Pairs 15
 */
