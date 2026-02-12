package com.tss.RemoteControlCommandPattern.ElectronicItems;

public class GarageDoor {
    private boolean isTurnedOn = false;
    private final String name;
    public GarageDoor(String name){
        this.name = name;
    }
    public void open(){
        if(isTurnedOn){
            System.out.println(name + " " + this.getClass().getSimpleName() + " Already opened !");
            return;
        }
        isTurnedOn = true;
        System.out.println(name + " " + this.getClass().getSimpleName() + " Opened !");
    }
    public void close(){
        if(!isTurnedOn){
            System.out.println(name + " " + this.getClass().getSimpleName() + " Already Closed !");
            return;
        }
        isTurnedOn = false;
        System.out.println(name + " " + this.getClass().getSimpleName() + " Closed !");
    }
}
