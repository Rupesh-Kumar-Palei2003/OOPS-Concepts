package College.Wallah.com;


public class StudentClass {
    public static void main(String[] args) {
        StudentDetails s1 = new StudentDetails();
        s1.setName("Rupesh");
        s1.setRollNo(550);
        s1.setMark(92.56);
        System.out.println(s1.getName()+" "+ s1.getRollNo()+" "+s1.getMark()+" ");
    }
}
