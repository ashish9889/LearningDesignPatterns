package org.example.patterns.Observer;

public interface Subject {
    void registerObserver(WeatherObserver weatherObserver);
    void removeObserver(WeatherObserver weatherObserver);
    void notifyObserver();
}