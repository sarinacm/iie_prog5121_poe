import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) throws Exception {

       Login loginUser = new Login();

       String loginStatus = loginUser.loginUser("Mike", "123456");

       JOptionPane.showMessageDialog(null, loginStatus);

        
    }
}
