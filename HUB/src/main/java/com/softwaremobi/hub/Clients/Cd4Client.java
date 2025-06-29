package com.softwaremobi.hub.Clients;

import com.softwaremobi.hub.DTO.ProductClientResponseDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name= "cd4Client", url = "${cds.cd4.url}")
public interface Cd4Client {
    @GetMapping("/")
    boolean isLive();
    @GetMapping("products/name/{name}")
    ProductClientResponseDTO getProductInfo(@PathVariable String name);
}
