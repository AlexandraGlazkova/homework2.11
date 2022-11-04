package pro.sky.homework21.service;

import pro.sky.homework21.basket.Product;

import java.util.List;

public interface ProductService {

    Product add(int productID);

    List<Product> get();
}

