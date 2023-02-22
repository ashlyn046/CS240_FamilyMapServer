package RequestResult;
//the request result classes directly model JSON imput and output of all webAPI
//the handler classes get JSON and deserialize into a request object
        //then pass req object to service class who returns a result obj
//then they take result objects and put them back into JSON

/**
 *A class to model the structure of the Register Request JSON
 */
public class RegisterRequest {
    /**
     *The username of the current user
     */
    String username;
    /**
     *The password of the current user
     */
    String password;
    /**
     *The email of the current user
     */
    String email;

    /**
     *The first name of the current user
     */
    String firstName;

    /**
     *The last name of the current user
     */
    String lastName;

    /**
     *The gender of the current user
     */
    String gender;

    /**
     *Constructor for the ClearResult class.
     * @param lastName
     * @param gender
     * @param firstName
     * @param username
     * @param email
     * @param password
     */
    public RegisterRequest(String username, String password, String email, String firstName, String lastName, String gender) {
        this.username = username;
        this.password = password;
        this.email = email;
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
}
