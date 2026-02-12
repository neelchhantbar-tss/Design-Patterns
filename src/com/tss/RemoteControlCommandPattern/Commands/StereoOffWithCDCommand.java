package com.tss.RemoteControlCommandPattern.Commands;

import com.tss.RemoteControlCommandPattern.Command;
import com.tss.RemoteControlCommandPattern.ElectronicItems.Stereo;

public class StereoOffWithCDCommand implements Command {
    private final Stereo stereo;
    public StereoOffWithCDCommand(Stereo stereo){
        this.stereo = stereo;
    }

    @Override
    public void execute(){
        stereo.off();
        stereo.removeCD();
    }
}
