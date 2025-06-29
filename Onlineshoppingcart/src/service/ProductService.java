package service;

import dao.ProductDAO;
import model.Product;

import java.util.List;

public class ProductService {
    private ProductDAO productDAO = new ProductDAO();

    public List<Product> getAllProducts() throws Exception {
        return productDAO.getAll();
    }

    public Product getProductById(int id) throws Exception {
        return productDAO.getById(id);
    }

    public void addProduct(Product product) throws Exception {
        productDAO.addProduct(product);
    }

    public void updateStock(int productId, int quantity) throws Exception {
        productDAO.updateStock(productId, quantity);
    }
}
