package sample;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.Pane;
import javafx.stage.FileChooser;
import javafx.stage.Stage;

import java.awt.*;
import java.io.*;
import java.util.EventListenerProxy;

/**
 * Created by Monir on 10/2/16.
 */
public class MyTestFX1 extends Application implements EventHandler<ActionEvent> {

    private TextField textFieldFirstName = new TextField();
    private Label labelFirstName = new Label("First Name:");
    private Button button = new Button("Submit");
    private Button fileChooserButton = new Button("Browse Files");
    FileChooser fileChooser;

    @Override
    public void start(Stage stage) throws Exception {
        FlowPane flowPane = new FlowPane();
        flowPane.setPadding(new Insets(11,12,13,14));
        flowPane.setVgap(5);
        flowPane.setHgap(5);

        flowPane.getChildren().addAll(labelFirstName, textFieldFirstName, button, fileChooserButton);
        button.setOnAction(this);
        fileChooserButton.setOnAction(this);

        Scene scene = new Scene(flowPane,500,250);
        stage.setTitle("This is a Test");
        stage.setScene(scene);
        stage.show();

    }

    public static void main(String[] args)
    {
        Application.launch();
    }

    @Override
    public void handle(ActionEvent actionEvent) {

        if (actionEvent.getSource()==button)
        {

        System.out.println("Button Clicked!!\n The of Text Field:"+textFieldFirstName.getText());

            ServiceClass serviceClass = new ServiceClass();
            serviceClass.InsetDB(textFieldFirstName.getText());

        try {
            File selectedFile = fileChooser.showOpenDialog(new Stage());
            FileWriter fileWriter = new FileWriter(selectedFile, true);
            fileWriter.write(textFieldFirstName.getText()+"\n");
            fileWriter.close();
            Desktop.getDesktop().edit(new File("test.txt"));
        } catch (IOException e) {
            e.printStackTrace();
        }
        }

        if (actionEvent.getSource().equals(fileChooserButton))
        {
            System.out.println("File Chooser Button!");
            fileChooser = new FileChooser();
            fileChooser.setTitle("Open Resource File");
            String currentDir = System.getProperty("user.dir") + File.separator;
            File file = new File(currentDir);
            fileChooser.setInitialDirectory(file);
            File selectedFile = fileChooser.showOpenDialog(new Stage());
            if (selectedFile != null) {
                System.out.println(selectedFile);
            }
        }

    }
}


