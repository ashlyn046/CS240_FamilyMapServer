package RequestResult;

import model.Event;
import model.Person;
import model.User;

/**
 *A class to model the structure of the Load Request JSON
 */

public class LoadRequest {
    /**
     *The set of user objects requested to lad
     */
    User[] users;

    /**
     *The sert of person objects requested to load
     */
    Person[] persons;

    /**
     *The set of event objects requested to load
     */
    Event[] events;

    /**
     *Constructor for the LoadRequest class.
     * @param events
     * @param persons
     * @param users
     */
    public LoadRequest(User[] users, Person[] persons, Event[] events) {
        this.users = users;
        this.persons = persons;
        this.events = events;
    }

    public User[] getUsers() {
        return users;
    }

    public void setUsers(User[] users) {
        this.users = users;
    }

    public Person[] getPersons() {
        return persons;
    }

    public void setPersons(Person[] persons) {
        this.persons = persons;
    }

    public Event[] getEvents() {
        return events;
    }

    public void setEvents(Event[] events) {
        this.events = events;
    }
}
