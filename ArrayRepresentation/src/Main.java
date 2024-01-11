import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {

        primaryStage.setResizable(false);
        FXMLLoader loader = new FXMLLoader(getClass().getResource("homeScene.fxml"));
        Parent root = loader.load();

        // Get the controller instance if needed
        //SampleController controller = loader.getController();

        primaryStage.setTitle("FXML Loading Example");
        primaryStage.setScene(new Scene(root, 1300, 700));
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
