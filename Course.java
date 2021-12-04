/*
Jawad Khoja
100786085
Assignment 2
*/

import java.util.Vector;

public class Course{
    private Department dept;
    private String title; // title of the course (e.g. Intro to programming);
    private String code; // course code, e.g. SOFE, ELEE, MANE, etc.
    private int number; // course number, e.g. 1200, 2710, 2800, etc.
    private Vector<Student> classList; // contains all students registered in this course

    public Course(String code, int number, Department dept, String title)
    {
        // also initialize the classList;
        this.code = code;
        this.number = number;
        this.dept = dept;
        this.title = title;
        classList = new Vector<Student>();

    }
    //Sends out code as value
    public String getCode()
    {
        return code;
    }
    //Sends out number as value
    public int getNumber()
    {
        return number;
    }
    //Sends out classlist as value
    public Vector<Student> getClass2()
    {
        return classList;
    }

    public String toString()
    {
        // return a string representation of the course with the course code,
        // name, and number of people registered in the course in the following
        // format:
        // SOFE 2710 Object Oriented Programming and Design, Enrollment = 260

        return code + " " + number + " " + title + ", Enrollment: " + classList.size();
    }

    //If Student isn't already in a course adds to respective one
    public void addStudentToCourse(Student James)
    {
        if(!classList.contains(James))
        {
            classList.add(James);
        }
    }
}
