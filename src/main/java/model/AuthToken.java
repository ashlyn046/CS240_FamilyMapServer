package model;
//NOTE: all the model classes will be used to represent data when it is in memory

import java.util.Objects;

/**
 *A class to model the form of the AuthToken table in the SQLite database
 */
public class AuthToken {

    /**
     *A token to authenticate a user's session
     */
    private String authtoken;

    /**
     *The username associated with a given user
     */
    private String username;

    //CONSTRUCTOR
    /**
     *A constructor for the AuthToken class
     * @param username
     * @param authtoken
     */
    AuthToken(String authtoken, String username){
        this.authtoken = authtoken;
        this.username = username;
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

    /**
     *Overriding the hashcode method so that we can change the equals method to not be by reference
     */
    @Override
    public int hashCode() {
        return Objects.hash(authtoken, username);
    }

    /**
     *Overriding the equals method to not be by reference
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AuthToken token = (AuthToken) o;
        return Objects.equals(authtoken, token.authtoken) && Objects.equals(username, token.username);
    }
}
