/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package csci2011.harlstonlab4;

/**
 *
 * @author Aryannah Harlston
 */
public abstract class Smartphone extends AbstractCommunicationDevice{
    
    private int batteryLevel;
    
    public Smartphone(String deviceName, int batteryLevel )
    {
        super(deviceName);
        this.batteryLevel = batteryLevel;
    }
    
    public void checkBatteryLevel()
    {
        System.out.println("Battery Level: " + this.batteryLevel + "%");
    }
}
