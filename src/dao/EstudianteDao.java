/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import academy.Student;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Usuario
 */
public class EstudianteDao {
    private List<Student> listaEstudiantes = new ArrayList<>();
    
    String baseDeDatos = "academy";
    String usuario = "root";
    String password = "";
    String host = "localhost";
    String puerto = "3306";
    String driver = "com.mysql.cj.jdbc.Driver";
    String conexionUrl = "jdbc:mysql://" + host + ":" + puerto + "/" + baseDeDatos + "?useSSL=false";
    
    public void agregar(Student estudiante) {
        
        try {
            Class.forName(driver);
            Connection conexion = DriverManager.getConnection(conexionUrl, usuario, password);
            Statement statement = conexion.createStatement();
            
            String sql = "SELECT * FROM `estudiantes` WHERE username = '" + estudiante.getUsername()+ "'";
            ResultSet result = statement.executeQuery(sql);
            
            if (result.next()) {
                JOptionPane.showMessageDialog(null, "El usuario ya existe");
            } else {
                listaEstudiantes.add(estudiante);
            }
            
            conexion.close();
        } catch (Exception ex) {
            Logger.getLogger(EstudianteDao.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void insertarUsuarioEnDB() {
        
        try {
            Class.forName(driver);
            Connection conexion = DriverManager.getConnection(conexionUrl, usuario, password);
            Statement statement = conexion.createStatement();
            
            for (Student estudiante : listaEstudiantes) {
                String sql = "INSERT INTO `estudiantes`(`id`, `username`, `name`, `lastName`, `email`, `password`) VALUES (NULL,'" + estudiante.getUsername() + "','" + estudiante.getName() + "','" + estudiante.getLastName() + "','" + estudiante.getEmail() + "','" + estudiante.getPassword() + "')";
                statement.execute(sql);
            }
            
            conexion.close();
        } catch (Exception ex) {
            Logger.getLogger(EstudianteDao.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public boolean iniciarSesion(String username, String pwd) {
        try {
            Class.forName(driver);
            Connection conexion = DriverManager.getConnection(conexionUrl, usuario, password);
            Statement statement = conexion.createStatement();

            String sql = "SELECT * FROM `estudiantes` WHERE `username` = '" + username + "' AND `password` = '" + pwd + "'";
            ResultSet result = statement.executeQuery(sql);

            if (result.next()) {
                // Las credenciales son válidas, el usuario ha iniciado sesión exitosamente
                conexion.close();
                return true;
            } else {
                // Las credenciales no son válidas
                conexion.close();
                return false;
            }
        } catch (Exception ex) {
            Logger.getLogger(EstudianteDao.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }
}
