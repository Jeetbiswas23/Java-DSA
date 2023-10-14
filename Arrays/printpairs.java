package Arrays;

public class printpairs {
    public static void printpairs(int num[]) {
        int tp=0;
        for (int i = 0; i < num.length; i++) {
            int curr = num[i];
            for (int j = i + 1; j < num.length; j++) {
                System.out.print("(" + curr + "," + num[j] + ")");
                tp++;
            }
            System.out.println();
        }System.out.println("Total no of pairs:"+" "+tp);

    }
    public static void main( String args[]){
        int num[] = { 2, 4, 6, 8, 10 };
        printpairs(num);
    }
    
}
/*
"DRY RUN"


The num array is initialized with values { 2, 4, 6, 8, 10 }.

Call printpairs(num):

a. Outer loop starts with i = 0:
- curr = num[0] = 2 i. Inner loop starts with `j = i + 1` => `j = 1`:
     - Print `(2,4)`
     
 ii. `j` increments to 2:
     - Print `(2,6)`
     
 iii. `j` increments to 3:
     - Print `(2,8)`
     
 iv. `j` increments to 4:
     - Print `(2,10)`
 
 v. Inner loop ends for `i = 0`. Print a new line.
b. Outer loop increments i to 1:
- curr = num[1] = 4

 i. Inner loop starts with `j = 2`:
     - Print `(4,6)`
     
 ii. `j` increments to 3:
     - Print `(4,8)`
     
 iii. `j` increments to 4:
     - Print `(4,10)`
 
 iv. Inner loop ends for `i = 1`. Print a new line.
Outer loop increments i to 2:
- curr = num[2] = 6

 i. Inner loop starts with `j = 3`:
     - Print `(6,8)`
     
 ii. `j` increments to 4:
     - Print `(6,10)`
 
 iii. Inner loop ends for `i = 2`. Print a new line.
Outer loop increments i to 3:
- curr = num[3] = 8 i. Inner loop starts with `j = 4`:
     - Print `(8,10)`
 
 ii. Inner loop ends for `i = 3`. Print a new line.
Outer loop increments i to 4. Since i = 4 is the last element, the inner loop will not run for this iteration since j = i + 1 will be out of the array's bounds.

Return to main method. printpairs function has finished its execution.

The console will display:
(2,4)(2,6)(2,8)(2,10)
(4,6)(4,8)(4,10)
(6,8)(6,10)
(8,10)
 */
