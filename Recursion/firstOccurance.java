package Recursion;

public class firstOccurance {
    public static int firstOcc(int[] arr, int key, int i) {
        if (i == arr.length) {
            return -1;
        }
        if (arr[i] == key) {
            return i;
        }
        return firstOcc(arr, key, i+1);

    }

    public static void main(String args[]) {
        int[] arr = { 1, 2, 6, 5, 7, 3, 7 };
        int key = 7;
        System.out.println(firstOcc(arr, key, 0));
    }
    
}
