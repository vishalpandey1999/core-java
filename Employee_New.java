package OOPSforSetGet;

public class Employee_New {
    private String name;
    private String joining;
    private int employee_id;
    private String position;
    private int salary;
    private String dateOfBirth;
    private String address;

    public Employee_New(String name, String joining, int employee_id, String position, int salary, String dateOfBirth, String address ){
        this.name = name;
        this.joining = joining;
        this.employee_id = employee_id;
        this.position = position;
        this.salary = salary;
        this.dateOfBirth = dateOfBirth;
        this.address = address;
    }

    public String getName(){
        return name;
    }

    public String getJoining(){
        return joining;
    }

    public int getEmployee_id() {
        return employee_id;
    }

    public String getPosition() {
        return position;
    }

    public int getSalary() {
        return salary;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public String getAddress() {
        return address;
    }
}
