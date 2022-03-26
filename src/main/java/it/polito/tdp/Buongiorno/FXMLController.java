package it.polito.tdp.Buongiorno;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class FXMLController {

    @FXML
    private Label label;

    @FXML
    private TextField txtField;

    @FXML
    void handleBungiorno(ActionEvent event) {
    	String nome = txtField.getText();
    	if(nome.length()>0) {
    		label.setText("Buongiorno, " +nome+ ".");
    	} else {
    		label.setText("Perfavore inserisci il tuo nome!");
    	}
    }

}


