import java.io.IOException;
import java.util.Arrays;
import java.util.StringTokenizer;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class ArrayCalculationsController5 {

    @FXML
    private TextField AddingElements;

    @FXML
    private TextField ArraySizefield;

    @FXML
    private Button EnteredData;

    @FXML
    private TextField OutputArray;

    @FXML
    private Button backButton;

    @FXML
    void changeScene(ActionEvent event) {
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
    void GettingOutput(ActionEvent event) {
        try {
            int size = Integer.parseInt(ArraySizefield.getText());
            String ele = AddingElements.getText();
            int arr[] = new int[size];

            System.out.println("Size: " + size);
            System.out.println("Elements: " + ele);

            StringTokenizer tokenizer = new StringTokenizer(ele, ",");
            int x = 0;
            while (tokenizer.hasMoreTokens() && x < size) {
                arr[x++] = Integer.parseInt(tokenizer.nextToken().trim());
            }

            if (x < size) {
                OutputArray.setText("Error: Insufficient elements provided.");
            } else if (tokenizer.hasMoreTokens()) {
                OutputArray.setText("Error: More elements provided than array size.");
            } else {
                int[] evenNumbers = ArraySolutions5.getEvenNumbers(arr);
                // Convert the evenNumbers array to a comma-separated string
                String evenNumbersString = Arrays.toString(evenNumbers);
                OutputArray.setText("Even Numbers: " + evenNumbersString);
            }
        } catch (NumberFormatException e) {
            OutputArray.setText("Invalid input. Please enter valid numbers.");
        }
    }

    @FXML
    void resultArray(ActionEvent event) {
        // You can add code here to perform additional array-related calculations
    }

    @FXML
    void sizeCapture(ActionEvent event) {
        // You can add code here to capture the size of the array
    }

    @FXML
    void ArrayAddition(ActionEvent event) {
        // You can add code here to handle array addition
    }
}
