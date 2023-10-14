package Arrays;

import java.util.*;

public class binarysearch {
    public static int binarysearch(int num[], int Key) {
        int start = 0, end = num.length - 1;
        while (start <= end) {
            int mid = (start + end) / 2;
            //compare
            if (num[mid] == Key) { //found
                return mid;
            }
            if (num[mid] < Key) { //right
                start = mid + 1;
            } else { //left
                end = mid - 1;

            }

        }
        return -1;

    }

    public static void main(String args[]) {
        int num[] = { 2, 4, 6, 8, 10, 12, 14 };
        int Key = 10;
        System.out.println("The index of the key is"+" " +binarysearch(num, Key));
        
    }
}

/*
"DRY RUN"

The num array is initialized with the values { 2, 4, 6, 8, 10, 12, 14 }, and we are searching for the Key value 10.

Call binarysearch(num, Key) with Key = 10:

a. Start with start = 0 and end = 6 (because num.length - 1 = 6).

b. Enter the while loop because 0 <= 6.

c. Calculate mid value: mid = (0 + 6) / 2 = 3.

d. Check num[mid], which is num[3] = 8.
- 8 is less than Key (which is 10), so move to the right half by setting start to mid + 1, which means start = 4.

e. Continue the loop with the new start and same end values.

f. Calculate new mid value: mid = (4 + 6) / 2 = 5.

g. Check num[mid], which is num[5] = 12.
- 12 is greater than Key (which is 10), so move to the left half by setting end to mid - 1, which means end = 4.

h. Continue the loop with the new end and same start values.

i. Calculate new mid value: mid = (4 + 4) / 2 = 4.

j. Check num[mid], which is num[4] = 10.
- 10 matches the Key, so exit the function and return the mid value 4.

In main(), print the result of binarysearch(num, Key), which prints "The index of the key is 4".

 */