import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;

public class MilesPerGallonCalculatorController {

    @FXML  // fx:id="GallonsTextField"
    private TextField GallonsTextField;

    @FXML  // fx:id="MilesDrivenTextField"
    private TextField MilesDrivenTextField;

    @FXML  // fx:id="MilesPerGallonTextField"
    private TextField MilesPerGallonTextField;

    @FXML  // fx:id="calculator action event
    void CalculateButtonpressed(ActionEvent event) {
    	try {
    	double miles = Double.parseDouble(MilesDrivenTextField.getText());
    	double gallons = Double.parseDouble(GallonsTextField.getText());
    	double mpg = miles / gallons;
    	
    	MilesPerGallonTextField.setText(String.format("%.2f", mpg));
    	}
    	catch(NumberFormatException ex)
    	{
    		MilesPerGallonTextField.setText("Error - Use Proper Formating");
    		MilesPerGallonTextField.setStyle("-fx-border-color: red;");
    		
    	}


    }

    @FXML
    void Clearbuttonpressed(ActionEvent event) {
    	
    	    	MilesDrivenTextField.clear();
    	    	GallonsTextField.clear();
    	    	MilesPerGallonTextField.clear();
    	

    }

}
