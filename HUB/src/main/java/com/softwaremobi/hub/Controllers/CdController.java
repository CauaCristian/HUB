package com.softwaremobi.hub.Controllers;

import com.softwaremobi.hub.Services.CdService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/cds")
public class CdController {

    @Autowired
    private CdService cdService;

    @GetMapping("/disponiveis")
    public List<String> getCdsDisponiveis() {
        return cdService.getAvailableCds();
    }
}
