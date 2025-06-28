package com.softwaremobi.hub.Services;

import com.softwaremobi.hub.Models.ProductModel;
import com.softwaremobi.hub.Repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductService {
    @Autowired
    private ProductRepository productRepository;

    public ProductModel getProductByName(String name) {
        if(productRepository.findByName(name) == null) {
            ProductModel productModel = new ProductModel();
            productModel.setName(name);
            return productRepository.save(productModel);
        }
        return productRepository.findByName(name);
    }

}
