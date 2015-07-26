package com.example.android.sunshine.app;

/**
 * Created by hfathelb on 7/25/15.
 */
public class WeatherUriBuilder {

    private String countryCode;
    private int zipCode;
    private int daysCount;
    private String format;

    public WeatherUriBuilder(String countryCode, int zipCode, int daysCount, String format) {
        this.countryCode = countryCode;
        this.zipCode = zipCode;
        this.daysCount = daysCount;
        this.format = format;
    }

    public String buildUrl(){
        String url = "http://api.openweathermap.org/data/2.5/forecast/daily?zip="+zipCode+","+countryCode+"&mode="+format+"&units=metric&cnt="+daysCount;
        return url;
    }
}
