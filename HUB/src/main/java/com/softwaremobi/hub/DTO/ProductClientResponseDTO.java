package com.softwaremobi.hub.DTO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class ProductClientResponseDTO {
    private String id;
    private String name;
    private String description;
    private Double price;
    private Integer stock;
}
