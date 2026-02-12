package com.tss.RemoteControlCommandPattern.Commands;

import com.tss.RemoteControlCommandPattern.Command;
import com.tss.RemoteControlCommandPattern.ElectronicItems.CeilingFan;

public class CeilingFanOnCommand implements Command {
    private final CeilingFan fan;
    public CeilingFanOnCommand(CeilingFan fan){
        this.fan = fan;
    }

    public void execute(){
        fan.on();
    }
}
