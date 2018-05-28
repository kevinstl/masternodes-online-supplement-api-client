package com.cryptocurrencyservices.masternodessuplement.api.client.master_node_online_supplement;

import com.cryptocurrencyservices.masternodessuplement.api.client.ExcludeFromComponentScan;
import org.springframework.boot.autoconfigure.ImportAutoConfiguration;
import org.springframework.boot.autoconfigure.web.HttpMessageConvertersAutoConfiguration;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.feign.FeignAutoConfiguration;
import org.springframework.cloud.netflix.feign.ribbon.FeignRibbonClientAutoConfiguration;
import org.springframework.cloud.netflix.ribbon.RibbonAutoConfiguration;
import org.springframework.context.annotation.Configuration;

@Configuration
@ExcludeFromComponentScan
@EnableConfigurationProperties
@EnableDiscoveryClient
@org.springframework.cloud.netflix.feign.EnableFeignClients
@ImportAutoConfiguration({RibbonAutoConfiguration.class, FeignRibbonClientAutoConfiguration.class, FeignAutoConfiguration.class, HttpMessageConvertersAutoConfiguration.class})
public class ClientConfiguration {

}
