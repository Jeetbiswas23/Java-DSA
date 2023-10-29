package Strings;

public class ChatAt {
    //The charAt method is a member of the String class in Java. It is used to retrieve the character at a specific index in a string
    public static void PrintLetters(String Fullname) {
        for (int i = 0; i < Fullname.length(); i++) {
            System.out.print(Fullname.charAt(i) + " ");
        }
        System.out.println();
        
    }

    public static void main(String[] args) {
        // String str = "Hello, World!";
        // char ch = str.charAt(2);                  //The function Of charAt()
        // System.out.println("Character at index 4: " + ch);
        String firstname = "Jeet";
        String Lastname = "Biswas";
        String Fullname = firstname + " " + Lastname; //Concatination of name of Jeet + Biswas resulting Jeet Biswas
        PrintLetters(Fullname);
        
    }    

}
