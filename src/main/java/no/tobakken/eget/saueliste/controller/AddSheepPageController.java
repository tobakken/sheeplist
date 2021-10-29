package no.tobakken.eget.saueliste.controller;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import no.tobakken.eget.saueliste.App;
import no.tobakken.eget.saueliste.SheepRegister;

import java.io.IOException;

public class AddSheepPageController {

    @FXML
    Button homepageBtn;
    @FXML Button saveBtn;

    @FXML
    TextField numberField;
    @FXML
    TextArea commentField;

    @FXML TextField fatherField;
    @FXML TextField motherField;

    public void setHomepageBtn() {
        try {
            App.setRoot("homepage");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void savePressed(){
        SheepRegister register = App.getRegister();
        register.addSheep(numberField.getText(), true, commentField.getText());
        try {
            App.setRoot("homepage");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
