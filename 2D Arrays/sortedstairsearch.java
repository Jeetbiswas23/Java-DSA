package TwodArray;

public class sortedstairsearch {
    public static boolean stairsearch(int matrix[][], int key) {
        int row = 0,col = matrix[0].length - 1;
        while (row < matrix.length && col >= 0) {
            if (matrix[row][col] == key) {
                System.out.println("Found at(" + row + "," + col + ")");
                return true;
            } else if (key < matrix[row][col]) {
                col--; //Left

            } else {//key < matrix[row][col]
                row++; //Bottom

            }
        }
        System.out.println("Key not Found");
        return false;   



    }

    public static void main(String args[]) {
        int matrix[][]={{10,20,30,40},
                        {15,25,35,45},
                        {27,29,37,48},
                        {32,33,39,50} };
        int key = 33;
        stairsearch(matrix, key);     

    
    }
    
}

/*

"DRY RUN"

he element (key) we are looking for: 33.

Initialize row to 0 and col to the last column, matrix[0].length - 1 which is 3.

The loop will run as long as row is less than the number of rows and col is greater than or equal to 0.

For row = 0 and col = 3:

matrix[0][3] is 40.
Since key (33) is less than 40, move left (col--).
Col becomes 2.
For row = 0 and col = 2:

matrix[0][2] is 30.
Since key (33) is greater than 30, move down (row++).
Row becomes 1.
For row = 1 and col = 2:

matrix[1][2] is 35.
Since key (33) is less than 35, move left (col--).
Col becomes 1.
For row = 1 and col = 1:

matrix[1][1] is 25.
Since key (33) is greater than 25, move down (row++).
Row becomes 2.
For row = 2 and col = 1:

matrix[2][1] is 29.
Since key (33) is greater than 29, move down (row++).
Row becomes 3.
For row = 3 and col = 1:

matrix[3][1] is 33.
It matches our key! So, "Found at(3,1)" is printed.
The function returns true.
The stairsearch function concludes that the key 33 exists in the matrix at the position (3, 1). */