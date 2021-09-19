package no.tobakken.eget.saueliste.controller;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import no.tobakken.eget.saueliste.App;

import java.io.IOException;

public class AddSheepPageController {

    @FXML
    Button homepageBtn;

    public void setHomepageBtn() {
        try {
            App.setRoot("homepage");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
