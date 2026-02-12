package com.tss.RemoteControlCommandPattern.Commands;

import com.tss.RemoteControlCommandPattern.Command;

public class NoCommand implements Command {
    @Override
    public void execute(){
        System.out.println("No Command Assigned");
    }
}
