package Service;

import RequestResult.RegisterResult;
import RequestResult.RegisterRequest;

/**
 * A Register class that has one function with the purpose of registering a user and filling in the family tree for that user.
 */
public class RegisterService {
    //creates a user and fills in the family tree
    //uses the user model class and the dao classes etc to actually do that
    //only has one method: REGISTER

    /**
     * The afore-mentioned function. Its purpose is to register a user and set up their family tree.
     *
     * @param r The RegisterRequest object passed from the handler
     * @return A RegisterResult object that the handler will convert to JSON
     */
    public RegisterResult register(RegisterRequest r){
        //this takes a RegisterRequest object that the server passes in and then does all the work to
        // register the user and then returns a RegisterResult object

        return null;
    }


}
