package com.tss.WheatherApp.Displays;

import com.tss.WheatherApp.Interfaces.DisplayElement;
import com.tss.WheatherApp.Interfaces.Observer;
import com.tss.WheatherApp.Interfaces.Subject;

public class HeatIndexDisplay implements Observer, DisplayElement {

//    private Subject weatherData;
    private double temperature, humidity;
    private float heatIndex;

    public HeatIndexDisplay(Subject weatherData){
//        this.weatherData = weatherData;
        heatIndex = 0;
        weatherData.registerObserver(this);
    }

    @Override
    public void display() {
        System.out.println("Heat Index is: " + heatIndex);
    }

    @Override
    public void update(double t, double rh, double pressure) {
        heatIndex = (float)((16.923 + (0.185212 * t) + (5.37941 * rh) - (0.100254 * t * rh) +
            (0.00941695 * (t * t)) + (0.00728898 * (rh * rh)) +
            (0.000345372 * (t * t * rh)) - (0.000814971 * (t * rh * rh)) +
            (0.0000102102 * (t * t * rh * rh)) - (0.000038646 * (t * t * t)) + (0.0000291583 *
            (rh * rh * rh)) + (0.00000142721 * (t * t * t * rh)) +
            (0.000000197483 * (t * rh * rh * rh)) - (0.0000000218429 * (t * t * t * rh * rh)) +
            0.000000000843296 * (t * t * rh * rh * rh)) -
            (0.0000000000481975 * (t * t * t * rh * rh * rh)));

        display();
    }
}
