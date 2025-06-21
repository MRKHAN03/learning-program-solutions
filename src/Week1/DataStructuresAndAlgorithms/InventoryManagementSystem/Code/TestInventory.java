package Week1.DataStructuresAndAlgorithms.InventoryManagementSystem.Code;

public class TestInventory {
    public static void main(String[] args) {
        InventoryManager manager = new InventoryManager();

        Product p1 = new Product("P101" , "Keyboard" , 15,700.00);
        Product p2 = new Product("P102" , "Mouse" , 20 , 450.00);
        Product p3 = new Product("103" , "Printer" , 10,2000.00);

        System.out.println("ADD PRODUCTS : ");
        manager.addProduct(p1);
        manager.addProduct(p2);
        manager.addProduct(p3);

        System.out.println("UPDATE PRODUCTS : ");
        manager.updateProduct("P102",15,500);
        manager.updateProduct("P104",15,500);

        System.out.println("DELETE PRODUCTS : ");
        manager.deleteproduct("103");
        manager.deleteproduct("104");

        System.out.println("DISPLAY INVENTORY : ");
        manager.listAllProducts();
    }
}
