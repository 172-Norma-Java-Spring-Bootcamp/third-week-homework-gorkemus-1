package com.example.weatherappdemo.Service;


import com.example.weatherappdemo.model.WeatherModel;
import org.springframework.http.ResponseEntity;

public interface IWeatherService {
    ResponseEntity<WeatherModel> getCurrentWeatherByCity(String city);
}
