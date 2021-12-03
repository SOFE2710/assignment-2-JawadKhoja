import java.util.Vector;

public class Department {
    private String name;
    private String id;
    Vector<Course> courseList;
    Vector<Student> registerList;
    private Vector<Student> j = new Vector<>();
    private Vector<Student> h= new Vector<>();
    private Vector<Student> k = new Vector<>();

    public String getName() {
        return name;
    }

    public String getId() {
        return id;
    }

    public Department(String name, String id) {
        this.name = name;
        this.id = id;
        courseList = new Vector<>();
        registerList = new Vector<>();
    }

    public void offerCourse(Course course) {
        courseList.add(course);
    }

    public void printCoursesOffered() {
        for (int i = 0; i < courseList.size(); i++) {
            System.out.println("    " + courseList.get(i));
        }
    }

    public void printStudentsByName() {
        for (int i = 0; i < registerList.size(); i++) {
            System.out.println("    " + registerList.get(i) + "\n");
        }
    }

    public boolean isStudentRegistered(Student student) {
        return registerList.contains(student);
    }

    public Vector<Student> StudentsRegisteredInCourse(int code) {
        for (Course x : courseList) {
            if (x.getNumber() == code) {
                j = x.getClass2();
            }
        }
        return j;
    }

    public void printStudentsRegisteredInCourse(int i) {
        h = StudentsRegisteredInCourse(i);
        for (Student n : h) {
            System.out.println("    " + n.getName() + " " + n.getId());
        }
    }

    public Course largestCourse() {
        Course LEC, LAC = null;
        int j = 0;
        for (int i = 0; i < courseList.size(); i++) {
            LEC = courseList.elementAt(i);
            k = LEC.getClass2();
            if (j <= k.size()) {
                j = k.size();
                LAC = LEC;
            }
        }
        return LAC;
    }

    public String toString() {
        return id + ": " + String.valueOf(courseList.size()) + " courses, " + String.valueOf(registerList.size()) + " students";
    }

    public void registerStudentCourseInDepartment(Student James, Course engr1200) {
        if (!registerList.contains(James)) {
            registerList.add(James);
        }
    }

    public void registerindepartment() {

    }
}
