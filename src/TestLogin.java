import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;

import org.junit.Test;

public class TestLogin 
{

    Login loginStatus = new Login();

     String expected = loginStatus.loginSuccess;
     String actual  = loginStatus.loginUser("Mike", "123456");


    @Test

    public void testLoginStatus()
    {
        assertEquals(expected, actual);
      
        
    }

    
    
}
