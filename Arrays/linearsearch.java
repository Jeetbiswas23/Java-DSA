package Arrays;

import java.util.Scanner;

public class linearsearch {
    public static int linearsearch(int num[], int key) {
        for (int i = 0; i < num.length; i++) {
            if (num[i] == key) {
                return i;
            }
        }
        return -1;  // return -1 or any suitable value to indicate that key was not found
    }
    

    public static void main(String args[]) {
        int num[] = { 2, 3, 4, 5, 6, 7, 9, 10 };
        Scanner sc = new Scanner(System.in);
        int key = sc.nextInt();
        int index = linearsearch(num, key);
        if (index == -1) {
            System.out.println("Index Not Available");
        } else {
            System.out.println("Index of is"+index);
        }

    }

}

/*
DRY RUN

int num[] = { 2, 3, 4, 5, 6, 7, 9, 10 }; initializes the array with given values.

User inputs a number using the Scanner object. Let's assume the user enters the value 5 as the key to search for.

Call linearsearch(num, key) with key = 5:

a. Loop through each number in num[]:

For num[0] = 2: Does not match the key.
For num[1] = 3: Does not match the key.
For num[2] = 4: Does not match the key.
For num[3] = 5: Matches the key. Return index 3.
In main(), since index is 3 and it's not equal to -1, print the result, which prints "Index of is 3".

If the user enters a number that's not in the num array (e.g., 11), the method will return -1 and the output will be "Index Not Available".

Note: The Scanner class should be imported at the beginning of the file: */