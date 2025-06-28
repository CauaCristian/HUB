package com.softwaremobi.hub.DTO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class QuotationResponseDTO {
    private Integer quantity;
    private Double price;
    private String url;
}
