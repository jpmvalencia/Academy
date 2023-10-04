package academy;

import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class Student {
    private String username;
    private String name;
    private String lastName;
    private String email;
    private String password;
    
    // El constructor recibe de la clase SignUp username, password y email
    public Student(JTextField username, JTextField name, JTextField lastName, JPasswordField password, JTextField email) {
        this.username = username.getText();
        this.name = name.getText();
        this.lastName = lastName.getText();
        this.password = String.valueOf(password.getPassword());
        this.email = email.getText();
    }

    public String getUsername() {
        return username;
    }

    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }
    
    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }
}
