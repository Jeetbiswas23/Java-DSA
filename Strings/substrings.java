package Strings;

import java.util.*;

public class substrings {
    // public static String Substrings(String str, int si, int ei) {
    //     String substring = "";
    //     for (int i = si; i < ei; i++) {
    //         substring += str.charAt(i); 

    //     }                                          //This is used for the Substring Logic
    //     return substring;
    // }

    // public static void main(String args[]) {
    //     String str = "HelloWorld";
    //     System.out.println(Substrings(str, 0, 5));
    // }
    

    //Without writing any logic we have a function of Substring wich is
    //In Java, the substring method is used to extract a portion of a string. 
    //It allows you to specify the starting and ending indices to extract a substring from the original string.
    // The general syntax for using the substring method is:
    // String substring(int startIndex);
    // String substring(int startIndex, int endIndex);

    public static void main(String args[]) {
        String str = "HelloWorld";
        System.out.println(str.substring(0, 5));
    }

}
