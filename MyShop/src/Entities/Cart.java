package Entities;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Cart {
    private List<Product> products;

    {
        products = new ArrayList<>();
    }

    public boolean isEmpty() {
        return products.isEmpty();
    }

    public void addProduct(Product product) {
        if (product == null) {
            return;
        }
        products.add(product);
    }

    public List<Product> getProducts() {
     //   return Collections.unmodifiableList(this.products); // returns unmodifiable List
        return products;
    }

    public void clear() {
        products.clear();
    }
}
