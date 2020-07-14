package com.gaurav.observerdp.observers;

import com.gaurav.observerdp.WeatherObject;
import com.gaurav.observerdp.extrainterfaces.DisplayElements;
import com.gaurav.observerdp.subjects.Subject;

public class CurrentWeatherDisplay  implements Observer, DisplayElements {

    private Subject subject;
    private WeatherObject weatherObject;

    public CurrentWeatherDisplay(Subject subject) {
        this.subject = subject;
        this.subject.registerObserver(this);
    }

    @Override
    public void display() {
        System.out.println("Weather Data is =>"+ weatherObject.toString());
    }

    @Override
    public void update(WeatherObject weatherObject) {
            this.weatherObject = weatherObject;
            this.display();
    }
}
