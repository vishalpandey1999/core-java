package SuperPractice;
class Employee{
    private String name;
    private String job_title;
    private double salary;

    public Employee(String name, String job_title, double salary){
        this. name = name;
        this.job_title = job_title;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public String getJob_title() {
        return job_title;
    }

    public double getSalary() {
        return salary;
    }

    public void raise_salary(int percentage){
        salary = salary + salary * percentage/100;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", job_title='" + job_title + '\'' +
                ", salary=" + salary +
                '}';
    }
}

public class Employee_Test_class {
    public static void main(String[] args) {
        Employee e1 = new Employee("Vishal Pandey", "Web developer", 2345000.09);
        Employee e2 = new Employee("Manish Tiwari", "ABM", 2345600.09);
        Employee e3 = new Employee("Raj Pandey", "Java developer", 4345000.09);
        Employee e4 = new Employee("Shivam Tiwari", "Data Science", 2545000.09);

        System.out.println(e1);
        System.out.println(e2);
        System.out.println(e3);
        System.out.println(e4);
    }
}
