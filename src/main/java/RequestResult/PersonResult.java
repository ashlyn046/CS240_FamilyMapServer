package RequestResult;

/**
 *A class to model the structure of the Person Result JSON
 */
public class PersonResult {
    /**
     *The username of the user associated with the given person
     */
    String associatedUsername;

    /**
     *The unique identifier for the given person
     */
    String personID;

    /**
     *The first name of the current person
     */
    String firstName;

    /**
     *The last name of the current person
     */
    String lastName;

    /**
     *The gender of the current person
     */
    String gender; //"f" or "m"

    /**
     *The unique identifier for the father of the current person
     */
    String fatherID; //[OPTIONAL, can be missing]

    /**
     *The unique identifier for the mother of the current person
     */
    String motherID; //[OPTIONAL, can be missing]

    /**
     *The unique identifier for the spouse of the current person
     */
    String spouseID; //[OPTIONAL, can be missing]
    /**
     *A boolean describing whether the attempt was a success
     */
    Boolean success;

    /**
     *A message about why there was an error.
     */
    String message;

    /**
     *Constructor for the PersonResult class.
     * @param message
     * @param success
     * @param personID
     * @param associatedUsername
     * @param fatherID
     * @param gender
     * @param firstName
     * @param lastName
     * @param motherID
     * @param spouseID
     */
    public PersonResult(String associatedUsername, String personID, String firstName, String lastName, String gender, String fatherID, String motherID, String spouseID, Boolean success, String message) {
        this.associatedUsername = associatedUsername;
        this.personID = personID;
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
        this.fatherID = fatherID;
        this.motherID = motherID;
        this.spouseID = spouseID;
        this.success = success;
        this.message = message;
    }

    public String getAssociatedUsername() {
        return associatedUsername;
    }

    public void setAssociatedUsername(String associatedUsername) {
        this.associatedUsername = associatedUsername;
    }

    public String getPersonID() {
        return personID;
    }

    public void setPersonID(String personID) {
        this.personID = personID;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getFatherID() {
        return fatherID;
    }

    public void setFatherID(String fatherID) {
        this.fatherID = fatherID;
    }

    public String getMotherID() {
        return motherID;
    }

    public void setMotherID(String motherID) {
        this.motherID = motherID;
    }

    public String getSpouseID() {
        return spouseID;
    }

    public void setSpouseID(String spouseID) {
        this.spouseID = spouseID;
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
