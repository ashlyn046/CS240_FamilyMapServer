package RequestResult;

//has all properties for success and failure, but you only fill in the relevant ones


/**
 *A class to model the structure of the Register Result JSON
 */
public class RegisterResult {

    /**
     *The authorization token associated with a user's session
     */
    String authtoken;

    /**
     *The username of the current user
     */
    String username;

    /**
     *The unique person identifier
     */
    String personID;

    /**
     *A boolean describing whether the attempt was a success
     */
    Boolean success;

    /**
     *A message about why there was an error.
     */
    String message; //Error:[Description of the error]
    //set success boolean to false

    /**
     *Constructor for the ClearResult class.
     * @param message
     * @param success
     * @param username
     * @param personID
     * @param authtoken
     */
    public RegisterResult(String authtoken, String username, String personID, Boolean success, String message) {
        this.authtoken = authtoken;
        this.username = username;
        this.personID = personID;
        this.success = success;
        this.message = message;
    }

    public String getAuthtoken() {
        return authtoken;
    }

    public void setAuthtoken(String authtoken) {
        this.authtoken = authtoken;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPersonID() {
        return personID;
    }

    public void setPersonID(String personID) {
        this.personID = personID;
    }

    public Boolean getSuccess() {
        return success;
    }

    public void setSuccess(Boolean success) {
        this.success = success;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
