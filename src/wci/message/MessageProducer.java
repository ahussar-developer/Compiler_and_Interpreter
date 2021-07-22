package wci.message;

// recall that an interface is an abstract class that is used to group related methods with empty bodies
// these methods must be implemented by another class with the implements keyword

public interface MessageProducer {
    /**
     * Add a listener to the listener list
     * @param listener the listener to add
     */
    public void addMessageListener(MessageListener listener);

    /**
     * Remove a listener from the listener list
     * @param listener the listener to remove
     */
    public void removeMessageListener(MessageListener listener);

    /**
     * Notify listeners after setting the message
     * @param message the message to set.
     */
    public void sendMessage(Message message);

}
