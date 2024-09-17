package College.Wallah.com;

public class StudentDetails {
    private String name;
    private int rollNo;
    private double mark;
    // using setter method we can access weather the name is private.
    public void setName(String name){
        this.name = name;
    }
    public void setRollNo(int rollNo){
        this.rollNo = rollNo;
    }
    public void setMark(double mark){
        this.mark = mark;
    }
    public String getName(){
        return name;
    }
    public int getRollNo(){
        return rollNo;
    }
    public double getMark(){
        return mark;
    }
}
