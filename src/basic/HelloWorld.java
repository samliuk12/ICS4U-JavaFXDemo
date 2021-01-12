package basic;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
 
public class HelloWorld extends Application { // Subclass of Application class
    public static void main(String[] args) {
        launch(args);
    }
    
    @Override
    /*
    For some context, the hierarchy of a JavaFX application is as follows:
    The stage is the frame of the gui; it is a container for all JavaFX objects
    The primary stage is internally created
    Scenes hold the physical contents of a JavaFX application. Visuals must be displayed on a scene and not the stage
    Nodes are objects or visuals (e.g. text, image, button). 
    A graph of nodes (e.g. stackpane) is passed into a scene to be displayed. Each graph always has a root node
    */
    public void start(Stage primaryStage) { 
        primaryStage.setTitle("Hello JavaFX!");
        Button btn = new Button();
        btn.setText("Say 'Hello JavaFX'");
        btn.setOnAction(new EventHandler<ActionEvent>() { 
 
            @Override
            public void handle(ActionEvent event) { // Code that runs if the button is clicked
                System.out.println("Hello JavaFX!");
            }
        });
        
        StackPane root = new StackPane();
        root.getChildren().add(btn);
        primaryStage.setScene(new Scene(root, 300, 250)); // Specify dimensinos of scene
        primaryStage.show();
    }
}