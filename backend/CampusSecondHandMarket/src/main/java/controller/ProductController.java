package controller;

import generator.entity.Product;
import generator.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/products")
public class ProductController {

    @Autowired
    private ProductService productService;

    @GetMapping
    public List<Product> getAllProducts() {
        return productService.list();
    }

    @PostMapping
    public boolean createProduct(@RequestBody Product product) {
        return productService.save(product);
    }
}