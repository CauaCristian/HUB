package com.softwaremobi.hub.Clients;

import com.softwaremobi.hub.DTO.ProductClientResponseDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name= "cd2Client", url = "${cds.cd2.url}")
public interface Cd2Client {
    @GetMapping("/")
    boolean isLive();
    @GetMapping("/Product/info/{name}")
    ProductClientResponseDTO getProductInfo();
}
