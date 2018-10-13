package pl.mgd.browser.main;
	
import java.net.URL;
import java.util.ResourceBundle;
 
import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;
import javafx.scene.web.WebEngine;
import javafx.scene.web.WebView;
import javafx.stage.Stage;
 
public class Main extends Application implements Initializable {
 
    @FXML
    private WebView webView;
    @FXML
    private Button backButton;
    @FXML
    private Button nextButton;
    
    @Override
    public void start(Stage primaryStage) throws Exception {
        Parent parent = (Parent) FXMLLoader.load(getClass().getResource(
                "/pl/mgd/browser/main/BrowserPane.fxml"));
        Scene scene = new Scene(parent);
        primaryStage.setScene(scene);
        primaryStage.show();
    }
 
    public static void main(String[] args) {
        launch(args);
    }
 
    @Override
    public void initialize(URL location, ResourceBundle resources) {
        WebEngine engine = webView.getEngine();
        engine.load("http://google.pl");
        backButton.setText("Back");
        nextButton.setText("Next");
        backButton.addEventFilter(MouseEvent.MOUSE_CLICKED, new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                engine.executeScript("history.back()");
            }
        });
        
        nextButton.setOnAction(x -> engine.executeScript("history.forward();"));

    }
    
}