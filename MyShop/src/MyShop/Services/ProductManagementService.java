package MyShop.Services;

import MyShop.Enteties.Product;

import java.util.List;

public interface ProductManagementService {

    List<Product> getProducts();

    Product getProductById(int productIdToAddToCart);
}
