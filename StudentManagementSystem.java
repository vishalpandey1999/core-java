package Student_Management_System;

import java.util.ArrayList;

public class StudentManagementSystem {
    private ArrayList<Student> students;

    public StudentManagementSystem(){
        students = new ArrayList<>();
    }

    public void addStudent(Student student){
        students.add(student);
        System.out.println("Student added: " + student.getName());
    }

    public Student findStudent(int studentId){
        for(Student student : students){
            if(student.getStudentId() == studentId){
                return student;
            }
        }
        return null;
    }
}
