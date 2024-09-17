package BasicThings;

abstract class Draw
{
          abstract void show();

        Draw()
        {
            System.out.println("drawing.....");
        }


}
class Square extends Draw
{
    Square()
    {
        super();
    }
     void show()
    {
        System.out.println("Drawing  a square......");
    }
}
class Rectangle extends Draw
{

    void show()
    {

        System.out.println("Drawing a BasicThings.Rectangle .......");
    }
}
public class abstraction2 {
    public static void main(String[] args) {
        Square obj=new Square();
        obj.show();
        Rectangle obj1=new Rectangle();
        obj1.show();

    }
}
