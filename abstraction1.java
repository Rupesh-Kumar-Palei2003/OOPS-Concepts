package BasicThings;

abstract class animal1
{
 public abstract void sound();

}
class Tiger extends animal1
{
    public void sound()
    {

        System.out.println("BasicThings.Tiger is roar.......");
    }
}
class cow extends animal1
{
    public void sound()
    {
        System.out.println("BasicThings.cow is moo....... ");
    }
}
public class abstraction1 {
    public static void main(String[] args) {
        cow obj =new cow();
        obj.sound();
        Tiger obj1 =new Tiger();
        obj1.sound();

    }
}
