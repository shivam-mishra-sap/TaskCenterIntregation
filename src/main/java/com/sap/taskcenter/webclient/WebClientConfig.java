package com.sap.taskcenter.webclient;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.function.client.WebClient;

@Configuration
public class WebClientConfig {

    @Value("${k2.base.url}")
    private String k2BaseUrl;

    @Value("${apiKey}")
    private String apiKey;

    @Value("${authorizationToken}")
    private String authorizationToken;

    @Bean
    public WebClient webClient() {
        return WebClient.builder()
                .baseUrl(k2BaseUrl)
                .defaultHeader("Authorization", "Bearer " + authorizationToken)
                .defaultHeader("apiKey", apiKey)
                .build();
    }
}
