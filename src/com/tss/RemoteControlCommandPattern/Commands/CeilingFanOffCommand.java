package com.tss.RemoteControlCommandPattern.Commands;

import com.tss.RemoteControlCommandPattern.Command;
import com.tss.RemoteControlCommandPattern.ElectronicItems.CeilingFan;

public class CeilingFanOffCommand implements Command {
    private final CeilingFan fan;
    public CeilingFanOffCommand(CeilingFan fan) {
        this.fan = fan;
    }

    @Override
    public void execute(){
        fan.off();
    }
}
