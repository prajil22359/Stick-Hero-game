package com.example.prajil;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.media.AudioClip;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.Objects;

public class PauseSceneController {

    @FXML
    Stage stage;
    @FXML
    Scene scene;
    @FXML
    Parent root;
    private AudioClip buttonClickSound =  new AudioClip(getClass().getResource("click-button.mp3").toString());


    @FXML
    public void switchToPlay(ActionEvent event) throws IOException {
        buttonClickSound.play();
        root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("playScene.fxml")));
        stage= (Stage)((Node)event.getSource()).getScene().getWindow();
        scene= new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    public void switchToHome(ActionEvent event) throws IOException {
        buttonClickSound.play();
        root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("homePage.fxml")));
        stage= (Stage)((Node)event.getSource()).getScene().getWindow();
        scene= new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

}



