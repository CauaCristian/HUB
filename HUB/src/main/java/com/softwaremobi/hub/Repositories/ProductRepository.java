package com.softwaremobi.hub.Repositories;

import com.softwaremobi.hub.Models.ProductModel;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends MongoRepository<ProductModel, String> {
    ProductModel findByName(String name);
}
