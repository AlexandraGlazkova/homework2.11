package pro.sky.homework211.service;

import org.springframework.stereotype.Service;
import org.springframework.web.context.annotation.SessionScope;
import pro.sky.homework211.basket.Product;


import java.util.List;

@Service
@SessionScope
public class ProductServiceImpl implements ProductService {
    private final List<Product> products;

    public ProductServiceImpl(List<Product> products) {
        this.products = products;
    }

    @Override
    public Product add(int productID) {
        Product product = new Product(productID);
        products.add(product);
        return product;
    }

    @Override
    public List<Product> get() {
        return products;
    }
}


