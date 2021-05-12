/*
 * WxController
 * This is the controller for the FXML document that contains the view. 
 */

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

import java.net.URL;
import java.util.ResourceBundle;


public class WxController implements Initializable {

  @FXML
  private Button btnGetWx;

  @FXML
  private TextField txtAmount;

  @FXML
  private Label lblCityState;

  @FXML
  private Label lblTime;
  @FXML
  private Label lblUSD;
  @FXML
  private Label lblAED;
  @FXML
  private Label lblAFN;
  @FXML
  private Label lblALL;
  @FXML
  private Label lblAMD;
  @FXML
  private Label lblANG;
  @FXML
  private Label lblAOA;
  @FXML
  private Label lblARS;
  @FXML
  private Label lblAUD;
  @FXML
  private Label lblAWG;
  @FXML
  private Label lblAZN;
  @FXML
  private Label lblBAM;
  @FXML
  private Label lblBBD;
  @FXML
  private Label lblBDT;
  @FXML
  private Label lblBGN;
  @FXML
  private Label lblBHD;
  @FXML
  private Label lblBIF;
  @FXML
  private Label lblBMD;
  @FXML
  private Label lblBOB;
  @FXML
  private Label lblBRL;
  @FXML
  private Label lblBSD;
  @FXML
  private Label lblBTN;
  @FXML
  private Label lblBWP;
  @FXML
  private Label lblBZD;





  @FXML
  private void handleButtonAction(ActionEvent e) {
    // Create object to access the Model
    WxModel weather = new WxModel();

    // Get zipcode
    String userAmount = txtAmount.getText();

    // Use the model to get the weather information
    if (weather.isValid(userAmount))
    {
      weather.fetchCurrency();
      lblTime.setText(weather.time);
      lblUSD.setText(weather.USD);
      lblAED.setText(weather.AED);
      lblAFN.setText(weather.AFN);
      lblALL.setText(weather.ALL);
      lblAMD.setText(weather.AMD);
      lblANG.setText(weather.ANG);
      lblAOA.setText(weather.AOA);
      lblARS.setText(weather.ARS);
      lblAUD.setText(weather.AUD);
      lblAWG.setText(weather.AWG);
      lblAZN.setText(weather.AZN);
      lblBAM.setText(weather.BAM);
      lblBBD.setText(weather.BBD);
      lblBDT.setText(weather.BDT);
      lblBGN.setText(weather.BGN);
      lblBHD.setText(weather.BHD);
      lblBIF.setText(weather.BIF);
      lblBMD.setText(weather.BMD);
      lblBOB.setText(weather.BOB);
      lblBRL.setText(weather.BRL);
      lblBSD.setText(weather.BSD);
      lblBTN.setText(weather.BTN);
      lblBWP.setText(weather.BWP);
      lblBZD.setText(weather.BZD);





      System.out.println("working");

    }
    else
    {
      lblTime.setText("Invalid Number");
      lblUSD.setText("NA");
      lblAED.setText("NA");
      lblAFN.setText("NA");
      lblALL.setText("NA");
      lblAMD.setText("NA");
      lblANG.setText("NA");
      lblAOA.setText("NA");
      lblARS.setText("NA");
      lblAUD.setText("NA");
      lblAWG.setText("NA");
      lblAZN.setText("NA");
      lblBAM.setText("NA");
      lblBBD.setText("NA");
      lblBDT.setText("NA");
      lblBGN.setText("NA");
      lblBHD.setText("NA");
      lblBIF.setText("NA");
      lblBMD.setText("NA");
      lblBOB.setText("NA");
      lblBRL.setText("NA");
      lblBSD.setText("NA");
      lblBTN.setText("NA");
      lblBWP.setText("NA");
      lblBZD.setText("NA");


    }
  }

  @Override
  public void initialize(URL url, ResourceBundle rb) {
    // TODO
  }    

}
