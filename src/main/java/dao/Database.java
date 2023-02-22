package dao;

/*THIs class manages the database connection
*
* it holds on to the connection that gets opened in its conn instance variable.
*
* so it's basically just a wrapper around this connection*/

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *A class for connecting to and disconnecting from the database
 */
public class Database {
    /**
     *A connection object
     */
    private Connection conn;

    // Whenever we want to make a change to our database we will have to open a connection and use
    // Statements created by that connection to initiate transactions
    /**
     *A function that opens a connection to the database
     * @return A connection
     */
    public Connection openConnection() throws DataAccessException {
        try {
            // The Structure for this Connection is driver:language:path
            // The path assumes you start in the root of your project unless given a full file path
            final String CONNECTION_URL = "jdbc:sqlite:familymap.sqlite";

            // Open a database connection to the file given in the path
            conn = DriverManager.getConnection(CONNECTION_URL);

            // Start a transaction
            conn.setAutoCommit(false);
        } catch (SQLException e) {
            e.printStackTrace();
            throw new DataAccessException("Unable to open connection to database");
        }

        return conn;
    }

    /**
     *A function that opens a connection if there is not one yet, or returns the old one if there is already one
     * @return an open connection
     */
    public Connection getConnection() throws DataAccessException {
        if (conn == null) {
            return openConnection();
        } else {
            return conn;
        }
    }

    // When we are done manipulating the database it is important to close the connection. This will
    // end the transaction and allow us to either commit our changes to the database (if true is passed in)
    // or rollback any changes that were made before we encountered a potential error (if false is passed in).

    // IMPORTANT: IF YOU FAIL TO CLOSE A CONNECTION AND TRY TO REOPEN THE DATABASE THIS WILL CAUSE THE
    // DATABASE TO LOCK. YOUR CODE MUST ALWAYS CLOSE THE DATABASE NO MATTER WHAT ERRORS
    // OR PROBLEMS ARE ENCOUNTERED
    /**
     *A function that closes the connection
     * @param commit
     */
    public void closeConnection(boolean commit) {
        try {
            if (commit) {
                // This will commit the changes to the database
                conn.commit();
            } else {
                // If we find out something went wrong, pass a false into closeConnection and this
                // will rollback any changes we made during this connection
                conn.rollback();
            }
            conn.close();
            conn = null;
        } catch (SQLException e) {
            // If you get here there are probably issues with your code and/or a connection is being left open
            e.printStackTrace();
        }
    }


}

