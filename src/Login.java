public class Login {
    
    String loginSuccess ="Login Sucessfull";
    String loginFailure ="Login Failed" ;
    String storedUserName = "Mike";
    String storedPassword = "123456";
   

    public String loginUser(String userName, String password)
    {
        if(userName.equals(storedUserName) && password.equals(storedPassword))
        {
            return loginSuccess;
        }

        else
        {
            return loginFailure;
        }


    }
}
