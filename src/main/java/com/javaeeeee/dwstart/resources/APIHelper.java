package com.javaeeeee.dwstart.resources;

import java.io.IOException;

import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.util.EntityUtils;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class APIHelper {

    public static Object requestApi(String url, String contentType, Class responseClass)
	    throws IOException, ClientProtocolException, JsonParseException, JsonMappingException {
	DefaultHttpClient httpClient = new DefaultHttpClient();
	Object responseObj = null;
	try {
	    HttpGet getRequest = new HttpGet(url);
	    getRequest.addHeader("accept", contentType);
	    HttpResponse response = httpClient.execute(getRequest);

	    //verify the valid error code first
	    int statusCode = response.getStatusLine().getStatusCode();
	    if (statusCode != 200) 
	    {
		//throw new RuntimeException("Failed with HTTP error code : " + statusCode);
	    }

	    HttpEntity httpEntity = response.getEntity();
	    String apiOutput = EntityUtils.toString(httpEntity);
	    ObjectMapper mapper = new ObjectMapper();
	    responseObj = mapper.readValue(apiOutput, responseClass);
	} finally
	{
	    //Important: Close the connect
	    httpClient.getConnectionManager().shutdown();
	}
	return responseObj;
    }

}
