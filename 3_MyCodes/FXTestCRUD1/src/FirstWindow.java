/**
 * Created by User PC on 11/1/16.
 */
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.stage.Stage;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Text;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.FontPosture;

import java.util.Scanner;

import java.util.List;


public class FirstWindow extends Application {
    GridPane gridPane = new GridPane();

    private Text text1 = new Text("Hi there!");
    private Label insertLabel = new Label("Enter Name or Id:");
    private TextField nameTextFiled = new TextField();
    private Button insertButton= new Button("Insert");
    private Button readButton= new Button("View");
    private Button updateButton= new Button("Update");
    private Button deleteButton= new Button("Delete");

    private TableView<Student> table = new TableView<Student>();

   // private TableView table = new TableView();
    private final Label label = new Label("Student List");


    @Override // Override the start method in the Application class
    public void start(Stage primaryStage) {
        // Create a scene and place a button in the scene

        gridPane.setHgap(5);
        gridPane.setVgap(5);

        text1.setFont(Font.font("Courier", FontWeight.BOLD, FontPosture.ITALIC, 15));




        gridPane.add(text1, 5,5);
        gridPane.add(insertLabel,5,7);
        gridPane.add(nameTextFiled, 6,7);
        gridPane.add(insertButton, 7, 7);
        gridPane.add(readButton, 8, 7);
        gridPane.add(updateButton, 9, 7);
        gridPane.add(deleteButton, 10, 7);





        insertButton.setOnAction(e -> insertDB());
        readButton.setOnAction(e -> readDB());
        updateButton.setOnAction(e -> updateDB());
        deleteButton.setOnAction(e -> deleteDB());

        Scene scene = new Scene(gridPane, 550, 250);
        primaryStage.setTitle("This the First Window"); // Set the stage title
        primaryStage.setScene(scene); // Place the scene in the stage
        primaryStage.show(); // Display the stage
    }

    public void insertDB()
    {
       // System.out.print("You Have Entered:"+nameTextFiled.getText());


        ServiceClass serviceClass = new ServiceClass();
        serviceClass.InsetDB(nameTextFiled.getText());

        List<Student> students = serviceClass.ReadFromDB();

        if (students!=null){
            for(int i=0; i<students.size(); i++){
                Student std = students.get(i);
                System.out.println(std.getId()+" "+std.getName());
            }
        }

    }

    public void readDB()
    {
        ServiceClass serviceClass = new ServiceClass();

        List<Student> students = serviceClass.ReadFromDB();

        if (students!=null){
            for(int i=0; i<students.size(); i++){
                Student std = students.get(i);
                System.out.println(std.getId()+" "+std.getName());
            }
        }
    }

    public void updateDB()
    {

        Scanner scanner = new Scanner(System.in);
        System.out.println("I Which to be Added your new name "+nameTextFiled.getText());
        int id = scanner.nextInt();

        ServiceClass serviceClass = new ServiceClass();
        serviceClass.UpdateStudent(id, nameTextFiled.getText());

        List<Student> students = serviceClass.ReadFromDB();

        if (students!=null){
            for(int i=0; i<students.size(); i++){
                Student std = students.get(i);
                System.out.println(std.getId()+" "+std.getName());
            }
        }
    }

    public void deleteDB()
    {

        ServiceClass serviceClass = new ServiceClass();
        serviceClass.deleteStudent(Integer.parseInt(nameTextFiled.getText()));

        List<Student> students = serviceClass.ReadFromDB();

        if (students!=null){
            for(int i=0; i<students.size(); i++){
                Student std = students.get(i);
                System.out.println(std.getId()+" "+std.getName());
            }
        }
    }

    public static void main(String[] args) {
        launch(args);
    }
}
