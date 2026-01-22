package com.tss.WheatherApp.Displays;

import com.tss.WheatherApp.Interfaces.DisplayElement;
import com.tss.WheatherApp.Interfaces.Observer;
import com.tss.WheatherApp.Interfaces.Subject;

public class CurrentConditionsDisplay implements DisplayElement, Observer {
    private double temperature, humidity, pressure;
//    private Subject weatherData;

    public CurrentConditionsDisplay(Subject weatherData){
        temperature = 0;
        humidity = 0;
        pressure = 0;
//        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void update(double temperature, double humidity, double pressure){
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;

        this.display();
    }

    @Override
    public void display() {
        System.out.println("\nCurrent: " +
                "\nTemperature: " + temperature +
                "\nHumidity: " + humidity +
                "\nPressure: " + pressure);
    }
}
