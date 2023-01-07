package fiek.siguriainternet.aesprojekt;

import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class AesApplication extends javafx.application.Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(AesApplication.class.getResource("aes-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load());

        InputStream stream = new FileInputStream("src/main/resources/figurat/aes.jpg");
        Image image = new Image(stream);
        stage.getIcons().add(image);
        stage.setTitle("AES enkriptim");
        stage.setScene(scene);
        stage.show();


    }

    public static void main(String[] args) {
        launch();
    }
}