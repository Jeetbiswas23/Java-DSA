package OOPs;

public class OOP {
    public static void main(String args[]) {
        Pen p1 = new Pen();
        p1.setColour("Blue");
        System.out.println(p1.getColour());
        p1.setTip(5);
        System.out.println(p1.getTip());
        p1.setColour("Yellow");
        System.out.println(p1.getColour());
    }

}

class Pen {
    private String color;
    private int tip;

    void setColour(String newCoulor) { //Set is used for modify the value
        color = newCoulor;
    }

    void setTip(int newTip) {
        tip = newTip;
    }

    String getColour() { //Get is used for returning the value
        return this.color;
    }

    int getTip() {
        return this.tip;        
    }

}
