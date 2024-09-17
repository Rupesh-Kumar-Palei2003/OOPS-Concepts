package BasicThings;

public class StaticBlock {
    private static int a = 5;
    private static int b;
    static{
        System.out.println("i am in static block....");
        StaticBlock.a *= 20;
    }

    public static void main(String[] args) {
//        BasicThings.StaticBlock obj = new BasicThings.StaticBlock();
        System.out.println(StaticBlock.a +" "+ StaticBlock.b);
        StaticBlock.b = 999;
//        BasicThings.StaticBlock obj2 = new BasicThings.StaticBlock();
        System.out.println(StaticBlock.a +" "+ StaticBlock.b);


    }
}
