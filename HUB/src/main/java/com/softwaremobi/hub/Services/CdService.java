package com.softwaremobi.hub.Services;

import com.softwaremobi.hub.Clients.Cd1Client;
import com.softwaremobi.hub.Clients.Cd2Client;
import com.softwaremobi.hub.Clients.Cd3Client;
import com.softwaremobi.hub.Clients.Cd4Client;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Value;

@Service
public class CdService {

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

    public List<String> getAvailableCds() {
        List<String> cdsDisponiveis = new ArrayList<>();

        try { if (cd1Client.isLive()) cdsDisponiveis.add(cd1Url); } catch (Exception ignored) {}
        try { if (cd2Client.isLive()) cdsDisponiveis.add(cd2Url); } catch (Exception ignored) {}
        try { if (cd3Client.isLive()) cdsDisponiveis.add(cd3Url); } catch (Exception ignored) {}
        try { if (cd4Client.isLive()) cdsDisponiveis.add(cd4Url); } catch (Exception ignored) {}

        return cdsDisponiveis;
    }
}
