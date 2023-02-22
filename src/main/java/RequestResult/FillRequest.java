package RequestResult;

/**
 *A class to model the structure of the Fill Request JSON
 */
public class FillRequest {
    //no request body?
    //but command line inputs are username and generations so i've included those
    /**
     *The username of the current user
     */
    String username;
    /**
     *The number of generations requested to fill
     */
    Integer generations;

    /**
     *Constructor for the FillRequest class.
     * @param generations
     * @param username
     */
    public FillRequest(String username, Integer generations) {
        this.username = username;
        this.generations = generations;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Integer getGenerations() {
        return generations;
    }

    public void setGenerations(Integer generations) {
        this.generations = generations;
    }
}
