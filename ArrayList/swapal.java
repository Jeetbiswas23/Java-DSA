package Arraylist;
import java.util.ArrayList;

public class swapal {
    public static void swap(ArrayList<Integer> List, int ind1, int ind2) {
        int temp = List.get(ind1);
        List.set(ind1, ind2);
        List.set(ind2, temp);
    }
    public static void main(String args[]) {
        ArrayList<Integer> List = new ArrayList<>();
        List.add(1);
        List.add(5);
        List.add(7);
        List.add(6);
        int ind1 = 1;
        int ind2 = 3;
        System.out.println(List);
        swap(List, ind1, ind2);
        System.out.println(List);

    }
    
}
