package Arrays;

import java.util.Scanner;

public class inputarray {
    public static void Basic(String args[]) {
        int marks[] = new int[100];
        Scanner sc = new Scanner(System.in);
        marks[0] = sc.nextInt();
        marks[1] = sc.nextInt();
        marks[2] = sc.nextInt();
        System.out.println("Physics" + marks[0]);
        System.out.println("Chemistry" + marks[1]);
        System.out.println("Maths" + marks[2]);

    }
}
