/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package csci2011.harlstonlab4;

/**
 *
 * @author Aryannah Harlston
 */
public abstract class AbstractCommunicationDevice implements MessageSender{
    
    private String deviceName;
    
    public AbstractCommunicationDevice(String deviceName)
    {
        this.deviceName = deviceName;
        
    }
    
    public void sendMessage(String recipient, String message)
    {
        System.out.println(deviceName + " is sending a message to " + recipient + ": " + message);
    }
    
    public void receiveMessage(String sender, String message)
    {
        System.out.println(deviceName + " received a message from: " + sender + " :" + message);
    }

            
}
