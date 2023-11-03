package org.example.patterns.Observer;

public interface WeatherObserver {
    void notifyObserver(double temp, int humidity, int pressure);
}
