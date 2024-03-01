package Arraylist;

import java.util.*;

public class sizeArraylist {
    public static void main(String args[]) {
        ArrayList<Integer> List = new ArrayList<>();
        List.add(1);
        List.add(2);
        List.add(3);
        List.add(4);
        List.add(5);
        List.add(6);
        System.out.println(List.size());
        System.out.println();

        //For loop for printing the Arraylist
        for (int i = 0; i < List.size(); i++) {
            System.out.println(List.get(i));
        }
        System.out.println();


    }
    
}
