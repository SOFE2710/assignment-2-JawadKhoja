/*
Jawad Khoja
Assignment 2
*/
public class Person
{
    protected String name;

    // constructors
    public Person(String initialName) // intialized variable
    {
    }
    public Person()
    {
    }
    public void setName( String fullName)
    {
    }
    public String getName() // returns the name variable to be printed
    {
        return null;
    }
    // this method is necessary because in TestApp.java, Student object is assigned to Parent object
    // and then these methods are called
    public String toString()
    {
        return null;
    }
}
