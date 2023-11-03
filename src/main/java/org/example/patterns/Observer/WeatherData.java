package org.example.patterns.Observer;

import java.util.ArrayList;
import java.util.List;

public class WeatherData implements Subject{
    private double temp;
    private int humidity;
    private int pressure;

    private final List<WeatherObserver> weatherObserverList;

    public WeatherData() {
        weatherObserverList = new ArrayList<>();
    }

    @Override
    public void registerObserver(WeatherObserver weatherObserver) {
        System.out.println("Registering observer "+weatherObserver.getClass());
        weatherObserverList.add(weatherObserver);
    }

    @Override
    public void removeObserver(WeatherObserver weatherObserver) {
        System.out.println("Removing observer "+weatherObserver.getClass());
        weatherObserverList.remove(weatherObserver);
    }

    @Override
    public void notifyObserver() {
        for(WeatherObserver weatherObserver : weatherObserverList){
            weatherObserver.notifyObserver(this.temp, this.humidity, this.pressure);
        }
    }

    public void modifyRecording(double temp, int humidity, int pressure){
        this.humidity = humidity;
        this.pressure = pressure;
        this.temp = temp;
        notifyObserver();
    }
}
