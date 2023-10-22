/*Given an integer array nums, return true if any value appears at least twice in the array
, and return false if every element is distinct.

Example 1:

Input: nums = [1,2,3,1]
Output: true
Example 2:

*/
//Code
//BRUTE FORCE
package Arrays;

public class containsDuplicate {
    public static boolean Dupicateelement(int num[]) {
        for (int i = 0; i < num.length; i++) {
            for (int j = i + 1; j < num.length; j++) {
                if (num[i] == num[j]) {
                    return true;
                }

            }
        }
        return false;

    }

    public static void main(String args[]) {
        int num[] = { 1, 2, 3, 4, 1 };
        System.out.println(Dupicateelement(num));

    }

}
/*

" DRY RUN "

containsDuplicate.Dupicateelement function with the provided input array num[] = { 1, 2, 3, 4, 1 }.

We start iterating over the array with the outer loop (i loop).
For every element, we use the inner loop (j loop) to check for duplicates.
Detailed Steps:

i. For i = 0, num[i] is 1.

Start the inner loop (j loop) from i + 1.
ii. For j = 1, num[j] is 2.
- Since num[i] (1) is not equal to num[j] (2), continue.

iii. For j = 2, num[j] is 3.
- Similarly, no match is found. Continue.

iv. For j = 3, num[j] is 4.
- No match. Continue.

v. For j = 4, num[j] is 1.
- num[i] is equal to num[j], which means we found a duplicate! The function returns true.

Since we found a duplicate, the function terminates early and returns true. Thus, the final output for the given input is true.

(Note: If the function had not found any duplicates, it would have completed the double loop and returned false.)




 */
