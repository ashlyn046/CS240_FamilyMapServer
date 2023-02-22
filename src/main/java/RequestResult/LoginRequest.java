package RequestResult;

/**
 *A class to model the structure of the Login Request JSON
 */
public class LoginRequest {

    /**
     *The username of the current user
     */
    String username;

    /**
     *The password of the current user
     */
    String password;

    /**
     *Constructor for the LoginRequest class.
     * @param username
     * @param password
     */
    public LoginRequest(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
