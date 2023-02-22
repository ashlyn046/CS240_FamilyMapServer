package dao;

import model.Event;

import java.sql.*;
import java.util.List;

/**
 *A class for interacting with the Event table in the database
 */
public class EventDAO {

    /**
     *A connection object
     */
    private final Connection conn; //pass the connection it should use to connect with the database

    /**
     *A constructor for the event class
     * @param conn
     */
    public EventDAO(Connection conn) {
        this.conn = conn;
    }

    /**
     *A function to insert an event into the event table
     * @param event
     */
    public void insert(Event event) throws DataAccessException {
        //you can insert an event in the database

        //We can structure our string to be similar to a sql command, but if we insert question
        //marks we can change them later with help from the statement
        String sql = "INSERT INTO Events (EventID, AssociatedUsername, PersonID, Latitude, Longitude, " +
                "Country, City, EventType, Year) VALUES(?,?,?,?,?,?,?,?,?)";
        try (PreparedStatement stmt = conn.prepareStatement(sql)) {
            //Using the statements built-in set(type) functions we can pick the question mark we want
            //to fill in and give it a proper value. The first argument corresponds to the first
            //question mark found in our sql String
            stmt.setString(1, event.getEventID());
            stmt.setString(2, event.getAssociatedUsername());
            stmt.setString(3, event.getPersonID());
            stmt.setFloat(4, event.getLatitude());
            stmt.setFloat(5, event.getLongitude());
            stmt.setString(6, event.getCountry());
            stmt.setString(7, event.getCity());
            stmt.setString(8, event.getEventType());
            stmt.setInt(9, event.getYear());

            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
            throw new DataAccessException("Error encountered while inserting an event into the database");
        }
    }

    /**
     *A function to find an event by event ID
     * @param eventID
     * @return an event object if it is found
     */
    public Event find(String eventID) throws DataAccessException {
        //look up an event by event id in the database and get back an event object if it's there

        Event event;
        ResultSet rs;
        String sql = "SELECT * FROM Events WHERE EventID = ?;";
        try (PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, eventID);
            rs = stmt.executeQuery();
            if (rs.next()) {
                event = new Event(rs.getString("EventID"), rs.getString("AssociatedUsername"),
                        rs.getString("PersonID"), rs.getFloat("Latitude"), rs.getFloat("Longitude"),
                        rs.getString("Country"), rs.getString("City"), rs.getString("EventType"),
                        rs.getInt("Year"));
                return event;
            } else {
                return null;
            }
        } catch (SQLException e) {
            e.printStackTrace();
            throw new DataAccessException("Error encountered while finding an event in the database");
        }

    }

    //I ADDED
    /**
     *A function to return all the events associated with a given user
     * @param Username
     * @return a list of all the associated event objects
     */
    public List<Event> findForUser(String Username){
        //grabs all EVENT objs from a user's family tree and returns them as a list
        //do an SQL select statement
        //seaches them by authtoken
        return null;
    }

    //I NEED TO ADD MORE

    /**
     *A function to clear the event table
     */
    public void clear() throws DataAccessException {
        String sql = "DELETE FROM Event";
        try (PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
            throw new DataAccessException("Error encountered while clearing the event table");
        }
    }

}
