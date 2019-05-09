package com.webproject.googlemapspringbootstarter.config;


import com.webproject.googlemapspringbootstarter.geolocation.GeolocationService;
import com.webproject.googlemapspringbootstarter.geolocation.GeolocationServiceImpl;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConditionalOnProperty(prefix = "google.map", name = "api.key")
@EnableConfigurationProperties(GoogleMapProperties.class)
public class GoogleMapConfiguration {

    @Bean
    GeolocationService geolocationService() {
        return new GeolocationServiceImpl();
    }

}
