package RequestResult;

import model.Event;
/**
 *A class to model the structure of the Event Result JSON
 */

public class EventResult {
    /**
     *The username of the user associated with the given event
     */
    String associatedUsername;

    /**
     *The unique identifier associated with an event
     */
    String eventID;
    /**
     *The unique person identifier for the person associated with the event
     */
    String personID;

    /**
     *The longitude cordinate for the occurance of the given event
     */
    Float latitude;

    /**
     *The latitude cordinate for the occurance of the given event
     */
    Float longitude;

    /**
     *The country for the occurance of the given event
     */
    String country;

    /**
     *The city for the occurance of the given event
     */
    String city;

    /**
     *The type of event of the current event
     */
    String eventType;

    /**
     *The year for the occurance of the given event
     */
    Integer year;
    /**
     *A boolean describing whether the attempt was a success
     */
    Boolean success;

    /**
     *A message about why there was an error.
     */
    String message;

    /**
     *Constructor for the EventResult class.
     * @param message
     * @param success
     * @param eventID
     * @param city
     * @param country
     * @param eventType
     * @param latitude
     * @param longitude
     * @param associatedUsername
     * @param year
     * @param personID
     */
    public EventResult(String associatedUsername, String eventID, String personID, Float latitude, Float longitude, String country, String city, String eventType, Integer year, Boolean success, String message) {
        this.associatedUsername = associatedUsername;
        this.eventID = eventID;
        this.personID = personID;
        this.latitude = latitude;
        this.longitude = longitude;
        this.country = country;
        this.city = city;
        this.eventType = eventType;
        this.year = year;
        this.success = success;
        this.message = message;
    }

    public String getAssociatedUsername() {
        return associatedUsername;
    }

    public void setAssociatedUsername(String associatedUsername) {
        this.associatedUsername = associatedUsername;
    }

    public String getEventID() {
        return eventID;
    }

    public void setEventID(String eventID) {
        this.eventID = eventID;
    }

    public String getPersonID() {
        return personID;
    }

    public void setPersonID(String personID) {
        this.personID = personID;
    }

    public Float getLatitude() {
        return latitude;
    }

    public void setLatitude(Float latitude) {
        this.latitude = latitude;
    }

    public Float getLongitude() {
        return longitude;
    }

    public void setLongitude(Float longitude) {
        this.longitude = longitude;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getEventType() {
        return eventType;
    }

    public void setEventType(String eventType) {
        this.eventType = eventType;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
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
