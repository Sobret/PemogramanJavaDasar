package chapter17_binary.exercise;
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.control.TextArea;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;
import javafx.scene.layout.BorderPane;
import javafx.geometry.Pos;
import javafx.geometry.Insets;
import java.io.*;
public class exercise11splitfilesGUI extends Application{
    protected TextField tfFileName = new TextField();
    protected TextField tfnumberOfFiles = new TextField();

    @Override
    public void start(Stage primaryStage) {
        Label lblText = new Label();
        lblText.setText("If you split a file named temp.txt into 3 smaller files,\n" +
                        "the three smaller files are temp.txt.1, temp.txt.2, and temp.txt.3.");

        GridPane paneForInfo = new GridPane();
        paneForInfo.setPadding(new Insets(5, 15, 5, 0));
        paneForInfo.setHgap(5);
        paneForInfo.add(new Label("Enter a file:"), 0, 0);
        paneForInfo.add(tfFileName, 1, 0);
        paneForInfo.add(new Label("Specify the number of smaller files:"), 0, 1);
        paneForInfo.add(tfnumberOfFiles, 1, 1);

        Button btStart = new Button("Start");

        BorderPane pane = new BorderPane();
        pane.setTop(lblText);
        pane.setCenter(paneForInfo);
        pane.setBottom(btStart);
        pane.setAlignment(btStart, Pos.CENTER);

        btStart.setOnAction(e -> start());

        Scene scene = new Scene(pane);
        primaryStage.setTitle("Exercise_17_11");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    private void start() {
        int numberOfFiles = Integer.parseInt(tfnumberOfFiles.getText());

        RandomAccessFile[] splits = new RandomAccessFile[numberOfFiles];

        try (
             RandomAccessFile inout =
                     new RandomAccessFile(tfFileName.getText(), "r");
        ) {
            for (int i = 0; i < splits.length; i++) {
                splits[i] = new RandomAccessFile(
                        tfFileName.getText() + "." + (i + 1), "rw");
            }
            int size = Math.round(inout.length() / numberOfFiles);
            int count = 0;
            byte[] b;

            for (int i = 0; i < numberOfFiles - 1; i++) {
                inout.seek(count * size);
                b = new byte[size];
                inout.read(b);
                splits[i].write(b);
                count++;
            }
            inout.seek(count * size);
            b = new byte[(int)inout.length() - (count * size)];
            inout.read(b);
            splits[numberOfFiles - 1].write(b);
        }
        catch (IOException ex) {}
    }
}
