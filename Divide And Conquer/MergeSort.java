package DivideandConquer;

public class MergeSort {
    public static void printarr(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void mergeSort(int[] arr, int st, int en) {
        if (st < en) {
            int mid = st + (en - st) / 2;
            mergeSort(arr, st, mid);
            mergeSort(arr, mid + 1, en);
            merge(arr, st, en, mid);
        }
    }

    public static void merge(int[] arr, int st, int en, int mid) {
        int[] temp = new int[en - st + 1];
        int i = st; // Index for 1st sorted part
        int j = mid + 1; // Index for 2nd Sorted part
        int k = 0; // Index for temp array

        while (i <= mid && j <= en) {
            if (arr[i] < arr[j]) {
                temp[k++] = arr[i++];
            } else {
                temp[k++] = arr[j++];
            }
        }

        // Copy remaining elements from left subarray
        while (i <= mid) {
            temp[k++] = arr[i++];
        }

        // Copy remaining elements from right subarray
        while (j <= en) {
            temp[k++] = arr[j++];
        }

        // Copying the temp array back to the original array
        for (k = 0, i = st; k < temp.length; k++, i++) {
            arr[i] = temp[k];
        }
    }

    public static void main(String args[]) {
        int arr[] = { 1, 3, 4, 2, 5 };
        mergeSort(arr, 0, arr.length - 1);
        printarr(arr);
    }
}

/*Given array: { 1, 3, 4, 2, 5 }

Initial Call to mergeSort:
mergeSort(arr, 0, 4) - This means we are sorting the entire array from index 0 to index 4.

First Recursive Call:
mergeSort(arr, 0, 2)

Now, we're sorting the left half of the array from index 0 to index 2.
mid is calculated as (0 + 2) / 2 = 1.
mergeSort(arr, 0, 1)
Sorting from index 0 to 1.
mid is (0 + 1) / 2 = 0.
This results in no further division since st >= en.
mergeSort(arr, 1, 2)
Sorting from index 1 to 2.
mid is (1 + 2) / 2 = 1.
This also results in no further division since st >= en.
Now, we proceed to merge the sorted halves.
merge(arr, 0, 2, 1)
Merging the subarrays [1] and [3] at indices 0 to 1 with the help of the merge function.
Second Recursive Call:
mergeSort(arr, 3, 4)

Now, we're sorting the right half of the array from index 3 to index 4.
mid is calculated as (3 + 4) / 2 = 3.
This results in no further division since st >= en.
Now, we merge the sorted halves obtained from steps 2 and 3.

merge(arr, 0, 4, 2)
Merging the subarrays [1, 3] and [2, 4, 5] at indices 0 to 4 with the help of the merge function.
Finally, the sorted array is printed using the printarr method.



Merge Sort Function (mergeSort):

The mergeSort function is a recursive function that sorts an array by dividing it into smaller subarrays until each subarray contains only one element (which is inherently sorted).
It takes three parameters: the array to be sorted (arr), the starting index of the subarray (st), and the ending index of the subarray (en).
If the starting index (st) is less than the ending index (en), the function continues to divide the array.
It calculates the middle index (mid) of the subarray to divide it into two halves and recursively calls mergeSort on each half.
After the subarrays are sorted, it calls the merge function to merge the sorted subarrays.
Merge Function (merge):

The merge function merges two sorted subarrays into one sorted array.
It takes four parameters: the original array (arr), the starting index of the first subarray (st), the ending index of the second subarray (en), and the middle index (mid) which divides the subarrays.
It creates a temporary array (temp) to store the merged result.
Using three pointers (i, j, k), it iterates through the two subarrays and compares elements to merge them into the temp array.
After merging all elements, it copies the merged result from the temp array back to the original array (arr).
Print Array Function (printarr):

The printarr function is a utility function to print the elements of an array.
Main Method:

In the main method, an array is initialized (arr[]) with some values.
The mergeSort function is called with the entire array and its length to start the sorting process.
Finally, the sorted array is printed using the printarr function.*/