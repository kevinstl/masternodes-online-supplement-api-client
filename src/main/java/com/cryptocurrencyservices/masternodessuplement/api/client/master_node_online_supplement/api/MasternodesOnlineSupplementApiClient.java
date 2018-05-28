package com.cryptocurrencyservices.masternodessuplement.api.client.master_node_online_supplement.api;

import com.cryptocurrencyservices.masternodessuplement.api.client.master_node_online_supplement.ClientConfiguration;
import org.springframework.cloud.netflix.feign.FeignClient;

@FeignClient(name="${MasterNodeOnlineSupplement.name:MasterNodeOnlineSupplement}", url="${MasterNodeOnlineSupplement.url:http://localhost:8081}", configuration = ClientConfiguration.class)
public interface MasternodesOnlineSupplementApiClient extends MasternodesOnlineSupplementApi {
}
