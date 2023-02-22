package RequestResult;

import model.Person;

/**
 *A class to model the structure of the Persons Result JSON
 */
public class PersonsResult {
    /**
     *The set of person objects to return
     */
    Person[] data;
    /**
     *A boolean describing whether the attempt was a success
     */
    Boolean success;

    /**
     *A message about why there was an error.
     */
    String message;

    /**
     *Constructor for the PerosnsResult class.
     * @param message
     * @param success
     * @param data
     */
    public PersonsResult(Person[] data, Boolean success, String message) {
        this.data = data;
        this.success = success;
        this.message = message;
    }

    public Person[] getData() {
        return data;
    }

    public void setData(Person[] data) {
        this.data = data;
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