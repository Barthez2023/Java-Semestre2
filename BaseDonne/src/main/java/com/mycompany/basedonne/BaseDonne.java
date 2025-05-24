/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.basedonne;

/**
 *
 * @author PC
 */
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
public class BaseDonne {

    public static void main(String[] args) {
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
        System.out.println("santus santus santus dominun Deus sabahot Deus Sabahot");
    }
}
