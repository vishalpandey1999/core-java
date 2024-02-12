package Collection_FrameWork;

import java.util.ArrayList;
import java.util.List;

class User{
    private String name;
    private int age;
    public User(String name, int age){
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

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public void setAge(int age) {
        this.age = age;
    }
}

public class ArrayListUserDefinedObjectExample {
    public static void main(String[] args) {
        List<User> users = new ArrayList<>();
        users.add(new User("vishal Pandey", 23));
        users.add(new User("Manish Tiwari",38));
        users.add(new User("Shivam Tiwari",26));
        users.add(new User("Rohit",48));
        users.forEach(customer -> {
            System.out.println("Name: "+customer.getName() +", Age: "+customer.getAge());
        });
        System.out.println(users);

//        User u  = new User("Vishal", 23);
//        users.add(u);

    }
}
