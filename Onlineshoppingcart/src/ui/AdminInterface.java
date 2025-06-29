package ui;

import model.Product;
import model.User;
import service.ProductService;
import util.InputUtil;

public class AdminInterface {
    private final ProductService productService = new ProductService();

    public void show(User admin) throws Exception {
        int choice;
        do {
            System.out.println("\n Admin Menu:");
            System.out.println("1. View All Products");
            System.out.println("2. Add New Product");
            System.out.println("0. Logout");

            choice = InputUtil.getInt("Select option: ");

            switch (choice) {
                case 1 -> viewAllProducts();
                case 2 -> addProduct();
                case 0 -> System.out.println(" Logging out...");
                default -> System.out.println(" Invalid choice.");
            }
        } while (choice != 0);
    }

    private void viewAllProducts() throws Exception {
        for (Product p : productService.getAllProducts()) {
            System.out.printf("%d: %s | ₹%.2f | Stock: %d | %s\n",
                    p.getId(), p.getName(), p.getPrice(), p.getStock(), p.getCategory());
        }
    }

    private void addProduct() throws Exception {
        String name = InputUtil.getString("Name: ");
        String desc = InputUtil.getString("Description: ");
        double price = InputUtil.getDouble("Price: ");
        int stock = InputUtil.getInt("Stock: ");
        String category = InputUtil.getString("Category: ");
        Product p = new Product(0, name, desc, price, stock, category);
        productService.addProduct(p);
        System.out.println(" Product added.");
    }
}
 