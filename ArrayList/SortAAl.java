package Arraylist;

// import java.util.ArrayList;

// import java.util.Collections;
import java.util.*;

public class SortAAl {
    public static void main(String args[]) {
        ArrayList<Integer> List = new ArrayList<>();
        List.add(2);
        List.add(3);
        List.add(1);
        List.add(9);
        List.add(8);

        System.out.println(List);
        Collections.sort(List);//By default it use Accending Order
        System.out.println(List);

        //Decending Order
        Collections.sort(List, Collections.reverseOrder());
        // This Collections.reverseOrder() is a Comparator--> function Logic
        System.out.println(List);

    }
    
}
