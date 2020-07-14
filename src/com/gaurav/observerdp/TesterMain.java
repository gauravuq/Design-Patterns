package com.gaurav.observerdp;

import com.gaurav.observerdp.observers.CurrentWeatherDisplay;
import com.gaurav.observerdp.subjects.WeatherDataStation;

public class TesterMain {

    public static void main(String[] args) {

        WeatherDataStation weatherData = new WeatherDataStation();
        CurrentWeatherDisplay currentWeatherDisplay = new CurrentWeatherDisplay(weatherData);
        // add more custom display as observer
        WeatherObject weatherObject = new WeatherObject(10, 20, 30);
        weatherData.setMeasurements(weatherObject);

    }

}
