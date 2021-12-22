package no.tobakken.eget.saueliste.controller;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableRow;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import no.tobakken.eget.saueliste.App;
import no.tobakken.eget.saueliste.Sheep;
//import no.tobakken.eget.saueliste.SheepKotlin;
import no.tobakken.eget.saueliste.SheepRegister;
import no.tobakken.eget.saueliste.singleton.SheepHolder;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class HomepageController implements Initializable {
    private SheepRegister register;
    private final SheepHolder holder = SheepHolder.getInstance();

    @FXML private Button addBtn;

    @FXML private TableView<Sheep> tableView;
    @FXML private TableColumn<Sheep, String> number;
    @FXML private TableColumn<Sheep, String> comment;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        register = App.getRegister();
        number.setCellValueFactory(new PropertyValueFactory<>("number"));
        comment.setCellValueFactory(new PropertyValueFactory<>("comment"));

        tableView.getItems().setAll(fillTableView());
        tableView.setRowFactory(tv -> {
            TableRow<Sheep> row = new TableRow<>();
            row.setOnMouseClicked(e -> {
                if (e.getClickCount() == 2 && (!row.isEmpty())) showSheep(row.getItem().getNumber());
            });
            return row;
        });
    }

    private ObservableList<Sheep> fillTableView(){
        return FXCollections.observableArrayList(register.getREGISTER());
    }

    public void setAddBtn(){
        try {
            App.setRoot("addSheepPage");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void showSheep(String id){
        holder.setSheep(register.findSheep(id));
        try {
            App.setRoot("showSheep");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
