package com.javaeeeee.dwstart.core.entity;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class WeatherApiResponse {
    @JsonProperty("coord")
    private Object coord;
    @JsonProperty("weather")
    private Object weather;
    @JsonProperty("base")
    private Object base;
    @JsonProperty("main")
    private Object main;
    @JsonProperty("wind")
    private Object wind;
    @JsonProperty("clouds")
    private Object clouds;
    @JsonProperty("dt")
    private Object dt;
    @JsonProperty("sys")
    private Object sys;
    @JsonProperty("id")
    private Object id;
    @JsonProperty("name")
    private Object name;
    @JsonProperty("cod")
    private Object cod;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("coord")
    public Object getCoord() {
	return coord;
    }

    @JsonProperty("coord")
    public void setCoord(Object coord) {
	this.coord = coord;
    }

    @JsonProperty("weather")
    public Object getWeather() {
	return weather;
    }

    @JsonProperty("weather")
    public void setWeather(Object weather) {
	this.weather = weather;
    }

    @JsonProperty("base")
    public Object getBase() {
	return base;
    }

    @JsonProperty("base")
    public void setBase(Object base) {
	this.base = base;
    }

    @JsonProperty("main")
    public Object getMain() {
	return main;
    }

    @JsonProperty("main")
    public void setMain(Object main) {
	this.main = main;
    }

    @JsonProperty("wind")
    public Object getWind() {
	return wind;
    }

    @JsonProperty("wind")
    public void setWind(Object wind) {
	this.wind = wind;
    }

    @JsonProperty("clouds")
    public Object getClouds() {
	return clouds;
    }

    @JsonProperty("clouds")
    public void setClouds(Object clouds) {
	this.clouds = clouds;
    }

    @JsonProperty("dt")
    public Object getDt() {
	return dt;
    }

    @JsonProperty("dt")
    public void setDt(Object dt) {
	this.dt = dt;
    }

    @JsonProperty("sys")
    public Object getSys() {
	return sys;
    }

    @JsonProperty("sys")
    public void setSys(Object sys) {
	this.sys = sys;
    }

    @JsonProperty("id")
    public Object getId() {
	return id;
    }

    @JsonProperty("id")
    public void setId(Object id) {
	this.id = id;
    }

    @JsonProperty("name")
    public Object getName() {
	return name;
    }

    @JsonProperty("name")
    public void setName(Object name) {
	this.name = name;
    }

    @JsonProperty("cod")
    public Object getCod() {
	return cod;
    }

    @JsonProperty("cod")
    public void setCod(Object cod) {
	this.cod = cod;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
	return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
	this.additionalProperties.put(name, value);
    }

}
