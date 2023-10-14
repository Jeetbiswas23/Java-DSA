package Arrays;

import java.util.*;

public class reversearr {
    public static void reversearr(int nummbers[]) {
        int first = 0, last = nummbers.length - 1;
        while (first < last) {
            int temp = nummbers[last];
            nummbers[last] = nummbers[first];
            nummbers[first] = temp;
            
            first++;
            last--;
       }

    }

    public static void main(String args[]) {
        int numbers[] = { 2, 4, 6, 5, 9 };
        reversearr(numbers);
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }
        System.out.println();
    }
    
}
/* 

"DRY RUN"


The numbers array is initialized with the values { 2, 4, 6, 5, 9 }.

Call reversearr(numbers):

a. Initialize pointers with first = 0 and last = 4 (because numbers.length - 1 = 4).

b. Enter the while loop because 0 < 4.

c. Swap the values at the first and last indices:
- temp = numbers[4] so temp = 9.
- numbers[4] = numbers[0] so numbers[4] = 2.
- numbers[0] = temp so numbers[0] = 9.

The array now looks like: { 9, 4, 6, 5, 2 }.

d. Increment first to 1 and decrement last to 3.

e. On the next iteration of the while loop, because 1 < 3:

Swap the values at the new first and last indices:
- temp = numbers[3] so temp = 5.
- numbers[3] = numbers[1] so numbers[3] = 4.
- numbers[1] = temp so numbers[1] = 5.

The array now looks like: { 9, 5, 6, 4, 2 }.

f. Increment first to 2 and decrement last to 2.

g. The loop condition first < last is no longer true since both are 2. Exit the loop.

Back in the main() method, print each value of the reversed numbers array using the for loop.*/
