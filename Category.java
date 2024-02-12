package Inventory_Management_System;

public class Category {
    private String name;

    public Category(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void displayDetails(){
        System.out.println("Category Name: "+name);
    }
}
