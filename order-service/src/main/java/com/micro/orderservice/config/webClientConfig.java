package com.micro.orderservice.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.function.client.WebClient;

@Configuration
public class webClientConfig {
    @Bean
    @LoadBalanced // -> automatically do the client side load balancing
    public WebClient.Builder webClientBuilder() {
        return WebClient.builder();
    }
}
