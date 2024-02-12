package Core_Java;

import java.util.Scanner;

class Employee {
  private String name;
  private String job_title;
  private double salary;
  public Employee(String name, String job_title, double salary){
      this.name = name;
      this.job_title = job_title;
      this.salary = salary;
  }

    public String getName() {
        return name;
    }

    public String getJob_title(){
      return job_title;
    }

    public double getSalary() {
        return salary;
    }

    public double raiseSalary(double percentage){
      return salary = salary + salary * percentage / 100;
    }

    public void employee_Details(){
        System.out.println("Employee Name: "+name);
        System.out.println("Employee Job Title: "+job_title);
        System.out.println("Salary: "+salary);
    }
}
public class test{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Employee e1 = new Employee("Vishal Pandey","Software developer", 50000);
        Employee e2 = new Employee("Vikas Pandey","Medical Representative", 70000);
        Employee e3 = new Employee("Shivam Tiwari","Data Science Engineer", 50000);
        Employee e4 = new Employee("Raj Pandey","Senior Software developer", 250000);
        e1.employee_Details();
        System.out.print("Enter raising salary percentage:");
        double pre = sc.nextDouble();
        double inc = e1.raiseSalary(pre);
        System.out.println("increase salary: "+inc);
    }
}
