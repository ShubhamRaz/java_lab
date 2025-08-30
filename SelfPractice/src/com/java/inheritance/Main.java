package com.java.inheritance;


public class Main{
    public static void main(String args[]){
        ComputerCase theCase = new ComputerCase("2025","hp","250");
        Monitor theMonitor = new Monitor("27inch Beast","Ascer",27,"2440x1440");
        MotherBoard theMotherboard = new MotherBoard("BJ-200","Assus",4,6,"v5");
        PersonalComputer thePC = new PersonalComputer("2208","Dell",theCase,theMonitor,theMotherboard);

        // thePC.getMonitor().drawPixelAt(10,10,"RED" );
        // thePC.getMotherBoard().loadProgram("Windows 1.0");
        // thePC.getComputerCase().pressPowerButton();

        // thePC.monitor.drawPixelAt(10,10,"RED" );

        thePC.powerup();
    }
}