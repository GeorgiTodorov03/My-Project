package Entities;

public class Product {
    private int id;
    private String productName;
    private String categoryName;
    private double price;

    public Product() {
    }

    public Product(int id, String productName, String categoryName, double price) {
        this.id = id;
        this.productName = productName;
        this.categoryName = categoryName;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public String getProductName() {
        return productName;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Product id=" + id + ", product name=" + productName
                + ", category name=" + categoryName + ", price=" + price;
    }

    public void setCategoryName(String categoryName) {
        if(categoryName.trim() == "" && categoryName == null) {
            return;
        }
        this.categoryName = categoryName;
    }

    public void setProductName(String productName) {
        if(productName.trim() == "" && productName == null) {
            return;
        }
        this.productName = productName;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int compareTo(Product otherProduct) {
        return this.id - otherProduct.getId();
    }
}
