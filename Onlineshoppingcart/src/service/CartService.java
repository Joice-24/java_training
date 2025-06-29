package service;

import dao.CartItemDAO;
import dao.ProductDAO;
import model.CartItem;
import model.Product;

import java.util.ArrayList;
import java.util.List;

public class CartService {
    private CartItemDAO cartItemDAO = new CartItemDAO();
    private ProductDAO productDAO = new ProductDAO();

    public void addToCart(int userId, int productId, int quantity) throws Exception {
        cartItemDAO.addOrUpdate(new CartItem(userId, productId, quantity));
    }

    public List<CartItem> getCartItems(int userId) throws Exception {
        return cartItemDAO.getByUserId(userId);
    }

    public void removeFromCart(int userId, int productId) throws Exception {
        cartItemDAO.removeItem(userId, productId);
    }

    public void clearCart(int userId) throws Exception {
        cartItemDAO.clearCart(userId);
    }

    public double calculateTotal(int userId) throws Exception {
        double total = 0;
        List<CartItem> items = getCartItems(userId);
        for (CartItem item : items) {
            Product product = productDAO.getById(item.getProductId());
            if (product != null) {
                total += product.getPrice() * item.getQuantity();
            }
        }
        return total;
    }
}
