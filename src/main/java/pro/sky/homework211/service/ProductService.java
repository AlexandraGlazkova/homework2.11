package pro.sky.homework211.service;

import pro.sky.homework211.basket.Product;

import java.util.List;

public interface ProductService {

    Product add(int productID);

    List<Product> get();
}

