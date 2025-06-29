package com.softwaremobi.hub.Clients;

import com.softwaremobi.hub.DTO.ProductClientResponseDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name= "cd1Client", url = "${cds.cd1.url}")
public interface Cd1Client {
    @GetMapping("/")
    boolean isLive();
    @GetMapping("products/name/{name}")
    ProductClientResponseDTO getProductInfo(@PathVariable String name);
}
