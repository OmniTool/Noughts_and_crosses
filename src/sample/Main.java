package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("../fxml/sample.fxml"));
        primaryStage.setTitle("Noughts and crosses");
        primaryStage.setScene(new Scene(root, 300, 450));
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
