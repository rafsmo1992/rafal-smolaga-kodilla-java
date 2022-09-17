package com.kodilla.testing.weather.mock;

import com.kodilla.testing.weather.stub.Temperatures;
import com.kodilla.testing.weather.stub.WeatherForecast;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.HashMap;
import java.util.Map;

import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class WeatherForecastTestSuite {

    @Mock
    private Temperatures temperaturesMock;

    @Test
    void testCalculateForecastWithMock() {
        //Given
        Map<String, Double> temperaturesMap = new HashMap<>();
        temperaturesMap.put("Rzeszow", 25.5);
        temperaturesMap.put("Krakow", 26.2);
        temperaturesMap.put("Wroclaw", 24.8);
        temperaturesMap.put("Warszawa", 25.2);
        temperaturesMap.put("Gdansk", 26.1);
        when(temperaturesMock.getTemperatures()).thenReturn(temperaturesMap);
        WeatherForecast weatherForecast = new WeatherForecast(temperaturesMock);

        //When
        int quantityOfSensors = weatherForecast.calculateForecast().size();

        //Then
        Assertions.assertEquals(5, quantityOfSensors);
    }

    public Map<String, Double> DataValues() {
        Map<String, Double> temperaturesMap = new HashMap<>();
        temperaturesMap.put("Rzeszow", 24.5);
        temperaturesMap.put("Krakow", 21.2);
        temperaturesMap.put("Wroclaw", 28.3);
        temperaturesMap.put("Warszawa", 25.2);
        temperaturesMap.put("Gdansk", 28.1);

        Map<String, Double> DataValues = new HashMap<>();

        for (Map.Entry<String, Double> temperature :
                temperaturesMap.entrySet()) {
            DataValues.put(temperature.getKey(), temperature.getValue());
        }

        return DataValues;
    }
    @Test
    void testTemperaturesAverage() {

        //Given
        Map<String, Double> temperaturesValues = DataValues();
        when(temperaturesMock.getTemperatures()).thenReturn(temperaturesValues);
        WeatherForecast weatherForecast = new WeatherForecast(temperaturesMock);

        //When
        double temperaturesAverage = weatherForecast.calculateAverage();

        //Then
        Assertions.assertEquals(25.46, temperaturesAverage);
    }
    @Test
    void testMediana() {

        //Given
        Map<String, Double> temperaturesData = DataValues();
        when(temperaturesMock.getTemperatures()).thenReturn(temperaturesData);
        WeatherForecast weatherForecast = new WeatherForecast(temperaturesMock);

        //When
        double mediana = weatherForecast.calculateMediana();

        //Then
        Assertions.assertEquals(25.2, mediana);
    }

}