package com.softwaremobi.hub.Controllers;

import com.softwaremobi.hub.DTO.QuotationResponseDTO;
import com.softwaremobi.hub.Services.QuotationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@RequestMapping("/quotation")
public class QuotationController {
    @Autowired
    private QuotationService quotationService;

    @GetMapping("/{productId}/{quantity}")
    public ArrayList<QuotationResponseDTO> getQuotation(@PathVariable String productId, @PathVariable int quantity) {
        return quotationService.getQuotation(productId, quantity);
    }
}
