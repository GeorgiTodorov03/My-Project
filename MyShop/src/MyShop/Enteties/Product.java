package MyShop.Enteties;

public interface Product {

    int getId();

    String getProductName();

    String getCategoryName();

    double getPrice();

    void setPrice(double price);
}
