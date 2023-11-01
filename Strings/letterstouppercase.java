package Strings;

import java.util.*;

public class letterstouppercase {
    public static String touppercase(String str) {
        StringBuilder sb = new StringBuilder("");
        char ch = Character.toUpperCase(str.charAt(0));
        sb.append(ch);
        for (int i = 1; i < str.length(); i++) {
            if (str.charAt(i) == ' '&& i<str.length()-1) {
                sb.append(str.charAt(i));
                i++;
                sb.append(Character.toUpperCase(str.charAt(i)));
            } else {
                sb.append(str.charAt(i));
            }
            
        }
        return sb.toString();
    }

    public static void main(String args[]) {
        String str = "hi, i am jeet biswas";
        System.out.println(touppercase(str));
     }
    
}
/*

"DRY RUN"

Input string: "hello WORLD"
Initialize an empty StringBuilder sb.
Capitalize the first character 'h' and append it to sb, so sb contains "H".
Enter a loop starting from i = 1 (second character).
At i = 1, 'e' is not a space, so it's appended as is. sb = "H e".
i = 2 points to the space character ' ', and i < str.length() - 1 is true.
Append the space character to sb. sb = "H e ".
Increment i, so i = 3.
Append the capitalized 'W' to sb. sb = "H e W".
The loop continues to the next character.
At i = 4, 'O' is not a space, so it's appended as is. sb = "H e WO".
The loop ends.
Return sb.toString(), which is "H e WO."
The code correctly capitalizes the first letter of each word and leaves the other letters as they are. The output is "H e WO" for the input "hello WORLD."
 */