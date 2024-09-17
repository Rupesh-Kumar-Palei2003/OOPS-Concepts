package BasicThings;

import java.util.*;
class A
{
    int a ,b;
    {
        Scanner sc =new Scanner(System.in);
        System.out.println("enter two number ");
        a=sc.nextInt();
        b=sc.nextInt();
    }
    void add()
    {
        System.out.println("addition is "+(a+b));
    }
    void sub()
    {
        System.out.println("subtraction  is "+(a-b));
    }
}
class B extends A{
    void mul()
    {
        System.out.println("multiplication is "+(a*b));
    }
    void div()
    {
        System.out.println("division is "+(a/b));
    }
}
class C extends  B
{
    void rem()
    {
        System.out.println("remainder is "+(a%b));
    }
}


public class multilevel_Inheritance {
    public static void main(String[] args) {
        C obj=new C();
        obj.add();
        obj.sub();
        obj.mul();
        obj.div();
        obj.rem();
    }
}
