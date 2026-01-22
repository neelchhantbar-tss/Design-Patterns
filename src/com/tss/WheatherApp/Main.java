package com.tss.WheatherApp;

import com.tss.WheatherApp.Displays.CurrentConditionsDisplay;
import com.tss.WheatherApp.Displays.HeatIndexDisplay;
import com.tss.WheatherApp.Displays.StatisticsDisplay;
import com.tss.WheatherApp.Subjects.WhetherData;

public class Main {
    public static void main(String[] args) {
        WhetherData subject = new WhetherData();

        new StatisticsDisplay(subject);
        new CurrentConditionsDisplay(subject);
        new HeatIndexDisplay(subject);

        subject.setMeasurements(80, 65, 30.4f);
//        subject.removeObserver(currentDisplay);
        subject.setMeasurements(82, 70, 29.2f);
        subject.setMeasurements(78, 90, 29.2f);
    }
}
