package Service;

import RequestResult.LoginRequest;
import RequestResult.LoginResult;

/**
 *A Service class containing one function with the purpose of loging an existing user back into the system
 */
public class LoginService {
    //Logs the user in
    //Returns an authtoken.

    /**
     *A function that logs a user in and returns an authtoken
     * @param r a loginRequest object passed in from the handlers
     * @return a loginResult object to give to the handlers
     */
    public LoginResult login(LoginRequest r){
        //this takes a loginrequest passed by the server and outputs a loginresult
        return null;
    }

}
