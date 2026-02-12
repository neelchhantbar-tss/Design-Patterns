package com.tss.RemoteControlCommandPattern.Commands;

import com.tss.RemoteControlCommandPattern.Command;
import com.tss.RemoteControlCommandPattern.ElectronicItems.GarageDoor;

public class GarageDoorOffCommand implements Command {
    private final GarageDoor door;
    public GarageDoorOffCommand(GarageDoor door){
        this.door = door;
    }

    public void execute(){
        door.close();
    }
}
