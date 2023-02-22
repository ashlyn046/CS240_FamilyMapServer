package Service;

import RequestResult.EventRequest;
import RequestResult.EventResult;
import RequestResult.EventsRequest;
import RequestResult.EventsResult;

/**
 *A class that has two functions. One of these functions returns a single event obj associated with an ID and the other returns all event objs associated with a username.
 */

public class EventService {

    /**
     *A function that returns a single event object from the associated id.
     * @param r a eventRequest object passed in from the handlers
     * @return a eventResult objct to give to the handlers
     */
    EventResult getEvent(EventRequest r){
        //Returns the single Event object with the specified ID (if the event is associated with the
        // current user). The current user is determined by the provided authtoken.

        return null;
    }

    /**
     *A function that returns all event objects associated with the current user
     * @param r a eventsRequest object passed in from the handlers
     * @return a eventsResult object to give to the handlers
     */
    EventsResult getAllEvents(EventsRequest r){
        //Returns ALL events for ALL family members of the current user.
        // The current user is determined from the provided auth token.

        return null;
    }


}
