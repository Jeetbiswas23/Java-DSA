package Recursion;

public class tiling {
    public static int tilingpr(int n) {
        if (n == 1 || n == 0) {
            return 1;
        }
        //Vertical
        int fnm1 = tilingpr(n - 1);
        //Horizontal
        int fnm2 = tilingpr(n - 2);
        
        return fnm1 + fnm2;
    }
    public static void main(String args[]) {
        int n = 3;
        System.out.println(tilingpr(n));

    }
    
}
