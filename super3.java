package BasicThings;

class A3
{
    int x;
    String s;
    float f;
    A3(int x,String s,float f)
    {
        this.x=x;
        this.s=s;
        this.f=f;
    }
    void show3()
    {
        System.out.println(x+ " "+s+" "+f+" ");
    }
}
class B3 extends A3
{
    String str;int y;
    B3(String str,int y)
    {
        super(100,"Rupesh",8.3f);
        this.str=str;
        this.y=y;
        super.show3();
        System.out.println(str+" "+y);

    }


}
public class super3 {
    public static void main(String[] args) {
        B3 obj =new B3("BasicThings.raka",10);


    }
}
