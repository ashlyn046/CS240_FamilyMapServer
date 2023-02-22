package Service;

import RequestResult.ClearResult;


/**
 *A class that has one funciton with the purpose of clearing the dataframe
 */
public class ClearService {
    //i decided to do a clear result class but not a clear request class becuase there was no input


    /**
     *A function that clears the entire database
     * @return a ClearResult objct to give to the handlers
     */
    public ClearResult clear() {
        //clears everything. we don't need any inputs or outputs
        return null;
    }
}
