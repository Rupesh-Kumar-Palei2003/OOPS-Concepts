package BasicThings;

class Bank
{
    int getRateOfInterest()
    {
        return 0;
    }
}
class SBI extends Bank
{
    int getRateOfInterest()
    {
        return 7;
    }
}
class ICICI extends Bank
{
    int getRateOfInterest()
    {
        return 9;
    }
}
class AXIS extends Bank
{
    int getRateOfInterest()
    {
        return 8;
    }
}
public class Interest {
    public static void main(String[] args) {
        SBI obj =new SBI();
        ICICI obj2=new ICICI();
        AXIS obj3 =new AXIS();

        System.out.println("BasicThings.SBI getRateOFInterest is "+( obj.getRateOfInterest()));
        System.out.println("BasicThings.ICICI RateOFInterest is "+( obj2.getRateOfInterest()));
        System.out.println("BasicThings.AXIS getRateOFInterest is "+( obj3.getRateOfInterest()));


    }
}


