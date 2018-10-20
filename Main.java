package hautzy;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("MainWindow.fxml"));
        primaryStage.setTitle("Hautzy Calc v1.0");
        primaryStage.setScene(new Scene(root, 350, 450));
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
