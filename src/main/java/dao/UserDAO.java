package dao;

import model.AuthToken;
import model.User;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *A class for interacting with the User table in the database
 */
public class UserDAO {

    /**
     *A connection object
     */
    private final Connection conn; //pass the connection it should use to connect with the database

    /**
     *A constructor for the User class
     */
    public UserDAO(Connection conn) {
        this.conn = conn;
    }

    /**
     *A function that adds a user row to the user table
     */
    void createUser(User user) {
        //here, we need to put SQL java code to insert a user into the database and add that row to
        //the users table
    }

    /**
     *A function that determines whether a login worked
     * @param password
     * @param username
     * @return a boolean true or false
     */
    boolean validate(String username, String password){
        //Returns true if the login worked
        //queries the User table to see if a user exists with that username and password

        return false;
    }

    /**
     *A function that finds a user by ID
     * @param userId
     * @returns a user object if found
     */
    User getUserById(String userId){
        //queries database for user with that id
        //read data out of database and store it in a user model object and return it

        return null;
    }

    /**
     *A function that clears the user table
     */
    public void clear() throws DataAccessException {
        String sql = "DELETE FROM User";
        try (PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
            throw new DataAccessException("Error encountered while clearing the event table");
        }
    }
}
