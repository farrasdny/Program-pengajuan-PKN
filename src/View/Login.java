package View;

import java.io.IOException;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;


public class LoginMahasiswa extends Application{
    // variabel pane login mahasiswa
    private AnchorPane anchor;
    
    public void component() throws IOException {
        // =============================================================================
        //                           DEKLARASI VARIABEL
        // =============================================================================
        
         anchor = new AnchorPane();
         
        // =============================================================================
        //                          CONTROL PANE LOGIN
        // =============================================================================
         anchor.setPrefSize(1100 , 800);
         anchor.setStyle("-fx-background-color: linear-gradient(#C54A4A, #431616);");
    }     
    
    @Override
    public void start(Stage primaryStage) throws Exception {
        component();
        
        Scene scene = new Scene(anchor);
        
        primaryStage.setTitle("Program Pengajuan PKN");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
