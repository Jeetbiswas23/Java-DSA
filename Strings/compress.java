package Strings;

public class compress {
    public static String compress(String str) {
        StringBuilder newstr = new StringBuilder("");
        for (int i = 0; i < str.length(); i++) {
            Integer count = 1;
            while (i < str.length() - 1 && str.charAt(i) == str.charAt(i + 1)) {
                count++;
                i++;
            }
            newstr.append(str.charAt(i)); //This is for the character first like a ,b etc
            if (count > 1) {
                newstr.append(count);
            }

        }

        return newstr.toString();

    }

    public static void main(String args[]) {
        String str = "aaabbcccdd";    //output a3b2c3d2
        System.out.println(compress(str));
        
    }
    
}

/*

"DRY RUN"

Let's perform a dry run of the code using the input string "aaabbcccdd":

1. Initialize the input string `str = "aaabbcccdd"`.

2. Create a `StringBuilder` called `newstr` to store the compressed string: `newstr = ""`.

3. Start iterating through the characters in the input string with a `for` loop:

   - `i = 0`:
     - Current character is 'a'.
     - Start counting consecutive characters. Since the next character is also 'a', we increment the `count` to 2.
     - Move to the next character.
   
   - `i = 2`:
     - Current character is 'b'.
     - Append 'b' to `newstr`: `newstr = "b"`.
   
   - `i = 3`:
     - Current character is 'c'.
     - Start counting consecutive characters. Since the next character is also 'c', we increment the `count` to 2.
     - Move to the next character.
   
   - `i = 5`:
     - Current character is 'd'.
     - Append 'd' to `newstr`: `newstr = "bd"`.
   
   - `i = 6`:
     - Current character is 'd'.
     - Start counting consecutive characters. Since there are no more characters to check, the count remains 1.
   
4. The loop finishes, and we append the current character and the count to `newstr`:

   - `newstr = "bda3b2c2d"`.

5. Return the compressed string by converting the `newstr` `StringBuilder` to a regular string using the `toString()` method.

6. The final compressed string is "bda3b2c2d".

So, the code compresses the input string "aaabbcccdd" into "bda3b2c2d". The resulting string represents consecutive identical characters with the character itself followed by the count of consecutive occurrences. */