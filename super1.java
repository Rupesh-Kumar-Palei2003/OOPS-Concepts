package BasicThings;

class A1 {
    String s="Rupesh";
    void show() {


         s = new String("Rupesh ");
        System.out.println(" " + s);
    }
}
class B1 extends A1
{
    void show2(){
        String s=new String("kumar");
        System.out.println(super.s);
        System.out.println(s);
    }
}
public class super1 {
    public static void main(String[] args) {
        B1 obj =new B1();
        obj.show2();
    }
}
