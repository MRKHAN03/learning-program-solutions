package Week1.DataStructuresAndAlgorithms.InventoryManagementSystem.Code;

import java.io.PrintStream;
import java.util.HashMap;

public class InventoryManager {

    private HashMap<String , Product> inventory;

    public InventoryManager(){
        inventory = new HashMap<>();
    }


    //add product
    public void addProduct(Product product){
        inventory.put(product.getProductId(),product);
        System.out.println("Product Added : ");
        System.out.println(product);
        System.out.println();
    }

    //update product
    public void updateProduct(String id , int newQuantity , double newPrice){
        Product product = inventory.get(id);
        if(product!=null){
            product.setQuantity(newQuantity);
            product.setPrice(newPrice);
            System.out.println("Product Updated : ");
            System.out.println(product);
            System.out.println();
        }
        else {
            System.out.println("Product "+id+ " Not Found");
            System.out.println();
        }
    }

    public void deleteproduct(String id){
        Product removed = inventory.remove(id);
        if (removed!=null){
            System.out.println("Product Removed : ");
            System.out.println(removed);
            System.out.println();
        }
        else {
            System.out.println("Product "+id+ " Not Found");
            System.out.println();
        }
    }

    public  void listAllProducts(){
        if(inventory.isEmpty()){
            System.out.println("Inventory is Empty!!");
        }
        else {
            for (Product product : inventory.values()){
                System.out.println(product);
            }
        }
    }
}
