package BasicThings;

class vehicle
{
    void run()
    {
        System.out.println("Vehicle is running .......");
    }
}
class bike extends vehicle
{
    void run()
    {
        super.run();
        System.out.println("Bike is running ......");
    }
}
class car extends bike
{
    void run()
    {
        super.run();
        System.out.println("Car is running ......,");
    }
}

public class overriding_method {
    public static void main(String[] args) {
       car obj=new car();
        obj.run();

    }
}
