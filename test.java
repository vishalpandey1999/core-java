package Student_Management_System;

public class test {
    public static void main(String[] args) {
        StudentManagementSystem sms = new StudentManagementSystem();

        Student student1 = new Student(1, "Alice", "alice@example.com");
        Student student2 = new Student(2, "Bob", "bob@example.com");

        sms.addStudent(student1);
        sms.addStudent(student2);

        student1.enrollInCourse("Math", 90.5f);
        student1.enrollInCourse("History", 88.0f);
        student2.enrollInCourse("Science", 95.5f);

        System.out.println("\nTranscript for Alice:");
        student1.viewTranscript();

        System.out.println("\nTranscript for Bob:");
        student2.viewTranscript();

        student1.updateContactInfo("alice@updated.com");
        System.out.println("Updated Contact Info for Alice: " + student1.getContactInfo());
    }
}
