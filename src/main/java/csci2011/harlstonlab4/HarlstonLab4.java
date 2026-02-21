/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package csci2011.harlstonlab4;

/**
 *
 * @author Aryannah Harlston
 */
public class HarlstonLab4 {

    public static void main(String[] args) {
  
        AndroidPhone myGalaxy = new AndroidPhone("Galaxy S25", 87);
        
        myGalaxy.sendMessage(" Alice", " Lunch today at 12?");
        myGalaxy.receiveMessage(" Bob", " What time is the meeting today?");
        myGalaxy.checkBatteryLevel();
        
        iPhone myiPhone = new iPhone ("iPhone 17", 99);
        
        myiPhone.sendMessage("Bill", "I like my iPhone");
        myiPhone.receiveMessage(("Mary"), "Me too!");
        myiPhone.checkBatteryLevel();
    }
    
}
