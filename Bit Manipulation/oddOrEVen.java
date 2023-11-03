package BitManipulation;

public class oddOrEVen {
    public static void OddorEven(int n) {
        int BitMark = 1;
        if ((n & BitMark)== 0) {
            //Even Number
            System.out.println("EVEN NUMBER");
        } else {
            //Odd Number
            System.err.println("ODD NUMBER");
        }

    }

    public static void main(String args[]) {
        OddorEven(5);
        OddorEven(7);
        OddorEven(10);
        
    }
    
}
