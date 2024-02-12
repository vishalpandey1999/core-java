package SuperPractice;
class Person{
    private String name;
    private int age;

//    create constructor

    public Person(String name, int age){
        this.name = name;
        this.age = age;
    }

//    use getter method for getting value

    public String getName() {
        return name;
    }

    public int getAge(){
        return age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
public class Person_test {
    public static void main(String[] args) {

        Person p1 = new Person("Vishal Pandey",23);
        Person p2 = new Person("Vikas Pandey",21);
        Person p3 = new Person("Vinay Pandey",32);
        Person p4 = new Person("Vinod Pandey",37);

        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);
        System.out.println(p4);
    }
}
