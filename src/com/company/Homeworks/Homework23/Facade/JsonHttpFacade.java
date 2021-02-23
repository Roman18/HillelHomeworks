package com.company.Homeworks.Homework23.Facade;


import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class JsonHttpFacade {

    private ObjectMapper objectMapper = new ObjectMapper();
    private HttpClient httpClient = HttpClient.newBuilder().build();

    public <T> T post(String uri, Object body, Class<T> responseClass) {
        try {

            HttpRequest httpRequest = HttpRequest.newBuilder().
                    uri(URI.create(uri)).
                    POST(HttpRequest.BodyPublishers.ofString(objectMapper.writeValueAsString(body)))
                    .header("Accept", "application/json")
                    .headers("Content-type", "application/json")
                    .build();
            HttpResponse<String> response = httpClient.send(httpRequest, HttpResponse.BodyHandlers.ofString());
            return objectMapper.readValue(response.body(), responseClass);
        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }
        return null;
    }

    public <T> T get(String uri, Class<T> responseClass){
        try {
        HttpRequest httpRequest= HttpRequest.newBuilder().
                uri(URI.create(uri)).
                GET()
                .headers("Content-type", "application/json")
                .build();
            HttpResponse<String> response  = httpClient.send(httpRequest, HttpResponse.BodyHandlers.ofString());
            return objectMapper.readValue(response.body(), responseClass);
        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }
    return null;
    }


   public<T> T getAuthorized(String uri, Class<T> responseClass,String token){
       try {
            HttpRequest httpRequest = HttpRequest.newBuilder().
                    uri(URI.create(uri)).
                    GET()
                    .header("Authorization", "Bearer " + token)
                    .header("Accept", "application/json")
                    .headers("Content-type", "application/json")
                    .build();
       HttpResponse<String> response = httpClient.send(httpRequest, HttpResponse.BodyHandlers.ofString());
           return objectMapper.readValue(response.body(), responseClass);
       } catch (InterruptedException | IOException e) {
           e.printStackTrace();
       }
       return null;
   }

    public<T> T postAuthorized(String uri, Object body, Class<T> responseClass,String token){
        try {
            HttpRequest httpRequest = HttpRequest.newBuilder().
                    uri(URI.create(uri)).
                    POST(HttpRequest.BodyPublishers.ofString(objectMapper.writeValueAsString(body)))
                    .header("Authorization", "Bearer " + token)
                    .header("Accept", "application/json")
                    .headers("Content-type", "application/json")
                    .build();
            HttpResponse<String> response = httpClient.send(httpRequest, HttpResponse.BodyHandlers.ofString());
            return objectMapper.readValue(response.body(), responseClass);
        } catch (InterruptedException | IOException e) {
            e.printStackTrace();
        }
        return null;
    }

}
