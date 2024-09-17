package BasicThings;

abstract class fruit
{
    abstract void test();
    abstract void colour();
}
class mango extends fruit
{
    void test()
    {
        System.out.println("sweet ");
    }
    void colour()
    {
        System.out.println("yellow ");
    }

}
class apple extends fruit
{
    void test()
    {
        System.out.println("a little sweet : ");
    }
    void colour()
    {
        System.out.println("red");
    }
}
public class abstract3 {
    public static void main(String[] args) {
        mango m=new mango();
        m.test();
        m.colour();
        apple a=new apple();
        a.colour();
        a.test();
    }

}
