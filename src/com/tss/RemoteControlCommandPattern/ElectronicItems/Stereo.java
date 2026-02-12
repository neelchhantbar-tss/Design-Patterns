package com.tss.RemoteControlCommandPattern.ElectronicItems;

public class Stereo {
    private boolean isTurnedOn = false;
    private final String name;
    public Stereo(String name){
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
    public void setCD(){
        System.out.println("CD Successfully Set !");
    }
    public void setVolume(int i){
        System.out.println("Volume set to " + i + " !");
    }
    public void removeCD(){
        System.out.println("CD Removed !");
    }
}
