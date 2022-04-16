package com.example.weatherappdemo.Service;

import com.example.weatherappdemo.model.WeatherModel;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
@Slf4j
public class WeatherService implements IWeatherService {

    private final RestTemplate restTemplate;
    public WeatherService(RestTemplate restTemplate){
        this.restTemplate=restTemplate;
    }

    @Override
    public ResponseEntity<WeatherModel> getCurrentWeatherByCity(String city) {
        String api ="https://api.openweathermap.org/data/2.5/weather?q="+
                city+"&appid=cb167b5e66486a4f6e78f5ceda194072&units=metric";
        ResponseEntity<WeatherModel> result = restTemplate.
                getForEntity(api,WeatherModel.class);
        WeatherModel weatherModel = result.getBody();

        return result;
    }
}
