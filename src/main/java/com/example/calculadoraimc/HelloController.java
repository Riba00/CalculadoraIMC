package com.example.calculadoraimc;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.text.DecimalFormat;

public class HelloController {
    @FXML
    private Label resultatLabel;
    @FXML
    private Label estatLabel;
    @FXML
    private TextField pes;
    @FXML
    private TextField altura;

    double resultat;

    @FXML
    protected void calculate(){
        try{
            if (altura.getText().length() != 3){
                throw new Exception();
            }
            resultat = Double.parseDouble(pes.getText())/Math.pow((Double.parseDouble(altura.getText())/100),2);
            DecimalFormat df = new DecimalFormat("#.00");
            resultatLabel.setText("El IMC és de "+String.valueOf(df.format(resultat)));

            if (resultat<18.5){
                estatLabel.setText("Baix pes");
            }else if (resultat>=18.5 && resultat<=24.9){
                estatLabel.setText("Pes normal");
            }else if (resultat>=25 && resultat<=29.9){
                estatLabel.setText("Sobrepes");
            }else{
                estatLabel.setText("Obessitat");
            }
        }catch (Exception e){
            resultatLabel.setText("Alguna dada és incorrecta");
            estatLabel.setText("");
        }


    }
}