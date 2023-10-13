package Arrays;
import  java.util.*;

public class largestnumber {
    public static int largestnumber(int num[]) {
        int largest = Integer.MIN_VALUE;//-infinity
        int smallest = Integer.MAX_VALUE;//+infinity
        for (int i = 0; i < num.length; i++) {
            // Update 'largest' if current number is larger
            if (largest < num[i]) {
                largest = num[i];
            }
            // Update 'smallest' if current number is smaller
            if (smallest > num[i]) {
                smallest = num[i];
            }
        }
        System.out.println("The Smallest Number is"+smallest);
        return largest;



    }

    public static void main(String args[]) {
        int num[] = { 1, 4, 3, 5, 6, 7, 9 };
        System.out.println("The Largest Number is"+largestnumber(num));
        
    }
    
}
/*
"DRY RUN"
int num[] = { 1, 4, 3, 5, 6, 7, 9 }; initializes our array.

Call largestnumber(num):

a. Start with largest = Integer.MIN_VALUE and smallest = Integer.MAX_VALUE.

b. Loop through each number in num[]:

For num[0] = 1: Update largest to 1 and smallest to 1.
For num[1] = 4: Update largest to 4. smallest remains 1.
For num[2] = 3: largest remains 4. smallest remains 1.
For num[3] = 5: Update largest to 5. smallest remains 1.
For num[4] = 6: Update largest to 6. smallest remains 1.
For num[5] = 7: Update largest to 7. smallest remains 1.
For num[6] = 9: Update largest to 9. smallest remains 1.
c. Print smallest, which is 1.

d. Return largest, which is 9.

In main(), print the result of largestnumber(num), which prints "The Largest Number is 9".

 */