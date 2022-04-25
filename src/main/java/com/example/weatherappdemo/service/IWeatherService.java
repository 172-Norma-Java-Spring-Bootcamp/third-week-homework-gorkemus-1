package com.example.weatherappdemo.service;


import com.example.weatherappdemo.model.WeatherModel;
import org.springframework.http.ResponseEntity;

public interface IWeatherService {
    ResponseEntity<WeatherModel> getCurrentWeatherByCity(String city);
}
