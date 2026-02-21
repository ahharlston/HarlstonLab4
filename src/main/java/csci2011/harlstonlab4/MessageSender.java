package csci2011.harlstonlab4;

/**
 *
 * @author Aryannah Harlston
 */

public interface MessageSender {
    
    void sendMessage(String recipient, String message);
    void receiveMessage(String sender, String message);
   

}
