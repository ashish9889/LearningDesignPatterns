package org.example.patterns.Observer;

public class Main {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();

        WeatherObserver statsDisplay = new StatsDisplay(weatherData);
        WeatherObserver forecastDisplay = new ForcastDisplay(weatherData);

        weatherData.modifyRecording(30, 75, 50);
        weatherData.removeObserver(statsDisplay);
        weatherData.modifyRecording(25, 85, 60);
    }
}
