package Core_Java;

import java.util.ArrayList;

class Student{
    private String name;
    private String grade;
    private ArrayList<String>courses;

    public Student(String name, String grade){
        this.name = name;
        this.grade = grade;
        this.courses = new ArrayList<String>();
    }

    public String getName() {
        return name;
    }

    public String getGrade() {
        return grade;
    }

    public ArrayList<String> getCourses() {
        return courses;
    }

    public void add_Course(String course){
        courses.add(course);
    }

    public void remove_Course(String course){
        courses.remove(course);
    }

    public void studentInfo(){
        System.out.println("Name: "+name);
        System.out.println("Grade: "+grade);
    }
}

public class Student_Course {
    public static void main(String[] args) {
        Student s1 = new Student("Vishal Pandey","A");
        Student s2 = new Student("Raj Pandey","A+");
        Student S3 = new Student("Shivam Tiwari", "A");
        System.out.println("Adding course for "+s1.getName());
        s1.getCourses().add("Mathe");
        s1.getCourses().add("English");
        s1.getCourses().add("computer Science");
        System.out.println(s1.getName()+"s courses: "+s1.getCourses());

        System.out.println("Adding course for "+s2.getName());
        s2.getCourses().add("HINDI");
        s2.getCourses().add("POLITICAL SCIENCE");
        s2.getCourses().add("HISTORY");
        System.out.println(s2.getName()+"s courses: "+s2.getCourses());
        s2.remove_Course("HINDI");
        System.out.println("After removing "+s2.getName()+"s courses: "+s2.getCourses());
    }
}
