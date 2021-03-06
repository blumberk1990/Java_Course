package pl.mgd.temat49.main;
	
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Parent;
import javafx.scene.Scene;


public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
		try {
			
			final String appName = "Testowa";
			Parent parent = FXMLLoader.load(getClass().getResource(
	                "/pl/mgd/temat49/view/MainPane.fxml"));
	        Scene scene = new Scene(parent);
	        primaryStage.setTitle(appName);
			primaryStage.setScene(scene);
			primaryStage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
