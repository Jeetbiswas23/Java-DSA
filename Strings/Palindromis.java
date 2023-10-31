package Strings;

import java.util.*;

public class Palindromis {
    public static boolean IsPalindrome(String str) {
        int n = str.length();
        for (int i = 0; i < str.length() / 2; i++) {
            if (str.charAt(i) != str.charAt(n - i - 1)) {
                //Not a palindrom
                return false;
            }

        }
        return true;

    }

    public static void main(String args[]) {
        String str = "racecar";
        boolean n = IsPalindrome(str);
        if (n == false) {
            System.out.println("The number is not Palindrome");
        } else {
            System.out.println("The number is Palindrome");
        }

    }

}

/*

"DRY RUN"

Initial string: "racecar"

n is the length of the string, which is 6.

The code then enters a loop from i = 0 to i < n / 2, which is from i = 0 to i < 3 in this case.

1st Iteration (i = 0):

i is 0, and n - i - 1 is 6 - 0 - 1 = 5.
It compares the characters at positions 0 and 5: 'r' and 'r', which are the same.
2nd Iteration (i = 1):

i is 1, and n - i - 1 is 6 - 1 - 1 = 4.
It compares the characters at positions 1 and 4: 'a' and 'c', which are not the same.
Since the characters at these positions are not the same, the function returns false immediately, indicating that the string is not a palindrome.

Output:
"The number is not Palindrome"

So, the code correctly determines that the string "racecar" is not a palindrome.

 */
