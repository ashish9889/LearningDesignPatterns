package org.example.patterns.Observer;

public class StatsDisplay implements WeatherObserver, Display {

    private double temp;
    private int humidity;
    private int pressure;

    public StatsDisplay(WeatherData weatherData){
        weatherData.registerObserver(this);
    }
    @Override
    public void notifyObserver(double temp, int humidity, int pressure) {
        this.temp = temp;
        this.humidity = humidity;
        this.pressure = pressure;
        display();
    }

    @Override
    public void display() {
        System.out.println("Stats for today : "+temp+", humidity "+humidity+" and pressure "+pressure);
    }
}
