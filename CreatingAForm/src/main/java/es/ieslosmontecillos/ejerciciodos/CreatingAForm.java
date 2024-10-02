package es.ieslosmontecillos.ejerciciodos;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;


public class CreatingAForm extends Application {
    @Override
    public void start(Stage stage) {
        stage.setTitle("Hello!");
        stage.show();


        GridPane root = new GridPane();
        root.setAlignment(Pos.CENTER);
        root.setHgap(10);
        root.setVgap(10);
        root.setPadding(new Insets(25, 25, 25, 25));

        Scene scene = new Scene(root, 300, 275);
        stage.setScene(scene);

        Text texto = new Text("Welcome");
        texto.setFont(Font.font("Tahoma", FontWeight.NORMAL, 20));
        root.add(texto, 0, 0, 2, 1);

        Label labelUsername = new Label("Username: ");
        root.add(labelUsername, 0, 1);

        TextField tfUser = new TextField();
        root.add(tfUser, 1, 1);

        Label labelPassword = new Label("Password: ");
        root.add(labelPassword, 0, 2);

        PasswordField pwBox = new PasswordField();
        root.add(pwBox, 1, 2);

        Button btn = new Button("Sign in");
        HBox hbBtn = new HBox(10);
        hbBtn.setAlignment(Pos.BOTTOM_RIGHT);
        hbBtn.getChildren().add(btn);
        root.add(hbBtn, 1, 4);

        final Text textActionTarget = new Text();
                root.add(textActionTarget, 1, 6);

        btn.setOnAction(actionEvent -> {
            textActionTarget.setFill(Color.RED);
            textActionTarget.setText("Sign in button pressed");
        });
    }

    public static void main(String[] args) {
        launch();
    }
}