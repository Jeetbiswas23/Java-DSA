package Arraylist;

import java.util.*;

public class opetaionarr {
    public static void main(String args[]) {
        ArrayList<Integer> List = new ArrayList<>();
       //add an Element O(1)
        List.add(1);
        List.add(2);
        List.add(3);
        List.add(1, 9);

        System.out.println(List);

        // //Get operation O(1)
        // int hi = List.get(2);
        // System.out.println(hi);

        // //Remove an Element O(n)
        // List.remove(2);
        // System.out.println(List);

        //Set Elements in an Index O(n)
        // List.set(0, 5);
        // System.out.println(List);

        //Contains Element O(n)
        // System.out.println(List.contains(2));
        // System.out.println(List.contains(5));

    }
    
}
