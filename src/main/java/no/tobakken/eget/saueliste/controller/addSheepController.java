package no.tobakken.eget.saueliste.controller;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import no.tobakken.eget.saueliste.App;
import no.tobakken.eget.saueliste.Sheep;
import no.tobakken.eget.saueliste.SheepRegister;

public class addSheepController {
    @FXML
    TextField numberField;
    @FXML
    TextArea commentField;
    @FXML
    Button saveBtn;
    @FXML
    Button homepageBtn;
    @FXML
    TextField motherField;
    @FXML
    TextField fatherField;


    public void setHomepageBtn() {
        try {
            App.setRoot("homepage");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void savePressed() {
        SheepRegister reg = App.getRegister();
        if (!numberField.getText().equals("")){
            reg.addSheep(numberField.getText(), true, commentField.getText());
/*            Sheep newSheep = reg.findSheep(numberField.getText());
            newSheep.setMother(Integer.parseInt(motherField.getText()));
            newSheep.setFather(Integer.parseInt(fatherField.getText()));*/
        }
        try {
            App.setRoot("homepage");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
