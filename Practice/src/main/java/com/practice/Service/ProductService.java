package com.practice.Service;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.practice.Model.Product;
// https://fakestoreapi.com/products/category/jewelery

@Service
public class ProductService {

    // private final String BASE_URL = "https://fakestoreapi.in/api/products";

    private final String BASE_URL = "https://fakestoreapi.com/products";

    @Autowired
    private RestTemplate restTemplate;

    public String getProductsByCategory(String category) throws IOException, Exception{

        String url = BASE_URL + "/category/"+category;

        ResponseEntity<String> response = restTemplate.getForEntity(url, String.class);
        String responseBody = response.getBody();
        // System.out.println("API Response: " + responseBody);
        System.out.println(url);
        return responseBody;

    }

    public String addProduct(Product product) {

        HttpHeaders headers = new HttpHeaders();
        headers.set("Content-Type", "application/json");

        HttpEntity<Product> request = new HttpEntity<>(product, headers);

        ResponseEntity<String> response = restTemplate.exchange(
            BASE_URL,
            HttpMethod.POST,
            request,
            String.class
        );
        return response.getBody();

    }

}
