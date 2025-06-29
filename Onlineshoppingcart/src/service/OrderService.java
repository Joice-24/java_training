package service;

import dao.OrderDAO;
import dao.ProductDAO;
import model.CartItem;
import model.Order;
import model.OrderItem;
import model.Product;
import util.DateTimeUtil;

import java.util.ArrayList;
import java.util.List;

public class OrderService {
    private OrderDAO orderDAO = new OrderDAO();
    private ProductDAO productDAO = new ProductDAO();
    private CartService cartService = new CartService();

    public void checkout(int userId) throws Exception {
        List<CartItem> cartItems = cartService.getCartItems(userId);
        List<OrderItem> orderItems = new ArrayList<>();

        double total = 0;
        for (CartItem item : cartItems) {
            Product product = productDAO.getById(item.getProductId());
            if (product != null) {
                double price = product.getPrice();
                total += price * item.getQuantity();

                // Prepare order item
                orderItems.add(new OrderItem(0, item.getProductId(), item.getQuantity(), price));

                // Update stock
                productDAO.updateStock(product.getId(), item.getQuantity());
            }
        }

        Order order = new Order(0, userId, total, DateTimeUtil.getCurrentDateTime(), "PLACED");
        int orderId = orderDAO.createOrder(order);

        // Link all order items with the new order ID
        for (OrderItem item : orderItems) {
            item.setOrderId(orderId);
        }

        orderDAO.addOrderItems(orderId, orderItems);
        cartService.clearCart(userId);

        System.out.println("Order placed successfully. Total = ₹" + total);
    }
}
