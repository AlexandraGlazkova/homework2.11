package pro.sky.homework211.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import pro.sky.homework211.basket.Product;
import pro.sky.homework211.service.ProductService;

import java.util.List;

@RestController
@RequestMapping("/store/order")
public class ProductController {
    private final ProductService productService;

    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping("/add")
    public Product addProduct(@RequestParam("add") int productID ) {
        return productService.add(productID);
    }
    @GetMapping("/get")
    public List<Product> getProduct() {
        return productService.get();
    }

}
