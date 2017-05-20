package com.javaeeeee.dwstart.resources;

import java.io.IOException;
import java.io.StringReader;
import java.util.Arrays;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.util.EntityUtils;
import org.eclipse.jetty.server.Authentication.User;
import org.jsondoc.core.annotation.Api;
import org.jsondoc.core.annotation.ApiMethod;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
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

@Path("/TouristicInfo")
@Api(name = "TouristicInfo", description = "This api will return the weather status and the exchange rate to USD of the given lat,lng")
public class TouristicInfoResource {

    @ApiMethod(description = "This api will return the weather status and the exchange rate to USD of the given lat,lng")
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public Response geocode(@QueryParam("lat") double lat, @QueryParam("lng") double lng) throws ApiException, InterruptedException, IOException, JAXBException {
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