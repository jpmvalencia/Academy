package academy;

import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class Student {
    private String username;
    private String email;
    private String password;
    
    // El constructor recibe de la clase SignUp username, password y email
    public Student(JTextField username, JPasswordField password, JTextField email) {
        this.username = username.getText();
        this.password = String.valueOf(password.getPassword());
        this.email = email.getText();
    }
}
