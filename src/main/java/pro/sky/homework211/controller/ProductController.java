package pro.sky.homework211.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import pro.sky.homework211.service.ProductService;
import java.util.Set;

@RestController
@RequestMapping("/order")
public class ProductController {
    private final ProductService productService;

    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping("/add")
    public void addProduct(@RequestParam("add") Set <Integer>productIDs) {
       productService.add(productIDs);
    }
    @GetMapping("/get")
    public Set<Integer> get() {
        return productService.get();
    }

}
