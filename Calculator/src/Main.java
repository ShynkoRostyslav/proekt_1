
import javafx.application.Application;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class Main  extends Application implements Initializable {

     public Button seven;
     
    public Button eight;
    public Button nine;
    public Button four;
    public Button five;
    public Button six;
    public Button one;
    public Button two;
    public Button three;
    public TextField panel;
    public Button plus;
    public Button minus;
    public Button divine;
    public Button multiply;
    public Button zero;
    public Button equals;
    String operation="";

    long  s_1;
    long s_2;
    String operrator;

    @FXML
    void zero_click(){

panel.setText(panel.getText() + "0");
    }

    @FXML
    void one_click(){
        panel.setText(panel.getText() + "1");
    }

    @FXML
    void two_click(){
        panel.setText(panel.getText() + "2");
    }
    @FXML
    void three_click(){
        panel.setText(panel.getText() + "3");
    }
    @FXML
    void four_click(){
        panel.setText(panel.getText() + "4");
    }
    @FXML
    void five_click(){
        panel.setText(panel.getText() + "5");
    }
    @FXML
    void six_click(){
        panel.setText(panel.getText() + "6");
    }
    @FXML
    void seven_click(){
        panel.setText(panel.getText() + "7");
    }
    @FXML
    void eight_click(){
        panel.setText(panel.getText() + "8");
    }
    @FXML
    void nine_click(){
        panel.setText(panel.getText() + "9");
    }
    @FXML
    void plus_click(){
String value = panel.getText();
        this.s_1= Integer.parseInt(value);
panel.setText("");
operrator="+";

    }
    @FXML
    void minus_click(){
        String value = panel.getText();
        this.s_1= Integer.parseInt(value);
        panel.setText("");
        operrator="-";
    }
    @FXML
    void divide_click(){
        String value = panel.getText();
        this.s_1= Integer.parseInt(value);
        panel.setText("");
        operrator="/";
    }
    @FXML
    void multiply_click(){
        String value = panel.getText();
        this.s_1= Integer.parseInt(value);
        panel.setText("");
        operrator="*";
    }
    @FXML
    void equals_click(){
        switch( operrator){
            case "+" :
String value = panel.getText();
s_2=Integer.parseInt(value);
long chislo =  (s_1 +s_2);
panel.setText(String.valueOf(chislo));
             break;


            case "-":
                String value1 = panel.getText();
                s_2=Integer.parseInt(value1);
                long chislo1 =  (s_1 -s_2);
                panel.setText(String.valueOf(chislo1));
                break;




            case "/":

                String value2 = panel.getText();
                s_2=Integer.parseInt(value2);
                long chislo2 =  (s_1 /s_2);
                panel.setText(String.valueOf(chislo2));
                break;



            case "*":
                String value3 = panel.getText();
                s_2=Integer.parseInt(value3);
                long chislo3 =  (s_1 *s_2);
                panel.setText(String.valueOf(chislo3));
                break;



        }
    }





    public static void main(String[] args) throws IOException {

        launch(args);

    }


    @Override
    public void start(Stage stage) throws Exception {
        Parent wrong = FXMLLoader.load(getClass().getResource("calculator_2.fxml"));
        Scene scene = new Scene(wrong);
        stage.setScene(scene);
        stage.show();
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }
}
