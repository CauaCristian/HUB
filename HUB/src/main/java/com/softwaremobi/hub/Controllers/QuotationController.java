package com.softwaremobi.hub.Controllers;

import com.softwaremobi.hub.DTO.QuotationResponseDTO;
import com.softwaremobi.hub.Services.QuotationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/quotation")
public class QuotationController {
    @Autowired
    private QuotationService quotationService;

    @GetMapping("/{productName}/{quantity}")
    public List<QuotationResponseDTO> getQuotation(@PathVariable String productName, @PathVariable int quantity) {
        return quotationService.getQuotation(productName, quantity);
    }
}
