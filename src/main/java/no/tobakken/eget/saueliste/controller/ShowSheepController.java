package no.tobakken.eget.saueliste.controller;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import no.tobakken.eget.saueliste.App;
import no.tobakken.eget.saueliste.Sheep;
import no.tobakken.eget.saueliste.singleton.SheepHolder;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class ShowSheepController implements Initializable{

    @FXML
    Label numberField;
    @FXML
    TextField commentField;
    @FXML
    Button homeBtn;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        Sheep currentSheep = SheepHolder.getInstance().getUser();
        numberField.setText(currentSheep.getNumber());
        commentField.setText(currentSheep.getComment());
    }

    public void toHomepage(){
        try {
            App.setRoot("homepage");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
