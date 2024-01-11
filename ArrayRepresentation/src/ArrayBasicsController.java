import java.io.IOException;

import javax.xml.ws.FaultAction;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class ArrayBasicsController {

    @FXML
    private Button buttonFive;

    @FXML
    private Button buttonFour;

    @FXML
    private Button buttonOne;

    @FXML
    private Button buttonThree;

    @FXML
    private Button buttonTwo;

    @FXML
    private Button backButton;

    @FXML
    void changeScene(ActionEvent event) {
        try{
            Parent parent = FXMLLoader.load(getClass().getResource("arrayOperationsScene.fxml"));
            Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
            window.setTitle("");
            window.setScene(new Scene(parent, 1300, 700));
            window.show();
        }catch(IOException e) {
            e.printStackTrace();
}

    }


    @FXML
    void ArrayCalculationsScene(ActionEvent event) {

        try{
            Parent parent = FXMLLoader.load(getClass().getResource("ArrayCalculationsScene.fxml"));
            Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
            window.setTitle("");
            window.setScene(new Scene(parent, 1300, 700));
            window.show();
        }catch(IOException e) {
            e.printStackTrace();
        }
    }

    @FXML
    void ArrayCalculationsScene2(ActionEvent event) {

        try{
            Parent parent = FXMLLoader.load(getClass().getResource("ArrayCalculationsScene2.fxml"));
            Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
            window.setTitle("");
            window.setScene(new Scene(parent, 1300, 700));
            window.show();
        }catch(IOException e) {
            e.printStackTrace();
}
    }
    @FXML
    void ArrayCalculationsScene3(ActionEvent event) {

        try{
            Parent parent = FXMLLoader.load(getClass().getResource("ArrayCalculationsScene3.fxml"));
            Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
            window.setTitle("");
            window.setScene(new Scene(parent, 1300, 700));
            window.show();
        }catch(IOException e) {
            e.printStackTrace();
}
    }
    @FXML
    void ArrayCalculationsScene4(ActionEvent event) {

        try{
            Parent parent = FXMLLoader.load(getClass().getResource("ArrayCalculationsScene4.fxml"));
            Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
            window.setTitle("");
            window.setScene(new Scene(parent, 1300, 700));
            window.show();
        }catch(IOException e) {
            e.printStackTrace();
}
    }
    @FXML
    void ArrayCalculationsScene5(ActionEvent event) {

        try{
            Parent parent = FXMLLoader.load(getClass().getResource("ArrayCalculationsScene5.fxml"));
            Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
            window.setTitle("");
            window.setScene(new Scene(parent, 1300, 700));
            window.show();
        }catch(IOException e) {
            e.printStackTrace();
}
    }

}
