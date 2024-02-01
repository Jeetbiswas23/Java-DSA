package Recursion;

public class FriendsPair {
    public static int Friendsppa(int n) {
        if (n == 1 || n == 2) {
            return n;
        }

        return Friendsppa(n - 1) + (n - 1) * Friendsppa(n - 2);
        // //Choice
        // //Single
        // int fnm1 = Friendsppa(n - 1);

        // //Pairs
        // int fnm2 = Friendsppa(n - 2);
        // int PairrsWays = (n - 1) * fnm2;

        // return PairrsWays + fnm1;

    }

    public static void main(String args[]) {
        System.out.println(Friendsppa(3));

    }
    
}
