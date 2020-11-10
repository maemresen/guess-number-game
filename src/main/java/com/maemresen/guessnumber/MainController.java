package com.maemresen.guessnumber;

import javafx.application.Platform;
import javafx.fxml.FXML;

import java.io.IOException;

import static com.maemresen.guessnumber.Main.window;
import static com.maemresen.guessnumber.Main.inGameMenu;

public class MainController {

    @FXML
    public void playGame() throws IOException {

        window.setScene(inGameMenu);
        GuessNumberGame.startGame();
    }

    @FXML
    public void exitGame(){
        Platform.exit();
    }

}
