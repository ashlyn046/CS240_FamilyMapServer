package Service;

import RequestResult.FillRequest;
import RequestResult.FillResult;

/**
 *A class containing a single function that populates the server's database with generated data for a user.
 */
public class FillService {

    //Populates the server's database with generated data for the specified username. The required
    // "username" parameter must be a user already registered with the server. If there is any data in
    // the database already associated with the given username, it is deleted.
    //The optional "generations" parameter lets the caller specify the number of generations of
    // ancestors to be generated, and must be a non-negative integer (the default is 4, which results in
    // 31 new persons each with associated events).
    //More details can be found in the earlier section titled “Family History Information Generation”


    /**
     *A function that populates the server's database with generated data for the specific username
     * @param r a fillRequest object passed in from the handlers
     * @return a fillResult objct to give to the handlers
     */
    public FillResult fill(FillRequest r){
        return null;
    }
}
