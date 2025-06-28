package com.softwaremobi.hub.Clients;

import com.softwaremobi.hub.DTO.ProductClientResponseDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name= "cd3Client", url = "${cds.cd3.url}")
public interface Cd3Client {
    @GetMapping("/")
    boolean isLive();
    @GetMapping("/Product/info/{name}")
    ProductClientResponseDTO getProductInfo(@PathVariable String name);
}
