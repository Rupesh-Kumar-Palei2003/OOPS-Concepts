package BasicThings;

class A4
{
    A4()
    {
        System.out.print("Rupesh kumar  ");
    }
}
class B4 extends A4
{
    B4()
    {
       // super();
        // it is a default in constructor.Super key word is Automatically called in java
        System.out.print("is learning java ");
    }
}
public class super4 {
    public static void main(String[] args) {
        B4 obj =new B4();

    }
}
