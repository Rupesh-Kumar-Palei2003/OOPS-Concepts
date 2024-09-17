package BasicThings;

class Demo3
{
    void Eat()
    {

    System.out.println("Eating.....");
}
}
class dog extends Demo3
{
    void sleep()
    {
        System.out.println("sleeping...");
    }
}
class ketten extends Demo3
{
    void meow()
    {
        System.out.println("meowing....");
    }
        }

public class Hierarchical_Inheritance {
    public static void main(String[] args) {
        ketten obj =new ketten();
        obj.Eat();
        obj.meow();
        //obj.sleep();
    }
}
