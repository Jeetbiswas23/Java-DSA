package Sorting;
//import java.util.Arrays; --> for Assending Order Sorting
//import java.util.collections; --> for Desending Order(Arrays.sort(num, Collections.reverseOrder());)
import java.util.*;;

public class InbuiltSort {
    public static void Printarr(int num[]) { //for Collections.reverseOrder() there should be a object  Integer num[] 
        for (int i = 0; i < num.length; i++) {
            System.out.print(num[i]+" ");
        }
        System.out.println();
    }
    public static void main(String args[]) {
        int num[] = { 1, 5, 3, 4, 2 };//for Collections.reverseOrder() there should be a object  Integer num[] = { 1, 5, 3, 4, 2 };
        Arrays.sort(num);            //These are for Sorting in Assending Order
        //Arrays.sort(num,0,3);      //These are for Sorting in Assending Order
        //Arrays.sort(num, Collections.reverseOrder());--> for desending order

        Printarr(num);

    }
}
