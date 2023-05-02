import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;



public class MilesPerGallon extends Application {
	   
	@Override
	   
	    public void start(Stage primaryStage) throws Exception{
	        Parent root = 
	        		FXMLLoader.load(getClass().getResource("milespergallon.fxml"));
	        Scene Scene = new Scene(root);  // attach scene graph to scene 
	        
	        primaryStage.setTitle("Miles Per Gallon Calculator");// display in window's title bar
	        
	        primaryStage.setScene(Scene);// attach scene to stage 
	        
	        primaryStage.show();// display the stage 
	    }


		public static void main(String[] args) {
			// TODO Auto-generated method stub
			
			// create a milespergallon object and call its start method 
			
			launch(args);
		}
}



