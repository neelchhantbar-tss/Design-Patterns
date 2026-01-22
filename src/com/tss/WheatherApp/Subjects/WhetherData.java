package com.tss.WheatherApp.Subjects;

import com.tss.WheatherApp.Interfaces.Observer;
import com.tss.WheatherApp.Interfaces.Subject;

import java.util.ArrayList;

public class WhetherData implements Subject {

    private double temperature, humidity, pressure;

    private final ArrayList<Observer> observers;

    public WhetherData(){
        observers = new ArrayList<>();
        temperature = 0;
        humidity = 0;
        pressure = 0;
    }

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        int index = observers.indexOf(observer);
        if(index >= 0){
            observers.remove(index);
        }
    }

    @Override
    public void notifyObservers() {
        for(Observer o: observers){
            o.update(temperature, humidity, pressure);
        }
    }

    public void measurementsChanged(){
        notifyObservers();
    }

    public void setMeasurements(double temperature, double humidity, double pressure){
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;

        measurementsChanged();
    }
}
