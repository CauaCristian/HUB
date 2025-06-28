package com.softwaremobi.hub.Controllers;

import com.softwaremobi.hub.Services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/product")
public class ProductController {
    @Autowired
    private ProductService productService;
    @GetMapping("/{productName}")
    public String getProduct(@PathVariable String productName) {
        return productService.getProductByName(productName).getId();
    }
}
