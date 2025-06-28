package com.softwaremobi.hub.Services;

import com.softwaremobi.hub.DTO.QuotationResponseDTO;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class QuotationService {
    public ArrayList<QuotationResponseDTO>  getQuotation(String productId,int quantity){
        return  new ArrayList<>();
    }
}
