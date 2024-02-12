package Inventory_Management_System;

public class Product {
    private String name;
    private double price;
    private int stockQuantity;
    private String category;
    private String supplier;

    public Product(String name, double price, int stockQuantity, String category, String supplier) {
        this.name = name;
        this.price = price;
        this.stockQuantity = stockQuantity;
        this.category = category;
        this.supplier = supplier;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int getStockQuantity() {
        return stockQuantity;
    }

    public String getCategory() {
        return category;
    }

    public String getSupplier() {
        return supplier;
    }

    public void updateStock(int quantity){
        if(quantity > 0){
            stockQuantity += quantity;
            System.out.println("Stock update new quantity: "+stockQuantity);
        }else{
            System.out.println("Invalid entry not update quantity");
        }
    }

    public void displayDetails(){
        System.out.println("Name:-"+name);
        System.out.println("Price:-"+price);
        System.out.println("Stock Quantity:-"+stockQuantity);
        System.out.println("Category:-"+category);
        System.out.println("Supplier:-"+supplier);
    }
}
