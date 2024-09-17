package BasicThings;

import java.util.Scanner;
class rupesh
{

    int add()
    {
        int a,b,c;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter two number ");
        a=sc.nextInt();
        b=sc.nextInt();
        c=a+b;
        return c;
    }
    void add(int x,float f)
    {
        System.out.println("add is "+(x+f));
    }
}
class raka extends rupesh
{
    void add(int x,float f, double d)
    {

        System.out.println(" "+(f+x+d));
    }
}
public class method_overloading {
    public static void main(String[] args) {
        raka obj =new raka();
       int r= obj.add();
        System.out.println(r);
       obj.add(10,9.8f);

        obj.add(10,12.3f,100.5);


    }
}
