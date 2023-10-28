package TwodArray;

import java.util.*;
public class diagonalsum {
    
    public static int DiagonalSum(int matrix[][]) {
        int sum = 0;
        //BRUTE FORCE CODE
        // for (int i = 0; i < matrix.length; i++) {
        //     for (int j = 0; j < matrix[0].length ; j++) {   //Time complexity is O(n^2)
        //         if (i == j) {
        //             sum += matrix[i][j];
        //         } else if (i + j == matrix.length - 1) {
        //             sum += matrix[i][j];
        //         }

        //     }
        // }
        // return sum;
        //OPTIMISED CODE
        for (int i = 0; i < matrix.length; i++) {
            //Primary Diagonal                          Time complexity is O(n)
            sum += matrix[i][i];
            //Secondary Diagonal
            if (i != matrix.length - i - 1) {
                sum += matrix[i][matrix.length - i - 1];
            }
            
        }
        return sum;

    }

    public static void main(String args[]) {
        int matrix[][] = { { 1, 2, 3, 4 },
                { 5, 6, 7, 8 },
                { 9, 10, 11, 12 },
                { 13, 14, 15, 16 } };
        System.out.println(DiagonalSum(matrix));    
    }
    
}

/*

"DRY RUN"

Initialize sum to 0.

Loop from i = 0 to matrix.length - 1:

For i = 0:

Add matrix[0][0] (Primary Diagonal) → 1 to sum.
Add matrix[0][3] (Secondary Diagonal) → 4 to sum.
Sum: 5
For i = 1:

Add matrix[1][1] (Primary Diagonal) → 6 to sum.
Add matrix[1][2] (Secondary Diagonal) → 7 to sum.
Sum: 18
For i = 2:

Add matrix[2][2] (Primary Diagonal) → 11 to sum.
Add matrix[2][1] (Secondary Diagonal) → 10 to sum.
Sum: 39
For i = 3:

Add matrix[3][3] (Primary Diagonal) → 16 to sum.
Add matrix[3][0] (Secondary Diagonal) → 13 to sum.
Sum: 68
Return the value of sum which is 68.

The main method calls DiagonalSum and then prints this value, so the output of the code is indeed 68. */