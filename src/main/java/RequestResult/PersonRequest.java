package RequestResult;

/**
 *A class to model the structure of the Person Request JSON
 */
public class PersonRequest {
    //thhere is nothing in the request body but persoId is passed in command line
    /**
     *The unique person identifier
     */
    String personID;

    /**
     *Constructor for the PersonRequest class.
     * @param personID
     */

    public PersonRequest(String personID) {
        this.personID = personID;
    }

    public String getPersonID() {
        return personID;
    }

    public void setPersonID(String personID) {
        this.personID = personID;
    }
}
