package com.softwaremobi.hub.Services;

import com.softwaremobi.hub.Clients.Cd1Client;
import com.softwaremobi.hub.Clients.Cd2Client;
import com.softwaremobi.hub.Clients.Cd3Client;
import com.softwaremobi.hub.Clients.Cd4Client;
import com.softwaremobi.hub.DTO.ProductClientResponseDTO;
import com.softwaremobi.hub.DTO.QuotationResponseDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class QuotationService {

    @Autowired private Cd1Client cd1Client;
    @Autowired private Cd2Client cd2Client;
    @Autowired private Cd3Client cd3Client;
    @Autowired private Cd4Client cd4Client;

    @Value("${cds.cd1.url}")
    private String cd1Url;

    @Value("${cds.cd2.url}")
    private String cd2Url;

    @Value("${cds.cd3.url}")
    private String cd3Url;

    @Value("${cds.cd4.url}")
    private String cd4Url;

    public List<QuotationResponseDTO> getQuotation(String name, int quantity) {
        List<QuotationResponseDTO> results = new ArrayList<>();

        try { results.add(toQuotation(cd1Client.getProductInfo(name), cd1Url)); } catch (Exception e) { System.out.println("cd1 error: " + e.getMessage()); }
        try { results.add(toQuotation(cd2Client.getProductInfo(name), cd2Url)); } catch (Exception e) { System.out.println("cd2 error: " + e.getMessage()); }
        try { results.add(toQuotation(cd3Client.getProductInfo(name), cd3Url)); } catch (Exception e) { System.out.println("cd3 error: " + e.getMessage()); }
        try { results.add(toQuotation(cd4Client.getProductInfo(name), cd4Url)); } catch (Exception e) { System.out.println("cd4 error: " + e.getMessage()); }

        return results.stream()
                .filter(p -> p.getAvailableStock() >= quantity)
                .sorted(Comparator.comparingDouble(QuotationResponseDTO::getPrice))
                .collect(Collectors.toList());
    }

    private QuotationResponseDTO toQuotation(ProductClientResponseDTO dto, String cdUrl) {
        return new QuotationResponseDTO(
                cdUrl,
                dto.getId(),
                dto.getName(),
                dto.getPrice(),
                dto.getStock()
        );
    }
}
