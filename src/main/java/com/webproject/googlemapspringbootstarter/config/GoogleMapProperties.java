package com.webproject.googlemapspringbootstarter.config;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = "google.map")
@Getter
@Setter
public class GoogleMapProperties {
    private String apiKey;
}
