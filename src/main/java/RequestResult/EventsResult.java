package RequestResult;

import model.Event;

/**
 *A class to model the structure of the Events Result JSON
 */
public class EventsResult {
    Event data;
    /**
     *A boolean describing whether the attempt was a success
     */
    Boolean success;

    /**
     *A message about why there was an error.
     */
    String message;

    /**
     *Constructor for the EventsResult class.
     * @param message
     * @param success
     * @param data
     */
    public EventsResult(Event data, Boolean success, String message) {
        this.data = data;
        this.success = success;
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Event getData() {
        return data;
    }

    public void setData(Event data) {
        this.data = data;
    }

    public Boolean getSuccess() {
        return success;
    }

    public void setSuccess(Boolean success) {
        this.success = success;
    }
}
