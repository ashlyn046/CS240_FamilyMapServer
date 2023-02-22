package RequestResult;

/**
 *A class to model the structure of the Event Request JSON
 */
public class EventRequest {
    //no request body? but eventID passed in

    /**
     *The unique identifier for the current event
     */
    String eventID;

    /**
     *Constructor for the EventRequest class.
     * @param eventID
     */

    public EventRequest(String eventID) {
        this.eventID = eventID;
    }

    public String getEventID() {
        return eventID;
    }

    public void setEventID(String eventID) {
        this.eventID = eventID;
    }
}
