package com.ub.brewerygateway.config;

import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Configuration;

@Configuration
public class GoogleConfig {
    public RouteLocator googleRouteConfig(RouteLocatorBuilder builder) {
        return builder.routes()
                .route(r -> r.path("/googlesearch2")
                        .filters(f -> f.rewritePath("/googlesearch2(?<segment>/?.*)", "/${segment}"))
                        .uri("https://google.com"))
                .build();
    }
}
