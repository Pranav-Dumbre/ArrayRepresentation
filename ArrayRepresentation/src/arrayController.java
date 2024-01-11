import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class arrayController {

    @FXML
    private Button ArrayAlgorithmsButton;

    @FXML
    private Button ArrayBasicsButton;

    @FXML
    private Button ArrayMethodsButton;

    @FXML
    private Button ArrayOptimizationButton;

    @FXML
    private Button ErrorRecognizationButton;

    @FXML
    private Button backButton;

    @FXML
    void ArrayAlgorithmsScene(ActionEvent event) {
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
    void ArrayBasicsScene(ActionEvent event) {
        try{
            Parent parent = FXMLLoader.load(getClass().getResource("ArrayBasicsScene.fxml"));
            Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
            window.setTitle("");
            window.setScene(new Scene(parent, 1300, 700));
            window.show();
        }catch(IOException e) {
            e.printStackTrace();
}

    }

    @FXML
    void ArrayMethodsScene(ActionEvent event) {
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
    void ArrayOptimizationScene(ActionEvent event) {
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
    void ErrorRecognizationScene(ActionEvent event) {
        try{
            Parent parent = FXMLLoader.load(getClass().getResource("ErrorRecognizationScene.fxml"));
            Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
            window.setTitle("");
            window.setScene(new Scene(parent, 1300, 700));
            window.show();
        }catch(IOException e) {
            e.printStackTrace();
}

    }

    @FXML
    void changeScene(ActionEvent event) {
        try{
            Parent parent = FXMLLoader.load(getClass().getResource("homeScene.fxml"));
            Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
            window.setTitle("");
            window.setScene(new Scene(parent, 1300, 700));
            window.show();
        }catch(IOException e) {
            e.printStackTrace();
}

    }

}
