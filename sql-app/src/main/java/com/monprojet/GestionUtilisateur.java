package com.monprojet;


import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class GestionUtilisateur {
    ArrayList<Utilisateur> utilisateurs = new ArrayList<Utilisateur>();
    Connexion link = null;

    public GestionUtilisateur(Connexion plink) {
        this.link = plink;
    }

    public void listUtilisateurs () {
        try {
            Statement stmt = this.link.connexion.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT id, nom, email FROM utilisateurs");
            System.out.println("Listes des utilisateurs:");
            while (rs.next()) {
                int id = rs.getInt("id");
                String nom = rs.getString("nom");
                String email = rs.getString("email");

                System.out.println("ID : " + id + ", Nom : " + nom + ", Email : " + email);
            }
           
        } catch (SQLException e) {
            System.out.println("Erreur de connexion : " + e.getMessage());
        }
    }

    public void addUtilisateurs(Utilisateur utilisateur) {
        try {

            if (utilisateur.isValidNom()) {
                String sqlInsert = "INSERT INTO utilisateurs (nom, email) VALUES (?, ?)";
                PreparedStatement pstmtInsert = this.link.connexion.prepareStatement(sqlInsert);
                pstmtInsert.setString(1, utilisateur.getNom());
                pstmtInsert.setString(2, utilisateur.getEmail());
                pstmtInsert.executeUpdate();

                this.utilisateurs.add(utilisateur);
                
                System.out.println("Insertion réussie.");
            } else {
                System.out.println("Nom non valide !");
            }
        } catch (SQLException e) {
            System.out.println("Erreur de connexion : " + e.getMessage());
        }
    }

    
    public void deleteUtilisateurs(int id) {
        try {
            String sqlDelete = "DELETE FROM utilisateurs WHERE id = ?";
            PreparedStatement pstmtDelete = this.link.connexion.prepareStatement(sqlDelete);
            pstmtDelete.setInt(1, id);
            int ligneAffected = pstmtDelete.executeUpdate();

            if (ligneAffected > 0) {
                System.out.println("Suppression réussie pour l'utilisateur avec l'ID : " + id);
            } else {
                System.out.println("Aucune suppression effectuée pour l'utilisateur avec l'ID : " + id);
            }
        } catch (SQLException e) {
            System.out.println("Erreur de connexion : " + e.getMessage());
        }
    }

   
    public void ModifUtilisateurs(int id, String nom, String email) {
        try {
            String sqlUpdate = "UPDATE utilisateurs SET nom = ?, email = ? WHERE id = ?";
            PreparedStatement pstmtUpdate = this.link.connexion.prepareStatement(sqlUpdate);
            pstmtUpdate.setString(1, nom);
            pstmtUpdate.setString(2, email);
            pstmtUpdate.setInt(3, id);
            int ligneAffecté = pstmtUpdate.executeUpdate();

            if (ligneAffecté > 0) {
                System.out.println("Modification réussie pour avec l'ID : " + id);
            } else {
                System.out.println("Aucune modification effectuée pour l'utilisateur avec l'ID : " + id);
            }
            } catch (SQLException e) {
                System.out.println("Erreur de connexion : " + e.getMessage());
            }
            }

}