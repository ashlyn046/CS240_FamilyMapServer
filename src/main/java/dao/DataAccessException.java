package dao;

/**
 *A class for the exception for when we cannot access the data
 */
public class DataAccessException extends Exception {

    /**
     *An exception for when we fail to access the data
     */
    DataAccessException(String message) {
        super(message);
    }
}
