package Arrays;

import java.util.*;

public class function{
    public static void update(int marks[]) {
        for (int i = 0; i < marks.length; i++) {
            marks[i] = marks[i] + 1;
            System.out.println(marks[i]);
                
            }
        // It takes Call by reference as the value is changed 
        //in update function so it will change in main function also
    }


    public static void main(String args[]) {
        int marks[] = { 99, 98, 99 };
        update(marks);
        //for verification
        for (int i = 0; i < marks.length; i++) {
            System.out.println(marks[i]);
                
        }

        

        
    }
}
