package pl.javastart.mp3player.main;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

import java.util.Objects;

public class Main extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {
        stage.setTitle("MP3 Player");
        BorderPane borderPane = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("/fxml/mainPane.fxml")));
        Scene scene = new Scene(borderPane);
        stage.setScene(scene);
        stage.show();
    }
}
