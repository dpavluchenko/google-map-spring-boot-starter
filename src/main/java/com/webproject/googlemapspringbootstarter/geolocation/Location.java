package com.webproject.googlemapspringbootstarter.geolocation;

import lombok.Getter;

@Getter
public class Location {
    /** The latitude of this location. */
    private double lat;

    /** The longitude of this location. */
    private double lng;

    public Location(double lat, double lng) {
        this.lat = lat;
        this.lng = lng;
    }
}
