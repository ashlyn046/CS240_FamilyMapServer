package dao;

import model.AuthToken;
import java.sql.*;
import model.User;


/*The doa package classes are used to interact with the database. The query, insert, update, etc for the
* table that they are named for. For example, the AuthTokenDAO interacts with the AuthToken table
*
* THESE ARE THE ONLY CLASSES THAT ARE ALLOWED TO INTERACT WITH THE DATABASE
* ONLY CLASSES WITH SQL CODE
* all sql code is embedded within methods and not accessible from outside these classes*/

/*go through web APIs to determine what methods we need for each*/

/**
 *A class for interacting with the AuthToken table in the database
 */
public class AuthTokenDAO {

    /**
     *The connection we are using to connect to the database
     */
    private final Connection conn; //pass the connection it should use to connect with the database

    /**
     *A constructor for the AuthTokenDAO class
     * @param conn
     */
    public AuthTokenDAO(Connection conn) {
        this.conn = conn;
    }

    /**
     *A function to return the username associated with the authtoken
     * @param token
     * @return the username associated with it
     */
    public String getUsername(AuthToken token){
        //returns the username of the user associated with the authtoken
        //queries the authtoken database

        return null;
    }

    /**
     *A function for logging a user in
     * @param username
     * @param password
     * @return the authtoken generated to be associated with that session
     */
    AuthToken login(String username, String password){
        //Logs the user in
        //INSERT AN AUTHTOKEN associated with the username
        //returns the authtoken it inserted?

        return null;
    }

    /**
     *A function to clear the authtoken table
     */
    public void clear() throws DataAccessException {
        String sql = "DELETE FROM AuthToken";
        try (PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
            throw new DataAccessException("Error encountered while clearing the event table");
        }
    }
}

