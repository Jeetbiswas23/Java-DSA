package Recursion;

public class lastoccurance {
    public static int arrsot(int[] arr, int key, int i) {
        if (i == arr.length) {
            return -1; // Base case: key not found in the array
        }

        int found = arrsot(arr, key, i + 1);

        if (found == -1 && arr[i] == key) {
            return i; // Key found at index i
        }

        return found;
    }

    public static void main(String args[]) {
        int arr[] = { 1, 2, 3, 4, 4, 5, 6, 7, 8, 9, 9 };
        int key = 9;
        int i = 0; // Initialize the index i
        int lastOccurrence = arrsot(arr, key, i);
        System.out.println(lastOccurrence);
    }

    
}
