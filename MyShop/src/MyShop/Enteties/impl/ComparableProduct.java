package MyShop.Enteties.impl;

import MyShop.Enteties.Product;

public class ComparableProduct implements Product, Comparable<Product> {

    private int id;
    private String productName;
    private String categoryName;
    private double price;

    public ComparableProduct() {}

    public ComparableProduct(int id, String productName, String categoryName, double price) {
        this.id = id;
        this.productName = productName;
        this.categoryName = categoryName;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product id = " + id + ", Product name = " + productName +
                 ", Category name = " + categoryName + ", Price = " + price;
    }

    @Override
    public int getId() {
        return id;
    }

    @Override
    public String getProductName() {
        return productName;
    }

    @Override
    public String getCategoryName() {
        return categoryName;
    }

    @Override
    public double getPrice() {
        return price;
    }

    @Override
    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public int compareTo(Product otherProduct) {
        return this.id - otherProduct.getId();
    }
}
