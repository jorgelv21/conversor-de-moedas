package org.example.service;

import com.google.gson.Gson;
import org.example.models.Conversor;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.ArrayList;
import java.util.List;

public class ConversorService {
    public String apiKey;
    List<Conversor> listConversor = new ArrayList<>();


    private final Conversor conversor;

    public ConversorService(Conversor conversor) {
        this.conversor = conversor;
    }

    public Double ConverterValor() {
        this.apiKey = "1514295176f12180008bd650";
        String path = this.apiKey + "/pair" + "/" + conversor.base_code + "/" + conversor.target_code + "/" + conversor.valor;

        URI uri = URI.create("https://v6.exchangerate-api.com/v6/" + path);

        try {
            HttpClient httpClient = HttpClient.newHttpClient();
            HttpRequest httpRequest = HttpRequest.newBuilder()
                    .uri(uri)
                    .build();
            HttpResponse<String> response = httpClient
                    .send(httpRequest, HttpResponse.BodyHandlers.ofString());
            String json = response.body();

            Gson gson = new Gson();
            Conversor conversor = gson.fromJson(json, Conversor.class);
            listConversor.add(conversor);
            return conversor.getConversion_result();
        } catch (Exception error) {
            throw new RuntimeException(error);
        }
    }

    public List<Conversor> getListConversor() {
        return listConversor;
    }
}

