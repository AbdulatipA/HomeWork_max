package org.example.serializationJackson;

//https://jsonplaceholder.typicode.com/users


import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        ObjectMapper mapper = new ObjectMapper();
        String url = "https://jsonplaceholder.typicode.com/users";
        List<User> userList = new ArrayList<>();
        HttpClient httpClient = HttpClient.newHttpClient();
        HttpRequest httpRequest = HttpRequest.newBuilder()
                .uri(URI.create(url))
                .GET()
                .build();

        String responseJson = null;

        try {
          HttpResponse<String> response =  httpClient.send(httpRequest, HttpResponse.BodyHandlers.ofString());
          responseJson = response.body();
          userList = mapper.readValue(responseJson, new TypeReference<List<User>>(){});
        } catch (IOException | InterruptedException e) {
            throw new RuntimeException(e);
        }

        if (responseJson == null) {
            return;
        }

        User user = userList.get(0);

        System.out.println(userList);
        System.out.println(user);
    }
}


