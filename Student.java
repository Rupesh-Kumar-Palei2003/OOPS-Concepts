package com.rupesh.Properties.Inheritance;

public class Student {
    String name;
    int rollNo;
    String dept;
    Student child;
    Student(String name, int rollNo, String dept, Student child){
        this.name = name;
        this.rollNo = rollNo;
        this.dept = dept;
        this.child = child;
    }

    public static void main(String[] args) {

        Student childStudent = new Student("Raka", 550, "CSE", null );
        Student parentStudent = new Student("Rupesh", 21, "ECE", childStudent);
        System.out.println(childStudent.name+" "+childStudent.rollNo+" "+childStudent.dept+" "+childStudent.child);
        System.out.println(parentStudent.name+" "+parentStudent.rollNo+" "+parentStudent.dept+" "+parentStudent.child);
        System.out.println(parentStudent.child.name+" "+parentStudent.child.dept+" "+parentStudent.child.rollNo);
    }

}
