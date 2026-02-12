package com.tss.RemoteControlCommandPattern.Commands;

import com.tss.RemoteControlCommandPattern.Command;
import com.tss.RemoteControlCommandPattern.ElectronicItems.GarageDoor;

public class GarageDoorOnCommand implements Command {
    private final GarageDoor door;
    public GarageDoorOnCommand(GarageDoor door){
        this.door = door;
    }

    public void execute(){
        door.open();
    }
}
