package Inventory_Management_System;

import java.util.ArrayList;
import java.util.List;

public class InventoryManagementSystem {
    private List<Product> products;
    private List<Category> categories;
    private List<Supplier> suppliers;

    public InventoryManagementSystem() {
        products = new ArrayList<>();
        categories = new ArrayList<>();
        suppliers = new ArrayList<>();
    }

    public List<Product> getProducts() {
        return products;
    }

    public List<Category> getCategories() {
        return categories;
    }

    public List<Supplier> getSuppliers() {
        return suppliers;
    }


}
