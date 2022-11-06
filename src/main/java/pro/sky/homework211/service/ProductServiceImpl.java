package pro.sky.homework211.service;

import org.springframework.stereotype.Service;
import pro.sky.homework211.basket.Product;


import javax.annotation.PostConstruct;
import java.util.Set;

@Service
public class ProductServiceImpl implements ProductService {
    private Product product;

    public ProductServiceImpl(Product product) {

        this.product = product;
    }

    @PostConstruct
    public void init() {
        System.out.println("Сервис");
    }
    @Override
    public void add(Set<Integer> productIDs) {
        if (product==null) {
            Product product =new Product();
        }
        product.add(productIDs);
    }

    @Override
    public Set <Integer> get() {
        return product.getProductIDs();
    }
}


