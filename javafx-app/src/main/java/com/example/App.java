package com.example;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class App extends Application {

    @Override
    public void start(Stage primaryStage) {
        // Créer les composants
        Label label = new Label("Bienvenue dans le GESTIONNAIRE !");
        Label label2 = new Label("Que voulez-vous faire ?");
        //créer un menu qui permet de choisir entre les différentes fonctionnalités
        Button button1 = new Button("Ajouter un élément");
        
        button1.setOnAction(event -> {
           //si on clique sur ce bouton, on doit afficher un formulaire pour ajouter un élément dans une autre fenêtre
           Stage stage = new Stage();
              stage.setTitle("Ajouter un élément");
                VBox vbox = new VBox(10); // 10 est l'espacement entre les composants
                TextField textField = new TextField();

        });

        // Gérer l'événement du bouton
        button.setOnAction(event -> {
            String nom = textField.getText();
            String prenom = textField2.getText();
            resultLabel.setText("Bonjour, " + nom + prenom + " !");
        });

        // Organiser les composants dans un VBox
        VBox vbox = new VBox(10); // 10 est l'espacement entre les composants
        // Ajouter une classe CSS (si vous utilisez l'option 1)
        vbox.getStyleClass().add("vbox-root");
        vbox.getChildren().addAll(label, textField, button, resultLabel);
      


        // Créer la scène et appliquer le fichier CSS
        Scene scene = new Scene(vbox, 300, 200);
        scene.getStylesheets().add(getClass().getResource("/styles/main.css").toExternalForm());

        // Afficher la fenêtre
        primaryStage.setTitle("Formulaire Stylisé");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}