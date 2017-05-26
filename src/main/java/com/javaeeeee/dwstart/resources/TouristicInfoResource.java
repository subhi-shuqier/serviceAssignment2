package com.javaeeeee.dwstart.resources;

import java.io.IOException;
import java.util.Arrays;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.xml.bind.JAXBException;

import com.google.maps.GeoApiContext;
import com.google.maps.GeocodingApi;
import com.google.maps.errors.ApiException;
import com.google.maps.model.AddressComponent;
import com.google.maps.model.AddressComponentType;
import com.google.maps.model.GeocodingResult;
import com.google.maps.model.LatLng;
import com.javaeeeee.dwstart.core.Country;
import com.javaeeeee.dwstart.core.Currency;
import com.javaeeeee.dwstart.core.entity.FixerApiResponse;
import com.javaeeeee.dwstart.core.entity.TouristicInfoResponse;
import com.javaeeeee.dwstart.core.entity.WeatherApiResponse;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;

@Path("/touristicInfo")
@Api(description = "This api will return the weather status and the exchange rate to USD of the given lat,lng", basePath = "/api/touristicInfo")
public class TouristicInfoResource {


    @ApiOperation(
	    produces = MediaType.APPLICATION_JSON, 
	    consumes = MediaType.APPLICATION_JSON,
	    response = TouristicInfoResponse.class,
	    value = "This api will return the weather status and the exchange rate to USD of the given lat,lng")
    
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public Response geocode(
	    @ApiParam(allowEmptyValue = false, required = true, example = "41.9164808") @QueryParam("lat") double lat, 
	    @ApiParam(allowEmptyValue = false, required = true, example = "-95.6330137") @QueryParam("lng") double lng) throws ApiException, InterruptedException, IOException, JAXBException {
	GeoApiContext context = new GeoApiContext().setApiKey("AIzaSyBlFt1lUroOqMabf7QQb7DN_CC75x_j49A");
	LatLng location = new LatLng(lat, lng);
	GeocodingResult[] result =  GeocodingApi.reverseGeocode(context, location).await();

	AddressComponent countryAC = null;
	for(AddressComponent addressComponent: result[0].addressComponents) {
	    if(Arrays.asList(addressComponent.types).contains(AddressComponentType.COUNTRY)) {
		countryAC = addressComponent;
		break;
	    }
	}

	Country country = Country.valueOf(countryAC.shortName.toUpperCase());

	FixerApiResponse fixerApiResponse = (FixerApiResponse) APIHelper.requestApi("http://api.fixer.io/latest?symbols=" + country.currency.name() + "&base=USD", "application/json", FixerApiResponse.class);

	WeatherApiResponse weatherApiResponse = (WeatherApiResponse) APIHelper.requestApi("http://samples.openweathermap.org/data/2.5/weather?lat="+lat+"&lon="+lng+"&appid=b1b15e88fa797225412429c1c50c122a1", "application/json", WeatherApiResponse.class);
	TouristicInfoResponse response = new TouristicInfoResponse();
	response.setWeatherStatus(weatherApiResponse);
	response.setCountry(country.englishName);
	if(!country.currency.equals(Currency.USD)){
	    response.setExchangeRate(fixerApiResponse.getRates().get(country.currency.name()));
	}else {
	    response.setExchangeRate(1.0);
	}

	return Response.ok(response).build();
    }

}
