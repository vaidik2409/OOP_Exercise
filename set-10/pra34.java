import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

import java.io.BufferedWriter;
import java.io.FileWriter;

public class pra34 extends Application {

    public void start(Stage stage) {

        GridPane grid = new GridPane();
        grid.setVgap(10);
        grid.setHgap(10);

        TextField roll = new TextField();
        TextField name = new TextField();
        TextField age = new TextField();
        TextField email = new TextField();

        Button submit = new Button("Submit");

        grid.add(new Label("Roll No:"), 0, 0);
        grid.add(roll, 1, 0);

        grid.add(new Label("Name:"), 0, 1);
        grid.add(name, 1, 1);

        grid.add(new Label("Age:"), 0, 2);
        grid.add(age, 1, 2);

        grid.add(new Label("Email:"), 0, 3);
        grid.add(email, 1, 3);

        grid.add(submit, 1, 4);

        submit.setOnAction(e -> {
            try {
                int r = Integer.parseInt(roll.getText());
                int a = Integer.parseInt(age.getText());

                String em = email.getText();

                if (!em.contains("@") || !em.contains(".")) {
                    throw new Exception("Invalid Email");
                }

                BufferedWriter bw = new BufferedWriter(new FileWriter("student.txt"));
                bw.write(r + " " + name.getText() + " " + a + " " + em);
                bw.close();

                Alert alert = new Alert(Alert.AlertType.INFORMATION);
                alert.setContentText("Registration Successful\nRoll: " + r +
                        "\nName: " + name.getText() +
                        "\nAge: " + a +
                        "\nEmail: " + em);
                alert.show();

            } catch (NumberFormatException ex) {
                Alert a = new Alert(Alert.AlertType.ERROR);
                a.setContentText("Roll No and Age must be integers");
                a.show();
            } catch (Exception ex) {
                Alert a = new Alert(Alert.AlertType.ERROR);
                a.setContentText(ex.getMessage());
                a.show();
            }
        });

        Scene scene = new Scene(grid, 400, 250);
        stage.setTitle("Registration Form");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}