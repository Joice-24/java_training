package dao;

import model.Order;
import model.OrderItem;
import java.sql.*;
import java.util.List;

public class OrderDAO {

    public int createOrder(Order order) throws Exception {
        String sql = "INSERT INTO orders(user_id, total, created_at, status) VALUES (?, ?, ?, ?)";
        try (Connection conn = DBConnection.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS)) {
            ps.setInt(1, order.getUserId());
            ps.setDouble(2, order.getTotal());
            ps.setString(3, order.getCreatedAt());
            ps.setString(4, order.getStatus());
            ps.executeUpdate();

            ResultSet rs = ps.getGeneratedKeys();
            if (rs.next()) return rs.getInt(1);
        }
        return -1;
    }

    public void addOrderItems(int orderId, List<OrderItem> items) throws Exception {
        String sql = "INSERT INTO order_items(order_id, product_id, quantity, price) VALUES (?, ?, ?, ?)";
        try (Connection conn = DBConnection.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql)) {

            for (OrderItem item : items) {
                ps.setInt(1, orderId);
                ps.setInt(2, item.getProductId());
                ps.setInt(3, item.getQuantity());
                ps.setDouble(4, item.getPrice());
                ps.addBatch();
            }
            ps.executeBatch();
        }
    }
}
