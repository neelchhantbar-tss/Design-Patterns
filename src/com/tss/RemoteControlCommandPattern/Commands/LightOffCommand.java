package com.tss.RemoteControlCommandPattern.Commands;

import com.tss.RemoteControlCommandPattern.Command;
import com.tss.RemoteControlCommandPattern.ElectronicItems.Light;

public class LightOffCommand implements Command {
    private final Light light;
    public LightOffCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute(){
        light.off();
    }
}
