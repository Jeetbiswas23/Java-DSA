package Sorting;

public class optimisedBubblesort {
    //IMPORTANT CONDITION IN ADDITION OF BubbleSort.java
    //If the array is already sorted, then no swaps would be necessary during the bubble sort algorithm. 
    //Therefore, the variable totalSwaps would remain 0 at the end of the algorithm.

    public static void bubblesort(int num[]) {
        int totalSwaps = 0;
        boolean swapped;

        for (int turn = 0; turn < num.length - 1; turn++) {
            swapped = false; // reset the flag for each iteration

            for (int j = 0; j < num.length - 1 - turn; j++) {
                if (num[j] > num[j + 1]) {
                    // swap
                    int temp = num[j];
                    num[j] = num[j + 1];
                    num[j + 1] = temp;
                    totalSwaps++;
                    swapped = true; // set the flag indicating a swap was made
                }
            }

            // If no swaps were made in this iteration, the array is sorted
            if (!swapped)
                break;
        }

        System.out.println("The number of times it has been swapped: " + totalSwaps);
    }

    public static void Printarr(int num[]) {
        for (int i = 0; i < num.length; i++) {
            System.out.print(num[i] + " ");
        }
        System.out.println();
    }

    public static void main(String args[]) {
        int num[] = { 1, 2, 3, 4, 5 }; // Already sorted array
        bubblesort(num);
        Printarr(num); // Should print 1 2 3 4 5
    }
}

/*

"DRY RUN"

Let's dry run the provided BubbleSort algorithm for the given input array `num[] = {1, 2, 3, 4, 5}`:

**Initial Array:**
`1, 2, 3, 4, 5`

**Step-by-step dry run:**

**turn = 0**:
- `swapped` is initialized to `false`.
- Inner loop (`j` loop) compares adjacent pairs:

   i. For `j = 0`, compare `num[0]` (`1`) and `num[1]` (`2`). They are in the correct order.
   
   ii. For `j = 1`, compare `num[1]` (`2`) and `num[2]` (`3`). Again, they are in the correct order.
   
   iii. For `j = 2`, compare `num[2]` (`3`) and `num[3]` (`4`). They are in order.
   
   iv. For `j = 3`, compare `num[3]` (`4`) and `num[4]` (`5`). They are in order.

- At the end of this pass, no swaps have been made, so `swapped` remains `false`.

- Check the `swapped` value after the inner loop: Since `swapped` is `false`, we hit the line `if (!swapped) break;` and exit the outer loop.

**Final output**:
- The array remains `1, 2, 3, 4, 5`, and the number of swaps (`totalSwaps`) is `0`.
- Thus, the output of the program will be: `Swapped: 0`.

As expected, since the initial array is already sorted, no swaps are made during the bubble sort process. The optimization (`if (!swapped) break;`) correctly recognizes this and terminates the sorting early. */
    

