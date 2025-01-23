package com.sap.taskcenter.webclient;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.function.client.WebClient;

@Configuration
public class WebClientConfig {

    @Value("${k2.base.url}")
    private String k2BaseUrl;

    @Bean
    public WebClient webClient() {
        return WebClient.builder()
                .baseUrl(k2BaseUrl)
                .defaultHeader("APIKey", "2yv1cgp66ZASiJS33Vqwaz7jUJIG5dbG")
                .build();
    }

}
