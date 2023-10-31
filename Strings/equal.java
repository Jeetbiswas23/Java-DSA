package Strings;

public class equal {
    public static void main(String args[]) {
        String str1 = "Hello";
        String str2 = "Hello";
        String str3 = new String("Hello");
        // if (str1 == str3) {
        //     System.out.println("Same String");
        // } else {
        //     System.out.println("strings are not equal");    //It is showing strings are not equalThis means that 
        //     //str1 == str3 would only be false if str1 and str3 does'nt refer to the exact same string object in memory.
        // }

        //So we use equals
        if (str1.equals(str3)) {
            System.out.println("It is Same");

        } else {
            System.out.println("It is not same");
        }
    }//This means that str1 == str3 would only be true if str1 and str3 refer to the exact same string object in memory.
    
}
