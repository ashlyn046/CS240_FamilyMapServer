package RequestResult;

/**
 *A class to model the structure of the Load Result JSON
 */

public class LoadResult {
    /**
     *A message about why there was an error.
     */
    String message;

    /**
     *A boolean describing whether the attempt was a success
     */
    Boolean success;

    /**
     *Constructor for the LoadResult class.
     * @param message
     * @param success
     */
    public LoadResult(String message, Boolean success) {
        this.message = message;
        this.success = success;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Boolean getSuccess() {
        return success;
    }

    public void setSuccess(Boolean success) {
        this.success = success;
    }
}