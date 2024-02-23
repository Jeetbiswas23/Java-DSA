package DivideandConquer;

public class Quicksort {
    public static void printarr(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }

    public static void quicksort(int[] arr, int si, int ei) {
        if (si >= ei) {
            return;
        }
        int poi = partition(arr, si, ei);
        quicksort(arr, si, poi - 1);
        quicksort(arr, poi + 1, ei);
    }

    public static int partition(int[] arr, int si, int ei) {
        int pivot = arr[ei];
        int i = si - 1;
        for (int j = si; j < ei; j++) {
            if (arr[j] < pivot) {
                i++;
                // swap
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
            }
        }
        // swap
        int temp = arr[ei];
        arr[ei] = arr[i + 1];
        arr[i + 1] = temp;
        return i + 1;
    }

    public static void main(String args[]) {
        int[] arr = { 2, 3, 4, 1, 5 };
        quicksort(arr, 0, arr.length - 1);
        printarr(arr);
    }
}

/*Initial array: [2, 3, 4, 1, 5]

Call quicksort(arr, 0, 4):

si = 0, ei = 4
Condition si >= ei is false, so proceed.
Call partition(arr, 0, 4):

si = 0, ei = 4
Pivot is arr[4] = 5
Initialize i = -1
Iterate j from si = 0 to ei - 1 = 3:
Iteration 1 (j = 0): arr[0] = 2, which is less than pivot. Increment i to 0.
Iteration 2 (j = 1): arr[1] = 3, which is less than pivot. Increment i to 1.
Iteration 3 (j = 2): arr[2] = 4, which is less than pivot. Increment i to 2.
Iteration 4 (j = 3): arr[3] = 1, which is less than pivot. Increment i to 3. Swap arr[3] and arr[3] (no change).
Swap arr[4] (pivot) with arr[i + 1] = arr[4] (no change).
Partitioned array: [2, 3, 4, 1, 5]. Return pivot index 3.
Call quicksort(arr, 0, 2) (left subarray):

si = 0, ei = 3
Condition si >= ei is false, so proceed.
Call partition(arr, 0, 3):

si = 0, ei = 3
Pivot is arr[3] = 1
Initialize i = -1
Iterate j from si = 0 to ei - 1 = 2:
Iteration 1 (j = 0): arr[0] = 2, which is greater than pivot. No change.
Iteration 2 (j = 1): arr[1] = 3, which is greater than pivot. No change.
Iteration 3 (j = 2): arr[2] = 4, which is greater than pivot. No change.
Swap arr[3] (pivot) with arr[i + 1] = arr[0].
Partitioned array: [1, 3, 4, 2, 5]. Return pivot index 0.
Call quicksort(arr, 2, 3) (right subarray):

si = 2, ei = 3
Condition si >= ei is false, so proceed.
Call partition(arr, 2, 3):

si = 2, ei = 3
Pivot is arr[3] = 2
Initialize i = 1
Iterate j from si = 2 to ei - 1 = 2:
Iteration 1 (j = 2): arr[2] = 4, which is greater than pivot. No change.
Swap arr[3] (pivot) with arr[i + 1] = arr[2].
Partitioned array: [1, 2, 4, 3, 5]. Return pivot index 1.
No more recursive calls for subarrays.

Final sorted array: [1, 2, 4, 3, 5]. */