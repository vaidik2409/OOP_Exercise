import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.scene.paint.Color;

public class pra35 extends Application {

    public void start(Stage stage) {

        HBox root = new HBox(20);
        root.setStyle("-fx-alignment: center;");

        root.getChildren().add(createBar("Projects - 20%", 20, Color.RED));
        root.getChildren().add(createBar("Quizzes - 10%", 10, Color.BLUE));
        root.getChildren().add(createBar("Midterm - 30%", 30, Color.GREEN));
        root.getChildren().add(createBar("Final - 40%", 40, Color.ORANGE));

        Scene scene = new Scene(root, 600, 400);
        stage.setTitle("Grade Distribution Chart");
        stage.setScene(scene);
        stage.show();
    }

    private VBox createBar(String label, int value, Color color) {
        VBox box = new VBox(5);
        box.setStyle("-fx-alignment: bottom-center;");

        Rectangle bar = new Rectangle(50, value * 3);
        bar.setFill(color);

        Text text = new Text(label);

        box.getChildren().addAll(bar, text);

        return box;
    }

    public static void main(String[] args) {
        launch(args);
    }
}