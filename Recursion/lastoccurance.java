package Recursion;

public class lastoccurance {
    public static int arrsot(int[] arr, int key, int i) {
        if (i == arr.length) {
            return -1; // Base case: key not found in the array
        }

        int found = arrsot(arr, key, i + 1); // Pehle Look Forward

        if (found == -1 && arr[i] == key) {// then Self found
            return i; // Key found at index i
        }

        return found;
    }

    public static void main(String args[]) {
        int arr[] = { 5,5,5,5 };
        int key = 5;
        int i = 0; // Initialize the index i
        int lastOccurrence = arrsot(arr, key, i);
        System.out.println(lastOccurrence);
    }

    
}
