import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class ErrorSceneController {

    @FXML
    private Button backButton;

    @FXML
    private Button nextButton;

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
    void changeScene2(ActionEvent event) {
         try{
            Parent parent = FXMLLoader.load(getClass().getResource("ErrorRecognizationScene2.fxml"));
            Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
            window.setTitle("");
            window.setScene(new Scene(parent, 1300, 700));
            window.show();
        }catch(IOException e) {
            e.printStackTrace();
}

    }

}
