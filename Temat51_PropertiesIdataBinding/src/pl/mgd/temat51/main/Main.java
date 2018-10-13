package pl.mgd.temat51.main;
	
import java.util.Scanner;

import javafx.application.Application;
import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;


public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
		try {
			BorderPane root = new BorderPane();
			Scene scene = new Scene(root,400,400);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			primaryStage.setScene(scene);
			primaryStage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Podaj pierwsz¹ wartosæ first: ");
		IntegerProperty first = new SimpleIntegerProperty(sc.nextInt());
		IntegerProperty second = new SimpleIntegerProperty();
		second.bind(first);
		System.out.println("Wyswietle wartosc druga: " + second.get());
		System.out.println("A teraz zmieñ wartoœæ: ");
		first.set(sc.nextInt());
		System.out.println("Zmieniona wartoœæ to: " + " first= " + first.get() + ", second: " + second.get());
		sc.close();
		launch(args);
		
		
		
		
		
	}
}
