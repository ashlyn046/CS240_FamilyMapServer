package Service;

import RequestResult.LoadRequest;
import RequestResult.LoadResult;

/**
 *A class containing one funxtion that clears all the existing data and replaces it with user input.
 */
public class LoadService {
    //Clears all data from the database (just like the /clear API)
    //Loads the user, person, and event data from the request body into the database.

    /**
     *A function that clears all data from the database, and then loads the user, person, and event data from the request body
     * @param r a loadRequest object passed in from the handlers
     * @return a loadResult objct to give to the handlers
     */
    public LoadResult load(LoadRequest r){
        return null;
    }
}
