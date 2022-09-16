package com.kodilla.testing.weather.stub;

import java.util.HashMap;
import java.util.Map;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class WeatherForecast {
    private Temperatures temperatures;

    public WeatherForecast(Temperatures temperatures) {
        this.temperatures = temperatures;
    }

    public Map<String, Double> calculateForecast() {
        Map<String, Double> resultMap = new HashMap<>();

        for (Map.Entry<String, Double> temperature :
                temperatures.getTemperatures().entrySet()) {

            // adding 1 celsius degree to current value
            // as a temporary weather forecast
            resultMap.put(temperature.getKey(), temperature.getValue() + 1.0);
        }
        return resultMap;
    }

    public double calculateAverage() {
        double temperatureSum = 0.0;
        List<Double> temp = new ArrayList<>();

        for (Map.Entry<String, Double> temperature :
                temperatures.getTemperatures().entrySet()) {
            temp.add(temperature.getValue());
            temperatureSum = temperatureSum + temperature.getValue();
        }
        double average = temperatureSum / temp.size();
        return average;
    }
    public double calculateMediana() {
        int index = 0;
        double mediana = 0.0;
        List<Double> temporary = new ArrayList<>();


        for (Map.Entry<String, Double> temperature :
                temperatures.getTemperatures().entrySet()) {
            temporary.add(temperature.getValue());
        }
        Collections.sort(temporary);
        int listSize = temporary.size();

        if (temporary.size() % 2 == 0) {
            index = listSize / 2;
            mediana = (temporary.get(index -1) + temporary.get(index)) / 2;

        } else {
            index = (listSize) / 2;
            mediana = temporary.get(index);
        }

        return mediana;
    }
}
