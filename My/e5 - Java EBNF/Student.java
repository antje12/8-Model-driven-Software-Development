package university.deep_package.another_package;

import java.util.ArrayList;
import java.util.List;

public class Student extends Person {

    private int id;
    private List<Course> courses = new ArrayList<>();

    public Student(int id, String name, int age){
        super(name, age);
        this.setId(id);
    } 
    public int getId(){
        return id;
    }
    public void setId(){
        this.id = id;
    }

    public List<Course> courses(){
        return courses;
    }

    public void addCourse(Course course){
        courses.add(course);
    }
}
