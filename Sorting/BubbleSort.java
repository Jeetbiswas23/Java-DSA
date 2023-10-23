package Sorting;

public class BubbleSort {
    public static void bubblesort(int num[]) {
        for (int turn = 0; turn < num.length - 1; turn++) {
            for (int j = 0; j < num.length - 1 - turn; j++) {
                if (num[j] > num[j + 1]) {
                    //swap
                    int temp = num[j];
                    num[j] = num[j + 1];
                    num[j + 1] = temp;
                }
            }
        }

    }

    public static void Printarr(int num[]) {
        for (int i = 0; i < num.length; i++) {
            System.out.print(num[i] + " ");

        }
        System.out.println();

    }

    public static void main(String args[]) {
        int num[] = { 5, 4, 1, 3, 2 };
        bubblesort(num);
        Printarr(num);

    }

}
/*

"DRY RUN"

Initial Array:

5, 4, 1, 3, 2

Step by step dry run:

turn = 0:

i. For j = 0, compare num[0] (5) and num[1] (4). Swap them:
Array: 4, 5, 1, 3, 2

ii. For j = 1, compare num[1] (5) and num[2] (1). Swap them:
Array: 4, 1, 5, 3, 2

iii. For j = 2, compare num[2] (5) and num[3] (3). Swap them:
Array: 4, 1, 3, 5, 2

iv. For j = 3, compare num[3] (5) and num[4] (2). Swap them:
Array: 4, 1, 3, 2, 5

turn = 1:

i. For j = 0, compare num[0] (4) and num[1] (1). Swap them:
Array: 1, 4, 3, 2, 5

ii. For j = 1, compare num[1] (4) and num[2] (3). Swap them:
Array: 1, 3, 4, 2, 5

iii. For j = 2, compare num[2] (4) and num[3] (2). Swap them:
Array: 1, 3, 2, 4, 5

turn = 2:

i. For j = 0, num[0] (1) and num[1] (3) are already in order. Do nothing.

ii. For j = 1, compare num[1] (3) and num[2] (2). Swap them:
Array: 1, 2, 3, 4, 5

turn = 3:

i. For j = 0, num[0] (1) and num[1] (2) are already in order. Do nothing.

The array after the bubble sort:

1, 2, 3, 4, 5

And, that's what will be printed by the Printarr method. */








    

    

