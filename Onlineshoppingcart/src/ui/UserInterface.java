package ui;

import model.CartItem;
import model.Product;
import model.User;
import service.CartService;
import service.OrderService;
import service.ProductService;
import util.InputUtil;

import java.util.List;

public class UserInterface {
    private final ProductService productService = new ProductService();
    private final CartService cartService = new CartService();
    private final OrderService orderService = new OrderService();

    public void show(User user) throws Exception {
        int choice;
        do {
            System.out.println("\nUser Menu:");
            System.out.println("1. View Products");
            System.out.println("2. View Cart");
            System.out.println("3. Add to Cart");
            System.out.println("4. Remove from Cart");
            System.out.println("5. Checkout");
            System.out.println("0. Logout");

            choice = InputUtil.getInt("Select option: ");

            switch (choice) {
                case 1 -> viewProducts();
                case 2 -> viewCart(user.getId());
                case 3 -> addToCart(user.getId());
                case 4 -> removeFromCart(user.getId());
                case 5 -> orderService.checkout(user.getId());
                case 0 -> System.out.println("Logging out...");
                default -> System.out.println("Invalid choice.");
            }
        } while (choice != 0);
    }

    private void viewProducts() throws Exception {
        List<Product> products = productService.getAllProducts();
        System.out.printf("%-4s %-25s %-10s %-6s %-20s\n", "ID", "Name", "Price", "Stock", "Category");
        for (Product p : products) {
            System.out.printf("%-4d %-25s ₹%-9.2f %-6d %-20s\n",
                    p.getId(), p.getName(), p.getPrice(), p.getStock(), p.getCategory());
        }
    }

    private void viewCart(int userId) throws Exception {
        List<CartItem> items = cartService.getCartItems(userId);
        if (items.isEmpty()) {
            System.out.println("Your cart is empty.");
        } else {
            double total = cartService.calculateTotal(userId);
            System.out.println("Cart Items:");
            for (CartItem item : items) {
                Product p = productService.getProductById(item.getProductId());
                System.out.println("- " + p.getName() + " x" + item.getQuantity() + " @ ₹" + p.getPrice());
            }
            System.out.println("Total: ₹" + total);
        }
    }

    private void addToCart(int userId) throws Exception {
        int pid = InputUtil.getInt("Enter Product ID: ");
        int qty = InputUtil.getInt("Enter Quantity: ");
        cartService.addToCart(userId, pid, qty);
        System.out.println(" Product added to cart.");
    }

    private void removeFromCart(int userId) throws Exception {
        int pid = InputUtil.getInt("Enter Product ID to remove: ");
        cartService.removeFromCart(userId, pid);
        System.out.println("Product removed from cart.");
    }
}
