/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import clases.Student;
import gui.LoginGui;
import gui.ProfileGui;
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
    
    public int agregar(Student estudiante) {
        try {
            Class.forName(driver);
            Connection conexion = DriverManager.getConnection(conexionUrl, usuario, password);
            Statement statement = conexion.createStatement();
            
            String sql = "SELECT * FROM `estudiantes` WHERE username = '" + estudiante.getUsername()+ "'";
            ResultSet result = statement.executeQuery(sql);
            
            if (result.next()) {
                JOptionPane.showMessageDialog(null, "El usuario ya existe");
                return 1;

            } else {
                listaEstudiantes.add(estudiante);
                JOptionPane.showMessageDialog(null, "Se creó el usuario correctamente.");
            }
            
            conexion.close();
        } catch (Exception ex) {
            Logger.getLogger(EstudianteDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        return 0;
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
    
    public String obtenerNombre(String usuario) {
        String contenido = null;
        
        try {
            Class.forName(driver);
            Connection conexion = DriverManager.getConnection(conexionUrl, this.usuario, password);
            Statement statement = conexion.createStatement();

            String sql = "SELECT name FROM `estudiantes` WHERE username = '" + usuario + "'";
            ResultSet result = statement.executeQuery(sql);
            
            if (result.next()) {
                contenido = result.getString("name");
            }
        } catch (Exception ex) {
            Logger.getLogger(TemaDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        return contenido;
    }
    
    public String obtenerApellido(String usuario) {
        String contenido = null;
        
        try {
            Class.forName(driver);
            Connection conexion = DriverManager.getConnection(conexionUrl, this.usuario, password);
            Statement statement = conexion.createStatement();

            String sql = "SELECT lastName FROM `estudiantes` WHERE username = '" + usuario + "'";
            ResultSet result = statement.executeQuery(sql);
            
            if (result.next()) {
                contenido = result.getString("lastname");
            }
        } catch (Exception ex) {
            Logger.getLogger(TemaDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        return contenido;
    }
    
    public String obtenerCorreo(String usuario) {
        String contenido = null;
        
        try {
            Class.forName(driver);
            Connection conexion = DriverManager.getConnection(conexionUrl, this.usuario, password);
            Statement statement = conexion.createStatement();

            String sql = "SELECT email FROM `estudiantes` WHERE username = '" + usuario + "'";
            ResultSet result = statement.executeQuery(sql);
            
            if (result.next()) {
                contenido = result.getString("email");
            }
        } catch (Exception ex) {
            Logger.getLogger(TemaDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        return contenido;
    }
    
    public void actualizarNombre(String usuario, String newNombre) {
        
        try {
            Class.forName(driver);
            Connection conexion = DriverManager.getConnection(conexionUrl, this.usuario, password);
            Statement statement = conexion.createStatement();

            String sql = "SELECT name FROM `estudiantes` WHERE username = '" + usuario + "'";
            ResultSet result = statement.executeQuery(sql);
            
            if (result.next()) {
                sql = "UPDATE `estudiantes` SET name = '" + newNombre + "' WHERE username = '" + usuario + "'";
                
                int filasAfectadas = statement.executeUpdate(sql);
            }
        } catch (Exception ex) {
            Logger.getLogger(TemaDao.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void actualizarApellido(String usuario, String newApellido) {
        
        try {
            Class.forName(driver);
            Connection conexion = DriverManager.getConnection(conexionUrl, this.usuario, password);
            Statement statement = conexion.createStatement();

            String sql = "SELECT lastName FROM `estudiantes` WHERE username = '" + usuario + "'";
            ResultSet result = statement.executeQuery(sql);
            
            if (result.next()) {
                sql = "UPDATE `estudiantes` SET lastName = '" + newApellido + "' WHERE username = '" + usuario + "'";
                
                int filasAfectadas = statement.executeUpdate(sql);
            }
        } catch (Exception ex) {
            Logger.getLogger(TemaDao.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void actualizarCorreo(String usuario, String newCorreo) {
        
        try {
            Class.forName(driver);
            Connection conexion = DriverManager.getConnection(conexionUrl, this.usuario, password);
            Statement statement = conexion.createStatement();

            String sql = "SELECT email FROM `estudiantes` WHERE username = '" + usuario + "'";
            ResultSet result = statement.executeQuery(sql);
            
            if (result.next()) {
                sql = "UPDATE `estudiantes` SET email = '" + newCorreo + "' WHERE username = '" + usuario + "'";
                
                int filasAfectadas = statement.executeUpdate(sql);
            }
        } catch (Exception ex) {
            Logger.getLogger(TemaDao.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public int borrarUsuario(String usuario) {
        int sw = 0;

        try {
            Class.forName(driver);
            Connection conexion = DriverManager.getConnection(conexionUrl, this.usuario, password);
            Statement statement = conexion.createStatement();

            // Verificar si el usuario existe antes de intentar borrarlo
            String sqlSelect = "SELECT * FROM `estudiantes` WHERE username = '" + usuario + "'";
            ResultSet result = statement.executeQuery(sqlSelect);

            if (result.next()) {
                // El usuario existe, solicitar confirmación antes de borrarlo
                int confirmacion = JOptionPane.showConfirmDialog(null, "¿Realmente quieres eliminar el usuario?", "Confirmar eliminación", JOptionPane.YES_NO_OPTION);

                if (confirmacion == JOptionPane.YES_OPTION) {
                    // Proceder a borrar el usuario
                    String sqlDelete = "DELETE FROM `estudiantes` WHERE username = '" + usuario + "'";
                    int filasAfectadas = statement.executeUpdate(sqlDelete);

                    if (filasAfectadas > 0) {
                        JOptionPane.showMessageDialog(null, "Usuario eliminado exitosamente.");
                        sw = 1;
                    } else {
                        JOptionPane.showMessageDialog(null, "No se pudo eliminar el usuario.");
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "Operación cancelada por el usuario.");
                }
            } else {
                JOptionPane.showMessageDialog(null, "El usuario no existe.");
            }
        } catch (Exception ex) {
            Logger.getLogger(TemaDao.class.getName()).log(Level.SEVERE, null, ex);
        }

        return sw;
    }
}
