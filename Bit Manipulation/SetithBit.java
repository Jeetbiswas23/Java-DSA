package BitManipulation;

import java.beans.IntrospectionException;

public class SetithBit {
    public static int setithBit(int n, int i) {
        int Bitmask = 1 << i;
        return n | Bitmask;
    }

    public static void main(String args[]) {
        System.out.println(setithBit(10, 2));
        
        
    }
    
}
