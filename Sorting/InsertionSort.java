package Sorting;

public class InsertionSort {
    public static void Insertionsortsort(int num[]) {
        for (int i = 1; i < num.length; i++) {
            int curr = num[i];
            int prev = i - 1;
            //Finding all correct position to insert
            while (prev >= 0 && num[prev] > curr) {//If num[prev] > curr then it is in desending order ouput is 5 4 3 2 1
                num[prev + 1] = num[prev];
                prev--;

            }
            //insertion
            num[prev + 1] = curr;
        }

    }

    public static void Printarr(int num[]) {
        for (int k = 0; k < num.length; k++) {
            System.out.print(num[k] + " ");

        }
        System.out.println();

    }

    public static void main(String args[]) {
        int num[] = { 5, 4, 1, 3, 2 };
        Insertionsortsort(num);
        Printarr(num);


    }
}
/*


Dry Run:
Initial array:
5, 4, 1, 3, 2

Insertion Sort:
Insertion sort works by building a sorted array one element at a time. 
It does this by repeatedly taking one element from the unsorted array and moving it into its correct position within the sorted array.

1st Iteration (i = 1, because the 0th element is considered sorted):

curr = 4 (the first unsorted element)
prev = 0 (last element of the sorted segment)
Since num[prev] (which is 5) > curr (which is 4):
Set num[prev + 1] (or num[1]) to num[prev] (or num[0]). So, num[1] = 5.
Decrement prev to -1.
Now, insert curr into num[prev + 1] (or num[0]). So, num[0] = 4.
Resultant array:
4, 5, 1, 3, 2

2nd Iteration (i = 2):

curr = 1
prev = 1
Since num[prev] (which is 5) > curr (which is 1):
Set num[prev + 1] (or num[2]) to num[prev] (or num[1]). So, num[2] = 5.
Decrement prev to 0.
Since num[prev] (which is 4) > curr (which is 1):
Set num[prev + 1] (or num[1]) to num[prev] (or num[0]). So, num[1] = 4.
Decrement prev to -1.
Now, insert curr into num[prev + 1] (or num[0]). So, num[0] = 1.
Resultant array:
1, 4, 5, 3, 2

3rd Iteration (i = 3):

curr = 3
prev = 2
Since num[prev] (which is 5) > curr (which is 3):
Set num[prev + 1] (or num[3]) to num[prev] (or num[2]). So, num[3] = 5.
Decrement prev to 1.
Since num[prev] (which is 4) > curr (which is 3):
Set num[prev + 1] (or num[2]) to num[prev] (or num[1]). So, num[2] = 4.
Decrement prev to 0.
Since num[prev] (which is 1) is NOT > curr, stop there.
Now, insert curr into num[prev + 1] (or num[1]). So, num[1] = 3.
Resultant array:
1, 3, 4, 5, 2

4th Iteration (i = 4):

curr = 2
prev = 3
Since num[prev] (which is 5) > curr (which is 2):
Set num[prev + 1] (or num[4]) to num[prev] (or num[3]). So, num[4] = 5.
Decrement prev to 2.
This process continues until curr is inserted at the correct position (just after the 1).
Final array:
1, 2, 3, 4, 5

After all iterations, the array is sorted. The Printarr method then prints the sorted array. */