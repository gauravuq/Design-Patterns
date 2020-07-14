package com.gaurav.observerdp.observers;

import com.gaurav.observerdp.WeatherObject;

public interface Observer {
    public void update (WeatherObject weatherObject);
}
