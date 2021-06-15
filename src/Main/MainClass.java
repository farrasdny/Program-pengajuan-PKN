package Main;

import View.Login;
import java.io.IOException;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;

/**
 *
 * @author MSI
 */

public class MainClass extends Application {
    
    // import class
    Login login = new Login();
    
    // variabel pane utama
    private AnchorPane anchor;
    private Label judulDepan;
    private Label judulDepan2;
    private ImageView viewLogo;
    private Image logo;
    
    
    public void component() throws IOException{
        
        // =============================================================================
        //                           DEKLARASI VARIABEL
        // =============================================================================
        
         anchor = new AnchorPane();
         judulDepan = new Label("PENGAJUAN PELAKSANAAN PKN");
         judulDepan2 = new Label("( Praktek Kerja Nyata )");
         
         
        // =============================================================================
        //                          CONTROL PANE LOGIN
        // =============================================================================
        
         anchor.setPrefSize(1100 , 800);
         anchor.setStyle("-fx-background-color: linear-gradient(#C54A4A, #431616);");
         anchor.getChildren().addAll(judulDepan, judulDepan2, new ImageView(logo));
         
         judulDepan.setFont(Font.font("Poppins", FontWeight.BOLD, 40));
         judulDepan.setTextFill(Color.WHITE);
         judulDepan.setLayoutX(250);
         judulDepan.setLayoutY(350);
         
         judulDepan2.setFont(Font.font("Poppins", FontWeight.LIGHT, 30));
         judulDepan2.setTextFill(Color.WHITE);
         judulDepan2.setLayoutX(400);
         judulDepan2.setLayoutY(400);
         
         
    }
   
    
    @Override
    public void start(Stage primaryStage) throws IOException {
        component();
        
        Scene scene = new Scene(anchor);
        
        primaryStage.setTitle("Program Pengajuan PKN");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
