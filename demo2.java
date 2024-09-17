package BasicThings;

import java.util.*;
import java.lang.*;
    class Student {

        int roll;
        String str;
        char sec;

        void input() {
            Scanner sc = new Scanner(System.in);
            str = sc.nextLine();
            roll = sc.nextInt();
            sec = sc.next().charAt(0);
        }


        {
            System.out.println("enter name,Roll number and section");
        }
    }



    class Details extends Student
    {

        void show()
        {
            System.out.println(str);
            System.out.println(roll);
            System.out.println(sec);
        }
    }
    public class demo2
    {
        public static void main(String[] args) {
            Details obj =new Details();
            obj.input();
            obj.show();

        }
    }





