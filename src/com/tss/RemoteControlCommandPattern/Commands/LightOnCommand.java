package com.tss.RemoteControlCommandPattern.Commands;

import com.tss.RemoteControlCommandPattern.Command;
import com.tss.RemoteControlCommandPattern.ElectronicItems.Light;

public class LightOnCommand implements Command {
    private final Light light;
    public LightOnCommand(Light light){
        this.light = light;
    }

    public void execute(){
        light.on();
    }
}
