package com.webproject.googlemapspringbootstarter.geolocation;


import com.google.maps.GeoApiContext;
import com.google.maps.GeocodingApi;
import com.google.maps.model.GeocodingResult;
import com.google.maps.model.LatLng;
import com.webproject.googlemapspringbootstarter.exception.GeolocationException;
import org.springframework.beans.factory.annotation.Value;

import javax.annotation.PostConstruct;

public class GeolocationServiceImpl implements GeolocationService{

    @Value("${google.map.api.key}")
    private String googleApiKey;

    private GeoApiContext context;


    @Override
    public Location identifyLocation(String address) {
        GeocodingResult[] results;
        try {
            results = GeocodingApi.geocode(context, address).await();
        } catch (Exception e) {
            throw new GeolocationException(e);
        }
        LatLng location = results[0].geometry.location;
        return new Location(location.lat, location.lng);
    }

    @PostConstruct
    private void createGeoApiContext() {
        context = new GeoApiContext.Builder().apiKey(googleApiKey).build();
    }
}
