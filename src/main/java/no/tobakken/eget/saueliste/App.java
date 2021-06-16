package no.tobakken.eget.saueliste;


import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class App extends Application {

    private static SheepRegister register;
    private static Scene scene;

    @Override
    public void start(Stage stage) throws Exception {
        scene = new Scene(loadFXML("homepage"), 700, 500);
        stage.setScene(scene);
        stage.show();
    }

    public static void setRoot(String fxml) throws IOException {
        scene.setRoot(loadFXML(fxml));
    }

    private static Parent loadFXML(String fxml) throws IOException{
        FXMLLoader fxmlLoader = new FXMLLoader(App.class.getResource(fxml + ".fxml"));
        return fxmlLoader.load();
    }

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void init() throws Exception {
        super.init();
        register = new SheepRegister();
    }

    public static SheepRegister getRegister() {
        return register;
    }
}
