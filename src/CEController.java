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

import java.net.URL;
import java.util.ResourceBundle;


public class CEController implements Initializable {

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
    CEModel exchange = new CEModel();

    // Get zipcode
    String userAmount = txtAmount.getText();

    // Use the model to get the exchange information
    if (exchange.isValid(userAmount))
    {
      exchange.fetchCurrency();
      lblTime.setText(exchange.time);
      lblUSD.setText(exchange.USD);
      lblAED.setText(exchange.AED);
      lblAFN.setText(exchange.AFN);
      lblALL.setText(exchange.ALL);
      lblAMD.setText(exchange.AMD);
      lblANG.setText(exchange.ANG);
      lblAOA.setText(exchange.AOA);
      lblARS.setText(exchange.ARS);
      lblAUD.setText(exchange.AUD);
      lblAWG.setText(exchange.AWG);
      lblAZN.setText(exchange.AZN);
      lblBAM.setText(exchange.BAM);
      lblBBD.setText(exchange.BBD);
      lblBDT.setText(exchange.BDT);
      lblBGN.setText(exchange.BGN);
      lblBHD.setText(exchange.BHD);
      lblBIF.setText(exchange.BIF);
      lblBMD.setText(exchange.BMD);
      lblBOB.setText(exchange.BOB);
      lblBRL.setText(exchange.BRL);
      lblBSD.setText(exchange.BSD);
      lblBTN.setText(exchange.BTN);
      lblBWP.setText(exchange.BWP);
      lblBZD.setText(exchange.BZD);

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
