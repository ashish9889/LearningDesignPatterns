package org.example.patterns.Observer;

public class ForcastDisplay implements WeatherObserver, Display{

    private double temp;
    private int humidity;

    public ForcastDisplay(WeatherData weatherData) {
        weatherData.registerObserver(this);
    }

    @Override
    public void notifyObserver(double temp, int humidity, int pressure) {
        this.temp = temp;
        this.humidity = humidity;
        display();
    }

    @Override
    public void display() {
        System.out.println("ForcastDisplay : Temp is "+temp+" and humidity is "+humidity);
    }
}
