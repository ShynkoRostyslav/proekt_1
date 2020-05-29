import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main_2 extends Application {
    void  handleAction(){


    }


    public static void main(String[] args) {

    }

    @Override
    public void start(Stage stage) throws Exception {

        Parent wrong = FXMLLoader.load(getClass().getResource("calculator.fxml"));
        Scene scene = new Scene(wrong);
        stage.setScene(scene);
        stage.show();
    }
}
