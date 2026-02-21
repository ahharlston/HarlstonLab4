/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package csci2011.harlstonlab4;

/**
 *
 * @author Aryannah Harlston
 */
public class iPhone extends Smartphone {
    
    public iPhone(String deviceName, int batteryLevel)
    {
        super(deviceName, batteryLevel);
    }
    
    @Override
    public void sendMessage(String recipient, String message)
    {
        super.sendMessage(recipient, message + " (Sent from iPhone) ");
    }
    
    @Override
    public void receiveMessage(String sender, String message)
    {
        super.receiveMessage(sender, message + " (Received from iPhone) ");
    }
    
}
