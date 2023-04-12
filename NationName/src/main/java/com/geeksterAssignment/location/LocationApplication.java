package com.geeksterAssignment.location;

import org.json.JSONObject;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URI;
import java.net.URL;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

@SpringBootApplication
public class LocationApplication {

	public static void main(String[] args) throws  Exception{

		 String url ="https://api.nationalize.io/?name=nathaniel";
		HttpRequest request=HttpRequest.newBuilder().uri(URI.create(url)).build();
		var client= HttpClient.newBuilder().build();
		HttpResponse<String> response = client.send(request,HttpResponse.BodyHandlers.ofString());
		System.out.println(response.statusCode());
		System.out.println(response.body());

	}

}
