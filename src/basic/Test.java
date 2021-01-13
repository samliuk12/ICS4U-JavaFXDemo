package basic;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import static javafx.geometry.HPos.RIGHT;

import javafx.geometry.HPos;
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

public class Test extends Application {

    public static void main(String args[]) {
        launch(args);
    }

    @Override // Overriding default start method of application
    public void start(Stage primaryStage) {
        primaryStage.setTitle("My first JavaFX program!");

        // Grid 
        GridPane grid = new GridPane();
        grid.setAlignment(Pos.CENTER);
        grid.setHgap(10);
        grid.setVgap(10);

        Label name = new Label("Name: ");
        grid.add(name, 0, 0);

        TextField userName = new TextField();
        grid.add(userName, 1, 0);

        Label age = new Label("Age: ");
        grid.add(age, 0, 1);

        TextField userAge = new TextField();
        grid.add(userAge, 1, 1);

        Button btn = new Button("Click me!");
        grid.add(btn, 1, 2);
        grid.setHalignment(btn, HPos.RIGHT);
        btn.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent e) {
                System.out.println("Button clicked!");
            }
        });

        primaryStage.setScene(new Scene(grid, 300, 300));
        primaryStage.show();
    }
    
}
