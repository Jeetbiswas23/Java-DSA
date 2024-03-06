package Arraylist;

import java.util.ArrayList;

public class multidimentional {
    public static void main(String args[]) {
        ArrayList<ArrayList<Integer>> mainList = new ArrayList<>();
        ArrayList<Integer> List = new ArrayList<>();
        ArrayList<Integer> List2 = new ArrayList<>();
        List.add(1);
        List.add(2);
        List.add(5);
        List2.add(9);
        List2.add(0);
        List2.add(7);
        mainList.add(List);
        mainList.add(List2);
        System.out.println(mainList);
        for (int i = 0; i < mainList.size(); i++) {
            ArrayList<Integer> currlist = mainList.get(i);
            for (int j = 0; j < currlist.size(); j++) {
                System.out.print(currlist.get(j)+" ");
            }
            System.out.println();
        }

    }
    
}
