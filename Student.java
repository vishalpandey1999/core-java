package Student_Management_System;

import java.util.ArrayList;

public class Student {
    private int studentId;
    private String name;
    private String contactInfo;
    private ArrayList<String>courseEnrolled;
    private ArrayList<Float>grades;

    public int getStudentId() {
        return studentId;
    }

    public String getName() {
        return name;
    }

    public String getContactInfo() {
        return contactInfo;
    }


    public Student(int studentId, String name, String contactInfo) {
        this.studentId = studentId;
        this.name = name;
        this.contactInfo = contactInfo;
        courseEnrolled = new ArrayList<>();
        grades = new ArrayList<>();
    }

    public void enrollInCourse(String course, float grade){
        courseEnrolled.add(course);
        grades.add(grade);
        System.out.println(name+" has been enrolled in "+ course+" with grade of "+grade);
    }

    public void  viewTranscript(){
        System.out.println("Student Id: "+ studentId);
        System.out.println("Student Name: "+name);
        System.out.println("Enroll course: ");
        for (int i = 0; i < courseEnrolled.size(); i++) {
            System.out.println(courseEnrolled.get(i) + " - Grade: " + grades.get(i));
        }
        System.out.println("GPA: " + calculateGPA());
    }
    
    public void updateContactInfo(String newContact){
        if(newContact != null && newContact.isEmpty()){
            contactInfo = newContact;
            System.out.println(name + "'s contact information has been updated to: " + newContact);
        }else{
            System.out.println("Invalid contact information");
        }
    }

    public float calculateGPA(){

        float gpa = 0;
        if("A".equals(grades)){
            gpa = 9.0f;
        } else if ("B".equals(grades)) {
            gpa = 7.5f;
        } else if ("C".equals(grades)) {
            gpa = 6.0f;
        } else if ("D".equals(grades)) {
            gpa = 4.0f;
        } else if ("F".equals(grades)) {
            gpa = 0.0f;
        }else{
            System.out.println("Invalid grade: "+grades);
        }
        return gpa;
    }
}
