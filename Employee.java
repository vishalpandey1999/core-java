package CodeWithHarryOOPS;

public class Employee {
    private int salary;
    private String name;


    public void setName(String name) {
        this.name = name;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public int getSalary() {
        return salary;
    }

    public void employeeDetails(){
        System.out.println("Name -> "+name);
        System.out.println("Salary -> "+salary);
    }
}
