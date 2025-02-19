package com.monprojet;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        System.out.println("Hello World!");
        String url = "jdbc:mysql://localhost:3306/app";
        String utilisateur = "root";
        String motDePasse = "root";

        // Utilisation du try-with-resources pour gérer automatiquement la fermeture des ressources
        try (Connection connexion = DriverManager.getConnection(url, utilisateur, motDePasse);
             Statement stmt = connexion.createStatement();
             ResultSet rs = stmt.executeQuery("SELECT id, nom, email FROM utilisateurs")) {

            System.out.println("Connexion réussie !");
            System.out.println("Liste des utilisateurs :");

            // Parcours du ResultSet
            while (rs.next()) {
                int id = rs.getInt("id");
                String nom = rs.getString("nom");
                String email = rs.getString("email");
                System.out.println("ID : " + id + ", Email : " + email + ", Nom : " + nom);
            }

        } catch (SQLException e) {
            System.err.println("Erreur SQL : " + e.getMessage());
        }
    }
}
