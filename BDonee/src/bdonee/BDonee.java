/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bdonee;

/**
 *
 * @author PC
 */
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
public class BDonee {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("heelo world");
        System.out.println("Hello World!");
        String url = "jdbc:mysql://localhost:3306/nom_de_ta_base";
        String user = "root";
        String password = "ton_mot_de_passe";

        try {
            Connection conn = DriverManager.getConnection(url, user, password);
            System.out.println("Connexion réussie !");
        } catch (SQLException e) {
            System.out.println("Erreur de connexion : " + e.getMessage());
        }
        
    }
    
    
}
