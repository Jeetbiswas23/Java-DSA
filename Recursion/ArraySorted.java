package Recursion;

import java.util.*;

public class ArraySorted {
    public static boolean arrsot(int[] arr, int i) {
        if (i == arr.length - 1) {
            return true;
            
        }
        if (arr[i] > arr[i + 1]) {
            return false;
        }
        return arrsot(arr, i + 1);
    }
    public static void main(String args[]) {
        int arr[] = { 1, 2, 3, 4 };
        System.out.println(arrsot(arr, 0));
    }
    
}
