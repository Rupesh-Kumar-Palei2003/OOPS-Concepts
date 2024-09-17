package BasicThings;

class Dog
{
    void eat()
    {
        System.out.println("BasicThings.Dog is Eating......");
    }
    void bark()
    {
        System.out.println("BasicThings.Dog is Barking.....");
    }
}
class puppy extends Dog{
    void play()
    {
        System.out.println("BasicThings.puppy is playing....");
    }
}
class cat extends puppy{
    void meow()
    {
        System.out.println("BasicThings.cat is meowing.....");
    }
}

public class Animal {
    public static void main(String[] args) {
        cat obj =new cat();
        obj.bark();
        obj.play();
        obj.eat();
        obj.meow();
    }
}
