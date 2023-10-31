package Strings;

import java.util.*;

public class ShortestPath {
    public static float getShortestpath(String path) {
        int x = 0, y = 0;
        for (int i = 0; i < path.length(); i++) {
            char dir = path.charAt(i);
            //South
            if (dir == 'S') {
                y--;
            } else if (dir == 'N') {
                y++;
            } else if (dir == 'W') {
                x--;
            } else {
                x++;
            }
        }
        int X2 = x * x;
        int Y2 = y * y;
        return (float)Math.sqrt(X2+Y2);

    }

    public static void main(String args[]) {
        String path = "WNEENESENNN";
        System.out.println(getShortestpath(path));
    }
    
}
/*

"DRY RUN"

Initialize x and y to 0 (starting at the origin).

Iterating through the characters in the input string "WNEENESENNN":

'W': Move one step West, x becomes -1, and y remains 0.
'N': Move one step North, x remains -1, and y becomes 1.
'E': Move one step East, x becomes 0, and y remains 1.
'E': Move one step East again, x becomes 1, and y remains 1.
'N': Move one step North, x remains 1, and y becomes 2.
'E': Move one step East, x becomes 2, and y remains 2.
'S': Move one step South, x remains 2, and y becomes 1.
'E': Move one step East, x becomes 3, and y remains 1.
'N': Move one step North, x remains 3, and y becomes 2.
'N': Move one step North again, x remains 3, and y becomes 3.
Now, calculate the Euclidean distance from the origin (0,0) to the final position (3,3) using the Pythagorean theorem:

X2 (square of the change in x) = (3 - 0) * (3 - 0) = 9
Y2 (square of the change in y) = (3 - 0) * (3 - 0) = 9
Calculate the square root of the sum of X2 and Y2:

sqrt(X2 + Y2) = sqrt(9 + 9) = sqrt(18)
So, the correct shortest path based on the input string "WNEENESENNN" is 5.0. 
*/