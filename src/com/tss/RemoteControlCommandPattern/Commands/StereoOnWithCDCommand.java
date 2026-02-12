package com.tss.RemoteControlCommandPattern.Commands;

import com.tss.RemoteControlCommandPattern.Command;
import com.tss.RemoteControlCommandPattern.ElectronicItems.Stereo;

public class StereoOnWithCDCommand implements Command {
    private final Stereo stereo;
    public StereoOnWithCDCommand(Stereo stereo){
        this.stereo = stereo;
    }

    @Override
    public void execute(){
        stereo.on();
        stereo.setCD();
        stereo.setVolume(11);
    }
}
