package Strings;

public class largeststring {
    public static void main(String args[]) {
        String fruits[] = { "Apple", "Mango", "Banana" };
        String largest = fruits[0];
        for (int i = 0; i < fruits.length; i++) {
            if (largest.compareToIgnoreCase(fruits[i]) < 0) { //-ve value
                largest = fruits[i];

            }
           
        } System.out.println(largest);

    }



}
/*

"DOCUMENTATION"

    //compareTo:
// The compareTo method compares two strings lexicographically based on their Unicode values.
// It returns a negative integer if the first string comes before the second string, a positive integer if the first string comes after the second string, and 0 if the two strings are equal in lexicographic order.
// It's case-sensitive, meaning that uppercase and lowercase characters are treated differently.

// String str1 = "apple";
// String str2 = "banana";
// int result = str1.compareTo(str2); // Result will be negative because "apple" comes before "banana" in lexicographic order.

// compareToIgnoreCase:
// The compareToIgnoreCase method compares two strings lexicographically while ignoring character case.
// It returns the same result as compareTo, but it treats uppercase and lowercase characters as equal for the comparison.
String str1 = "apple";
String str2 = "APPLE";
int result = str1.compareToIgnoreCase(str2); // Result will be 0 because "apple" and "APPLE" are equal in lexicographic order when case is ignored.


// 
 */
