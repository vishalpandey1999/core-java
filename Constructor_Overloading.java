package Chat_gpt_OOPS_Question;

class Product{
    private String name;
    private int price;
    private String category;

//    default Constructor
    public Product(){
        System.out.println("Default consturctor");
    }

//    parameter Constructor
    public Product(String name, int price, String category){
        this.name = name;
        this.price = price;
        this.category = category;
    }

//    second type of parameter
    public Product(String name, int price){
        this.name = name;
        this.price = price;
    }

    public Product(String name, String category){
        this.name = name;
        this.category = category;
    }

    public Product(int price, String category){
        this.price = price;
        this.category = category;
    }

    public Product(String name){
        this.name = name;

    }

    public Product(int price){
        this.price = price;
    }

    public void productInfo(){
        System.out.println("Product Name: "+name);
        System.out.println("Product Price: "+price);
        System.out.println("Product Category : "+category);
    }


}

public class Constructor_Overloading {
    public static void main(String[] args) {
        Product p=new Product("raj");
        p.productInfo();
    }
}
