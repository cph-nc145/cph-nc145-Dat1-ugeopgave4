import java.util.ArrayList;

public class Student {
    private String name = "";
    private ArrayList<String> courses = new ArrayList<>();

    Student(String name){

    }

    private void addCourse(String Course){
        courses.add(Course);
    }

    @Override
    public String toString() {
        return "Student Name = " + name + '\'' +
                ", Courses = " + courses;
    }
}
