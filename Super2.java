package BasicThings;

class A2 {
    String s="Rupesh";
     void show() {


        s = new String("BasicThings.rupesh ");
        System.out.println(" " + s);
    }
}
class B2 extends A2
{
    void show2(){
        String s=new String("kumar");
        System.out.println(super.s);

       // super.show();
        System.out.println(s);


    }
}
public class Super2 {
    public static void main(String[] args) {

        B2 obj =new B2();
        obj.show2();

    }
}


