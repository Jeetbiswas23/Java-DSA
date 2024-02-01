package Recursion;

public class BinaryString {
    public static void binarystringj(int n, int LastPlace, String newstr) {
        if (n == 0) {
            System.out.println(newstr);
            return;
        }
        binarystringj(n - 1, 0, newstr + "0");
        if (LastPlace == 0) {
            binarystringj(n-1, 1, newstr+"1");
        }

        
    }
    public static void main(String argss[]) {
        binarystringj(3, 0, "");
    }
    
}

