package com.example.weatherappdemo.controller;



import com.example.weatherappdemo.service.WeatherService;
import com.example.weatherappdemo.model.WeatherModel;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import javax.validation.constraints.NotBlank;

@RestController // this class is a RestController
@RequestMapping(path ="/weather") // Url starts with /weather
@Validated
public class WeatherController {

   private final WeatherService service;

   public WeatherController(WeatherService service) {//constuctor
      this.service = service;
   }

   @GetMapping(path ="/current/{city}")//Get request
   public ResponseEntity<WeatherModel> getCurrentWeatherByCity(@PathVariable
                                                         @Valid
                                                         @NotBlank(message ="City name is mandatory")
                                                         String city)
   {
      return service.getCurrentWeatherByCity(city);
   }

}
