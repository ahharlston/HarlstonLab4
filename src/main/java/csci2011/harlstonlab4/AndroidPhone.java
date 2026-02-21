/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package csci2011.harlstonlab4;

/**
 *
 * @author Aryannah Harlston
 */
public class AndroidPhone extends Smartphone {
    
    public AndroidPhone(String deviceName, int batteryLevel)
    {
        super(deviceName, batteryLevel);
    }
    
    @Override
    public void sendMessage(String recipient, String message)
    {
        super.sendMessage(recipient, message + " (Sent from Android) ");
    }
    
    @Override
    public void receiveMessage(String sender, String message)
    {
        super.receiveMessage(sender, message + " (Received from Android) ");
    }
    
    
    
    
    
    
    
}
