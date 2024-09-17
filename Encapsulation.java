package BasicThings;

class value {
    private int num;  //DATA HIDING

    public void setValue(int y) {  //DATA ABSTRACTION`

        num =y;
    }

    int getValue() {

        return num;
    }
}
public class Encapsulation {
    public static void main(String[] args) {
        value obj=new value();
        obj.setValue(100);
        System.out.println("getValue is "+(obj.getValue()));
        System.out.println(obj);
    }
}
