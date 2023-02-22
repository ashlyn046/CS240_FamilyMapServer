package dao;

import model.Event;
import model.Person;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

/**
 *A class for interacting with the Person table in the database
 */
public class PersonDAO {

    /**
     *A connection object
     */
    private final Connection conn; //pass the connection it should use to connect with the database

    /**
     *A constructor for the person DAO class
     * @param conn
     */
    public PersonDAO(Connection conn) {
        this.conn = conn;
    }

    /**
     *A function to insert a new person into the person table
     * @param person
     */
    public void insert(Person person) throws DataAccessException {
        //you can insert a person in the database

        //We can structure our string to be similar to a sql command, but if we insert question
        //marks we can change them later with help from the statement
        String sql = "INSERT INTO Person (personID, associatedUsername, firstName, lastName, gender, " +
                "fatherID, motherID, spouseID) VALUES(?,?,?,?,?,?,?,?)";

        try (PreparedStatement stmt = conn.prepareStatement(sql)) {
            //Using the statements built-in set(type) functions we can pick the question mark we want
            //to fill in and give it a proper value. The first argument corresponds to the first
            //question mark found in our sql String
            stmt.setString(1, person.getPersonID());
            stmt.setString(2, person.getAssociatedUsername());
            stmt.setString(3, person.getFirstName());
            stmt.setString(4, person.getLastName());
            stmt.setString(5, person.getGender());
            stmt.setString(6, person.getFatherID());
            stmt.setString(7, person.getMotherID());
            stmt.setString(8, person.getSpouseID());

            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
            throw new DataAccessException("Error encountered while inserting an event into the database");
        }
    }

    /**
     *A function to find a person by their ID
     * @param personID
     * @return the person that was found
     */
    public Person findByID(String personID){
        //Returns the single Person object with the specified ID (if the person is associated
        // with the current user). The current user is determined by the provided authtoken.

        return null;
    }

    /**
     *A class for interacting with the AuthToken table in the database
     * @param Username
     * @return a list of all the located person objects
     */
    public List<Person> findForUser(String Username){
        //grabs all PERSON objs from a user's family tree and returns them as a list
        //do an SQL select statement
        //seaches them by authtoken
        return null;
    }


    /**
     *A function to clear the person table
     */
    public void clear() throws DataAccessException {
        String sql = "DELETE FROM Person";
        try (PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
            throw new DataAccessException("Error encountered while clearing the event table");
        }
    }
}
