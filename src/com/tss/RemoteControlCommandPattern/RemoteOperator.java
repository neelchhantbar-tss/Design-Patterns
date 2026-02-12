package com.tss.RemoteControlCommandPattern;

import com.tss.RemoteControlCommandPattern.Commands.*;
import com.tss.RemoteControlCommandPattern.ElectronicItems.CeilingFan;
import com.tss.RemoteControlCommandPattern.ElectronicItems.GarageDoor;
import com.tss.RemoteControlCommandPattern.ElectronicItems.Light;
import com.tss.RemoteControlCommandPattern.ElectronicItems.Stereo;

import java.util.Scanner;

public class RemoteOperator {
    public static void main(String[] args) {
        RemoteControl RC = new RemoteControl();
        Scanner sc = new Scanner(System.in);

        Light livingRoomLight = new Light("Living Room");
        Light kitchenLight = new Light("Kitchen");
        CeilingFan ceilingFan= new CeilingFan("Living Room");
        GarageDoor garageDoor = new GarageDoor("");
        Stereo stereo = new Stereo("Living Room");

        RC.setCommand(
                0
                , new LightOnCommand(livingRoomLight)
                , new LightOffCommand(livingRoomLight)
        );

        RC.setCommand(
                1
                , new LightOnCommand(kitchenLight)
                , new LightOffCommand(kitchenLight)
        );

        RC.setCommand(
                2
                , new CeilingFanOnCommand(ceilingFan)
                , new CeilingFanOffCommand(ceilingFan)
        );

        RC.setCommand(
                3
                , new StereoOnWithCDCommand(stereo)
                , new StereoOffWithCDCommand(stereo));

        RC.setCommand(
                4
                , new GarageDoorOnCommand(garageDoor)
                , new GarageDoorOffCommand(garageDoor)
        );

        System.out.println(RC);

        while(true){
            System.out.println("Enter slot: ");
            int slot = sc.nextInt();

            System.out.println("Enter 1(On)/2(OFf): ");
            int onOrOff = sc.nextInt();
            if(onOrOff == 1){
                RC.onButtonWasPressed(slot);
                continue;
            }
            RC.offButtonWasPressed(slot);
        }
    }
}
