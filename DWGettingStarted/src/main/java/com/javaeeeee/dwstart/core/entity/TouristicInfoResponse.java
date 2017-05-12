package com.javaeeeee.dwstart.core.entity;

public class TouristicInfoResponse {
    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public Double getExchangeRate() {
        return exchangeRate;
    }

    public void setExchangeRate(Double exchangeRate) {
        this.exchangeRate = exchangeRate;
    }

    public WeatherApiResponse getWeatherStatus() {
        return weatherStatus;
    }

    public void setWeatherStatus(WeatherApiResponse weatherStatus) {
        this.weatherStatus = weatherStatus;
    }

    private String country;
    
    private Double exchangeRate;
    
    private WeatherApiResponse weatherStatus;
    
    
}
