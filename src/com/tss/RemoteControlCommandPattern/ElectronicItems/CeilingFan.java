package com.tss.RemoteControlCommandPattern.ElectronicItems;

public class CeilingFan {
    private boolean isTurnedOn = false;
    private final String name;
    public CeilingFan(String name){
        this.name = name;
    }
    public void on(){
        if(isTurnedOn){
            System.out.println(name + " " + this.getClass().getSimpleName() + " Already Turned On !");
            return;
        }
        isTurnedOn = true;
        System.out.println(name + " " + this.getClass().getSimpleName() + " Turned On !");
    }
    public void off(){
        if(!isTurnedOn){
            System.out.println(name + " " + this.getClass().getSimpleName() + " Already Turned Off !");
            return;
        }
        isTurnedOn = false;
        System.out.println(name + " " + this.getClass().getSimpleName() + " Turned Off !");
    }
}
