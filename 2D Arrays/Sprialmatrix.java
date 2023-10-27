package TwodArray;

import java.util.*;
public class Sprialmatrix {
    public static void Sprialmatrixarr(int num[][]) {
        int StartRow = 0;
        int StartCol = 0;
        int endRow = num.length - 1;
        int endCol = num[0].length - 1;

        while (StartRow <= endRow && StartCol <= endCol) {
            //Top
            for (int j = StartCol; j <= endCol; j++) {
                System.out.print(num[StartRow][j] + " ");
            }
            //Right
            for (int i = StartRow + 1; i <= endRow; i++) {
                System.out.print(num[endCol][i] + " ");
            }
            //Bottom
            for (int j = endCol - 1; j >= StartCol; j--) {
                if (StartRow== endRow) {
                    break;
                }
                System.out.print(num[endRow][j] + " ");
            }
            //Left
            for (int i = endRow - 1; i >= StartRow + 1; i--) {
                if (StartCol == endCol) {
                    break;
                }
                System.out.print(num[i][StartCol] + " ");
            }
            StartCol++;
            StartRow++;
            endCol--;
            endRow--;

        }
        System.out.println();

    }

    public static void main(String args[]) {
        int num[][]={{1,2,3,4},
                     {5,6,7,8},
                     {9,10,11,12},
                { 13, 14, 15, 16 } };
        Sprialmatrixarr(num);             
    }
}
/*

"DRY RUN"

Initially:

StartRow is 0.
StartCol is 0.
endRow is 3 (the last row).
endCol is 3 (the last column).
Now, the while loop begins:

Top: Print the top row from StartCol to endCol (0 to 3).

Output: 1 2 3 4
Right: Print the right column from StartRow + 1 to endRow (1 to 3).

Output: 8 12 16
Bottom: Print the bottom row from endCol - 1 to StartCol (2 to 0).

Output: 15 14 13
Left: Print the left column from endRow - 1 to StartRow + 1 (2 to 1).

Output: 9 5
Now, we update the pointers:

Increment StartCol to 1.
Increment StartRow to 1.
Decrement endCol to 2.
Decrement endRow to 2.
The while loop continues:

Top: Print the top row from StartCol to endCol (1 to 2).

Output: 6 7
Right: Print the right column from StartRow + 1 to endRow (2 to 2).

Output: 11
Bottom: Print the bottom row from endCol - 1 to StartCol (1 to 1).

Output: 10
Left: Since StartCol is equal to endCol, we break out of the loop.

The pointers are updated again:

Increment StartCol to 2.
Increment StartRow to 2.
Decrement endCol to 1.
Decrement endRow to 1.
The while loop continues:

Top: Print the top row from StartCol to endCol (2 to 2).

Output: 7
Right: Since StartRow + 1 is greater than endRow, we break out of the loop.

The pointers are updated again:

Increment StartCol to 3.
Increment StartRow to 3.
Decrement endCol to 0.
Decrement endRow to 0.
The while loop continues:

Top: Since StartRow is greater than endRow, we break out of the loop.
The loop ends because StartRow is greater than endRow.

The final output is: 1 2 3 4 8 12 16 15 14 13 9 5 6 7 11 10.

This represents a spiral order traversal of the 2D array. */