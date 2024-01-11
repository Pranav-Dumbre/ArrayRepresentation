import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class ArrayInputOutputGUI extends Application {

    private TextField sizeField;
    private TextField elementsField;
    private Label outputLabel;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Array Input and Output");

        // Create size input field
        sizeField = new TextField();
        sizeField.setPromptText("Enter array size");

        // Create element input field
        elementsField = new TextField();
        elementsField.setPromptText("Enter elements (comma-separated)");

        // Create submit button
        Button submitButton = new Button("Submit");
        submitButton.setOnAction(e -> handleSubmitButton());

        // Create output label
        outputLabel = new Label();

        // Create layout
        VBox vbox = new VBox(10);
        vbox.setPadding(new Insets(10));
        vbox.getChildren().addAll(sizeField, elementsField, submitButton, outputLabel);

        Scene scene = new Scene(vbox, 300, 200);
        primaryStage.setScene(scene);

        primaryStage.show();
    }

    private void handleSubmitButton() {
        try {
            // Get the size of the array
            int size = Integer.parseInt(sizeField.getText());
            String elementsText = elementsField.getText();
            String[] elementsArray = elementsText.split(",");
            
            if (elementsArray.length != size) {
                outputLabel.setText("Number of elements must match the array size.");
            } else {
                int[] array = new int[size];
                for (int i = 0; i < size; i++) {
                    array[i] = Integer.parseInt(elementsArray[i].trim());
                }

                // Display the entered array
                StringBuilder output = new StringBuilder("Output Array: [");
                for (int i = 0; i < size; i++) {
                    output.append(array[i]);
                    if (i < size - 1) {
                        output.append(", ");
                    }
                }
                output.append("]");

                outputLabel.setText(output.toString());
            }
        } catch (NumberFormatException e) {
            outputLabel.setText("Please enter a valid integer for size and elements.");
        }
    }
}
