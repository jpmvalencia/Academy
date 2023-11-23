package clases;

public class Student {
    private String username;
    private String name;
    private String lastName;
    private String email;
    private String password;
    
    // El constructor recibe de la clase SignUp username, password y email
    public Student(String username, String name, String lastName, String password, String email) {
        this.username = username;
        this.name = name;
        this.lastName = lastName;
        this.password = password;
        this.email = email;
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
