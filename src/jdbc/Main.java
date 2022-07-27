/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.sql.ResultSet;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author leobusta
 */
public class Main {

    public static void crearLibro(Connection conn) {
        try {
            String sql = "INSERT INTO libro (libId , libNombre,libPub ,ediId ,autId , libPrecio ) VALUES (? ,? , ? , ? , ? , ?)";
            PreparedStatement statement = conn.prepareStatement(sql);
            statement.setInt(1, 1010);
            statement.setString(2, "La Hojarasca");
            statement.setInt(3, 1955);
            statement.setInt(4, 1);
            statement.setInt(5, 1);
            statement.setDouble(6, 95000.0);
            int rowsInserted = statement.executeUpdate();
            if (rowsInserted > 0) {
                System.out.println("Inserción exitosa!");
            }
        } catch (SQLException ex) {
            System.out.println("No Insertó");
            System.out.println(ex);
        }

    }
    
    public static void actualizar(Connection conn) throws SQLException{
        String sql = " UPDATE libro SET libNombre =? , libPub =? , libPrecio =? WHERE libId =?";
        PreparedStatement statement =conn.prepareStatement( sql );
        statement.setString (1 , "Crónica de una muerte anunciada ");
        statement.setInt (2 , 1981);
        statement.setDouble (3 , 100000.0);
        statement.setInt (4 , 1010);
        int rowsUpdated = statement . executeUpdate ();
        if ( rowsUpdated > 0) {
            System.out.println ("El registro fue  actualizado exitosamente !");
        }    
    
    }

    public static void traerLibros(Connection conn) {

        try {
            String sql = " SELECT * FROM libro ";
            Statement statement = conn.createStatement();
            ResultSet result = statement.executeQuery(sql);
            while (result.next()) {
                String titulo = result.getString(2);
                int pub = result.getInt(3);
                Double costo = result.getDouble(6);
                System.out.println("Título : " + titulo + " Año publicación: " + pub + " Costo : " + costo);
            }
        } catch (SQLException ex) {
            System.out.println("No Insertó");
            System.out.println(ex);
        }
    }

    
    public static void borrar(Connection conn) throws SQLException {
        String sql = " DELETE FROM libro WHERE libId =?";
        PreparedStatement statement  = conn.prepareStatement(sql);
        statement.setInt(1, 1010);
        int rowsDeleted = statement.executeUpdate();
        if (rowsDeleted > 0) {
            System.out.println(" Borrado exitoso !");
        }   
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String dbURL = "jdbc:mysql://localhost:3306/libreria";
        String username = "root";
        String password = "hola1234";
        // conectar
        try {
            Connection conn = DriverManager.getConnection(dbURL, username, password);
            if (conn != null) {
                System.out.println("Conectado");
            }
            //crearLibro(conn);
            traerLibros(conn);
            actualizar(conn);
            traerLibros(conn);
            borrar(conn);
            traerLibros(conn);
        } catch (SQLException ex) {
            System.out.println("No conectado");
            System.out.println(ex);
        }
    }

}
