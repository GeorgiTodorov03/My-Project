package MyShop.Storage;

import MyShop.Enteties.Product;

import java.util.List;

public interface ProductStoringService {

    List<Product> loadProducts();
}
