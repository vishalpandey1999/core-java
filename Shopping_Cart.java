package flipkart;

import java.util.ArrayList;

public class Shopping_Cart {
    private final ArrayList<Product> products;

    public Shopping_Cart(){
        products = new ArrayList<>();
    }

    public void addItems(Product item){
        products.add(item);
    }

    public void removeItem(Product item){
        products.remove(item);
    }

    public void totalPriceAndItems(){
         products.iterator();
    }
}
