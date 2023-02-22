package Service;

import RequestResult.PersonRequest;
import RequestResult.PersonResult;
import RequestResult.PersonsRequest;
import RequestResult.PersonsResult;

/**
 * A Person service class containing two functions that return either the person object associated with a personID or all the person objects associated with a user.
 */
public class PersonService {

    /**
     *A function that returns a single person object from the associated id.
     * @param r a personRequest object passed in from the handlers
     * @return a personResult objct to give to the handlers
     */
    public PersonResult person(PersonRequest r){
        //Returns the single Person object with the specified ID (if the person is associated with the
        // current user). The current user is determined by the provided authtoken.

        return null;
    }

    /**
     *A function that returns all of the person objects associated with a username
     * @param r a personsRequest object passed in from the handlers
     * @return a personsResult objct to give to the handlers
     */
    public PersonsResult person(PersonsRequest r){
        //Returns ALL family members of the current user. The current user is determined by the provided authtoken.

        return null;
    }
}
