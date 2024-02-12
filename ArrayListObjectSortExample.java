package Collection_FrameWork;

import java.util.*;

class Person{
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}

public class ArrayListObjectSortExample {
    public static void main(String[] args) {
        List<Person> people = new ArrayList<>();
        people.add(new Person("Vishal",23));
        people.add(new Person("Vikas",21));
        people.add(new Person("Rohit",20));
        people.add(new Person("Shree",18));
        System.out.println("People: "+people);

        people.sort((person1,person2) -> {
            return person1.getAge() - person2.getAge();
        });
    }
}
