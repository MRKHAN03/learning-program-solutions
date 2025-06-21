package Week1.DataStructuresAndAlgorithms.InventoryManagementSystem.Code;

public class Product {
    private String productId;
    private String productName;
    private int productQuantity;
    private double price;

    Product(String id , String name , int quantity , double price){
        this.productId =id;
        this.productName = name;
        this.productQuantity = quantity;
        this.price = price;
    }

     public String getProductId() {
         return productId;
     }

     public String getProductName() {
         return productName;
     }

     public int getQuantity() {
         return productQuantity;
     }

     public double getPrice() {
         return price;
     }

     public void setQuantity(int quantity) {
         this.productQuantity = quantity;
     }

     public void setPrice(double price) {
         this.price = price;
     }

     @Override
     public String toString() {
         return "Product ID: " + productId +
                 ", Product Name: " + productName +
                 ", Quantity: " + productQuantity +
                 ", Price: " + price;
     }
}
