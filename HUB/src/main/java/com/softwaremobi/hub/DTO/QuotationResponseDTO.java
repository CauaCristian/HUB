package com.softwaremobi.hub.DTO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class QuotationResponseDTO {
    private String cdUrl;
    private String productId;
    private String name;
    private Double price;
    private Integer availableStock;
}
