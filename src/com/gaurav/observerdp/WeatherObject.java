package com.gaurav.observerdp;

public class WeatherObject {

    private float temp;
    private float humidity;
    private float pressure;

    public float getTemp() {
        return temp;
    }

    public void setTemp(float temp) {
        this.temp = temp;
    }

    public float getHumidity() {
        return humidity;
    }

    public void setHumidity(float humidity) {
        this.humidity = humidity;
    }

    public float getPressure() {
        return pressure;
    }

    public void setPressure(float pressure) {
        this.pressure = pressure;
    }

    public WeatherObject(float temp, float humidity, float pressure) {
        this.temp = temp;
        this.humidity = humidity;
        this.pressure = pressure;
    }

    public WeatherObject() {
        this.humidity= Float.MIN_VALUE;
        this.temp = Float.MIN_VALUE;
        this.pressure = Float.MIN_VALUE;

    }

    @Override
    public String toString() {
        return "WeatherObject{" +
                "temp=" + temp +
                ", humidity=" + humidity +
                ", pressure=" + pressure +
                '}';
    }
}
