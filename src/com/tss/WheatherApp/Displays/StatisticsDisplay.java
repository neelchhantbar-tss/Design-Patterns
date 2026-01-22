package com.tss.WheatherApp.Displays;

import com.tss.WheatherApp.Interfaces.DisplayElement;
import com.tss.WheatherApp.Interfaces.Observer;
import com.tss.WheatherApp.Interfaces.Subject;

public class StatisticsDisplay implements Observer, DisplayElement {

    private double avgTemperature, avgHumidity, avgPressure;
    private double maxTemperature, maxHumidity, maxPressure;
    private double minTemperature, minHumidity, minPressure;
    private double sumTemperature, sumHumidity, sumPressure;
    private int observations;
//    private Subject weatherData;

    public StatisticsDisplay(Subject weatherData){
        avgHumidity = avgPressure = avgTemperature = 0;
        maxHumidity = maxPressure = maxTemperature = 0;
        minHumidity = minPressure = minTemperature = Integer.MAX_VALUE;
        sumHumidity = sumPressure = sumTemperature = 0;
        observations = 0;
//        weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void update(double temperature, double humidity, double pressure) {
        observations++;
        sumHumidity += humidity;
        sumPressure += pressure;
        sumTemperature += temperature;

        avgHumidity = (sumHumidity/observations);
        avgTemperature = (sumTemperature/observations);
        avgPressure = (sumPressure/observations);

        maxHumidity = Math.max(maxHumidity, humidity);
        maxPressure = Math.max(maxPressure, pressure);
        maxTemperature = Math.max(maxTemperature, temperature);

        minHumidity = Math.min(minHumidity, humidity);
        minPressure = Math.min(minPressure, pressure);
        minTemperature = Math.min(minTemperature, temperature);

        this.display();
    }

    @Override
    public void display() {
        System.out.println("\nStatistics:" +
                "\nAverage Temperature: " + avgTemperature +
                "\nAverage Humidity: " + avgHumidity +
                "\nAverage Pressure: " + avgPressure +
                "\n" +
                "\nMax Temperature: " + maxTemperature +
                "\nMax Humidity: " + maxHumidity +
                "\nMax Pressure: " + maxPressure +
                "\n" +
                "\nMin Temperature: " + minTemperature +
                "\nMin Humidity: " + minHumidity +
                "\nMin Pressure: " + minPressure);
    }
}
