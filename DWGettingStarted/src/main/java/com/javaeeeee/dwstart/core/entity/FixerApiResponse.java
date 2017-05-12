package com.javaeeeee.dwstart.core.entity;

import java.util.Date;
import java.util.Map;

public class FixerApiResponse {
    
    public String getBase() {
        return base;
    }

    public void setBase(String base) {
        this.base = base;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Map<String, Double> getRates() {
        return rates;
    }

    public void setRates(Map<String, Double> rates) {
        this.rates = rates;
    }

    private String base;
    
    private Date date;
    
    private Map<String, Double> rates;
}
