package model;

public class Order {
    private int id;
    private int userId;
    private double total;
    private String createdAt;
    private String status;

    public Order(int id, int userId, double total, String createdAt, String status) {
        this.id = id;
        this.userId = userId;
        this.total = total;
        this.createdAt = createdAt;
        this.status = status;
    }

    public int getId() { return id; }
    public int getUserId() { return userId; }
    public double getTotal() { return total; }
    public String getCreatedAt() { return createdAt; }
    public String getStatus() { return status; }

    public void setId(int id) { this.id = id; }
    public void setUserId(int userId) { this.userId = userId; }
    public void setTotal(double total) { this.total = total; }
    public void setCreatedAt(String createdAt) { this.createdAt = createdAt; }
    public void setStatus(String status) { this.status = status; }
}
