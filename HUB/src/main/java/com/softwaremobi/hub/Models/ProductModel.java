package com.softwaremobi.hub.Models;

import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "Products")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class ProductModel {
    @Id
    private String id;
    @NotBlank
    private String name;
}
