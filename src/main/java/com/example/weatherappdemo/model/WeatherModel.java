package com.example.weatherappdemo.model;

import lombok.Data;

import java.util.ArrayList;

@Data

public class WeatherModel {
    private Coord coord;
    private ArrayList<Weather> weather;
    private String base;
    private Main main;
    private int visibility;
    private Wind wind;
    private int dt;
    private Sys sys;
    private int timezone;
    private int id;
    private String name;
    private int cod;
}
