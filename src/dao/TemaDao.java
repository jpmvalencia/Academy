/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import clases.Topic;
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
public class TemaDao {
    private List<Topic> listaTemas = new ArrayList<>();
    
    String baseDeDatos = "academy";
    String usuario = "root";
    String password = "";
    String host = "localhost";
    String puerto = "3306";
    String driver = "com.mysql.cj.jdbc.Driver";
    String conexionUrl = "jdbc:mysql://" + host + ":" + puerto + "/" + baseDeDatos + "?useSSL=false";
    
    public void agregar(Topic tema) {
        
        try {
            Class.forName(driver);
            Connection conexion = DriverManager.getConnection(conexionUrl, usuario, password);
            Statement statement = conexion.createStatement();
            
            String sql = "SELECT * FROM `temas` WHERE title = '" + tema.getTitle()+ "'";
            ResultSet result = statement.executeQuery(sql);
            
            if (result.next()) {
                JOptionPane.showMessageDialog(null, "El tema ya existe");
            } else {
                listaTemas.add(tema);
            }
            
            conexion.close();
        } catch (Exception ex) {
            Logger.getLogger(TemaDao.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void insertarTemaEnDB() {
        
        try {
            Class.forName(driver);
            Connection conexion = DriverManager.getConnection(conexionUrl, usuario, password);
            Statement statement = conexion.createStatement();
            
            for (Topic tema : listaTemas) {
                String sql = "INSERT INTO `temas`(`id`, `title`, `content`) VALUES (NULL,'" + tema.getTitle()+ "','" + tema.getContent()+ "')";
                statement.execute(sql);
            }
            
            conexion.close();
        } catch (Exception ex) {
            Logger.getLogger(TemaDao.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    /*public void cargarBotonesDesdeDB(JScrollPane jScrollPane1) {
        try {
            Class.forName(driver);
            Connection conexion = DriverManager.getConnection(conexionUrl, usuario, password);
            Statement statement = conexion.createStatement();

            String sql = "SELECT * FROM `temas`";
            ResultSet result = statement.executeQuery(sql);

            while (result.next()) {
                String textoBoton = result.getString("title"); // Reemplaza "nombre_columna" con el nombre real de la columna en tu tabla
                JButton boton = new JButton(textoBoton);
                // Puedes personalizar el botón aquí según tus necesidades

                // Agrega el botón al JScrollPane
                jScrollPane1.add(boton);
            }

            conexion.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }*/
    public ArrayList<String> obtenerNombresBotones() {
        ArrayList<String> nombresBotones = new ArrayList<>();

        try {
            Class.forName(driver);
            Connection conexion = DriverManager.getConnection(conexionUrl, usuario, password);
            Statement statement = conexion.createStatement();

            String sql = "SELECT * FROM `temas`";
            ResultSet result = statement.executeQuery(sql);

            while (result.next()) {
                String nombreBoton = result.getString("title");
                nombresBotones.add(nombreBoton);
            }
        } catch (Exception ex) {
            Logger.getLogger(TemaDao.class.getName()).log(Level.SEVERE, null, ex);
        }

        return nombresBotones;
    }
    
    public String obtenerContenidoTema(String nombre) {
        String contenido = null;
        
        try {
            Class.forName(driver);
            Connection conexion = DriverManager.getConnection(conexionUrl, usuario, password);
            Statement statement = conexion.createStatement();

            String sql = "SELECT content FROM `temas` WHERE title = '" + nombre + "'";
            ResultSet result = statement.executeQuery(sql);
            
            if (result.next()) {
                contenido = result.getString("content");
            }
        } catch (Exception ex) {
            Logger.getLogger(TemaDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        return contenido;
    }
    
    public void actualizarTitulo(String titulo, String newTitulo) {
        
        try {
            Class.forName(driver);
            Connection conexion = DriverManager.getConnection(conexionUrl, this.usuario, password);
            Statement statement = conexion.createStatement();

            String sql = "SELECT title FROM `temas` WHERE title = '" + titulo + "'";
            ResultSet result = statement.executeQuery(sql);
            
            if (result.next()) {
                sql = "UPDATE `temas` SET title = '" + newTitulo + "' WHERE title = '" + titulo + "'";
                
                int filasAfectadas = statement.executeUpdate(sql);
            }
        } catch (Exception ex) {
            Logger.getLogger(TemaDao.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void actualizarContenido(String titulo, String newContenido) {
        
        try {
            Class.forName(driver);
            Connection conexion = DriverManager.getConnection(conexionUrl, this.usuario, password);
            Statement statement = conexion.createStatement();

            String sql = "SELECT content FROM `temas` WHERE title = '" + titulo + "'";
            ResultSet result = statement.executeQuery(sql);
            
            if (result.next()) {
                sql = "UPDATE `temas` SET content = '" + newContenido + "' WHERE title = '" + titulo + "'";
                
                int filasAfectadas = statement.executeUpdate(sql);
            }
        } catch (Exception ex) {
            Logger.getLogger(TemaDao.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public int borrarTema(String titulo) {
        int sw = 0;
        
        try {
            Class.forName(driver);
            Connection conexion = DriverManager.getConnection(conexionUrl, this.usuario, password);
            Statement statement = conexion.createStatement();

            // Verificar si el usuario existe antes de intentar borrarlo
            String sqlSelect = "SELECT * FROM `temas` WHERE title = '" + titulo + "'";
            ResultSet result = statement.executeQuery(sqlSelect);

            if (result.next()) {
                // El tema existe, proceder a borrarlo
                String sqlDelete = "DELETE FROM `temas` WHERE title = '" + titulo + "'";
                int filasAfectadas = statement.executeUpdate(sqlDelete);

                if (filasAfectadas > 0) {
                    JOptionPane.showMessageDialog(null, "Tema eliminado exitosamente.");
                    sw = 1;
                } else {
                    JOptionPane.showMessageDialog(null, "No se pudo eliminar el tema.");
                }
            }
        } catch (Exception ex) {
            Logger.getLogger(TemaDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return sw;
    }
}
