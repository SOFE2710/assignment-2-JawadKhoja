/*
Jawad Khoja
Assignment 2
*/
import java.util.Vector;
public class Student extends Person
{
    private String id;
    private Vector<Course> courses; // contains all courses the student is registered in
    private String name;

    public String getName() // gets students name
    {
        return name;
    }
    public String getId() // gets students Id
    {
        return id;
    }
    // constructor
    public Student(String id, String name) // initialize name and id. Also initialize the Vector
    {
        this.id = id;
        this.name = name;
        courses = new Vector<>();
    }
    // registering the student for the given course
    public void registerFor(Course course)
    {
        if (!courses.contains(course))
        {
            courses.add(course);
        }
    }
    public boolean isRegisteredInCourse(Course course) // returns the courses to the student
    {
        return courses.contains(course);
    }
    public String toString()
    {
        String z=" ";
        for (Course v:courses)
        {
            z+= v.getCode()+ " " + v.getNumber() + " ,";
        }
        return name+ " "  + id + " \n" + " register courses"+ z ;
    }
}
