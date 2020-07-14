package com.gaurav.observerdp.subjects;

import com.gaurav.observerdp.WeatherObject;
import com.gaurav.observerdp.observers.Observer;

import java.util.ArrayList;
import java.util.List;

public class WeatherDataStation implements Subject {

    private List<Observer> observerList;
    private WeatherObject weatherObject;

    public WeatherDataStation() {
        observerList = new ArrayList<>();
    }

    @Override
    public void registerObserver(Observer observer) {
        observerList.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        if(observerList.contains(observer))
            observerList.remove(observer);
    }

    @Override
    public void notifyObservers() {
        observerList.forEach(x-> x.update(this.weatherObject));
    }

    public void setMeasurements(WeatherObject weatherObject){
        this.weatherObject = weatherObject;
        notifyObservers();
    }


}
