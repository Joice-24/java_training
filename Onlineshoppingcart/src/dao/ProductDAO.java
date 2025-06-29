package dao;

import model.Product;
import java.sql.*;
import java.util.*;

public class ProductDAO {
    public List<Product> getAll() throws Exception {
        List<Product> list = new ArrayList<>();
        String sql = "SELECT * FROM products";
        try (Connection conn = DBConnection.getConnection();
             Statement st = conn.createStatement();
             ResultSet rs = st.executeQuery(sql)) {
            while (rs.next()) {
                list.add(new Product(
                    rs.getInt("id"), rs.getString("name"),
                    rs.getString("description"), rs.getDouble("price"),
                    rs.getInt("stock"), rs.getString("category")
                ));
            }
        }
        return list;
    }

    public Product getById(int id) throws Exception {
        String sql = "SELECT * FROM products WHERE id=?";
        try (Connection conn = DBConnection.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                return new Product(
                        rs.getInt("id"), rs.getString("name"),
                        rs.getString("description"), rs.getDouble("price"),
                        rs.getInt("stock"), rs.getString("category")
                );
            }
        }
        return null;
    }

    public void addProduct(Product product) throws Exception {
        String sql = "INSERT INTO products(name, description, price, stock, category) VALUES (?, ?, ?, ?, ?)";
        try (Connection conn = DBConnection.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setString(1, product.getName());
            ps.setString(2, product.getDescription());
            ps.setDouble(3, product.getPrice());
            ps.setInt(4, product.getStock());
            ps.setString(5, product.getCategory());
            ps.executeUpdate();
        }
    }

    public void updateStock(int productId, int quantity) throws Exception {
        String sql = "UPDATE products SET stock = stock - ? WHERE id = ?";
        try (Connection conn = DBConnection.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setInt(1, quantity);
            ps.setInt(2, productId);
            ps.executeUpdate();
        }
    }
}
