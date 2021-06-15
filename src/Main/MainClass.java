package Main;

import View.LoginMahasiswa;
import java.io.IOException;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.CornerRadii;
import javafx.scene.layout.Pane;
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
    LoginMahasiswa login = new LoginMahasiswa();
    
    // variabel pane utama
    private AnchorPane anchor;
    private Label judulDepan;
    private Label judulDepan2;
    private Label info;
    private ComboBox<String> cbox;
    private Pane bannerAtas;
    private Pane bannerBawah;
    private Button buttonPilih;
    
    public void component() throws IOException{
        
        // =============================================================================
        //                           DEKLARASI VARIABEL
        // =============================================================================
        
         anchor = new AnchorPane();
         judulDepan = new Label("PENGAJUAN PELAKSANAAN PKN");
         judulDepan2 = new Label("( Praktek Kerja Nyata )");
         info = new Label("Login sebagai");
         cbox = new ComboBox<>();
         info = new Label("Login sebagai :");
         bannerAtas = new Pane();
         bannerBawah = new Pane();
         buttonPilih = new Button("PILIH");
     
        // =============================================================================
        //                          CONTROL PANE LOGIN
        // =============================================================================
           
         anchor.setPrefSize(1100 , 800);
         anchor.setStyle("-fx-background-color: linear-gradient(#C54A4A, #431616);");
         anchor.getChildren().addAll(judulDepan, judulDepan2, cbox, info, bannerAtas, bannerBawah, buttonPilih);
         
         judulDepan.setFont(Font.font("Poppins", FontWeight.BOLD, 40));
         judulDepan.setTextFill(Color.WHITE);
         judulDepan.setLayoutX(250);
         judulDepan.setLayoutY(350);
         
         judulDepan2.setFont(Font.font("Poppins", FontWeight.LIGHT, 30));
         judulDepan2.setTextFill(Color.WHITE);
         judulDepan2.setLayoutX(400);
         judulDepan2.setLayoutY(400);
         
         cbox.setPromptText("pilih opsi");
         cbox.getItems().addAll("Mahasiswa", "Dosen", "Admin");
         cbox.setPrefSize(220, 30);
         cbox.setLayoutX(430);
         cbox.setLayoutY(600);
         cbox.setBackground(new Background(new BackgroundFill(Color.ALICEBLUE, new CornerRadii(5),Insets.EMPTY)));
         
         // --> Azzahry Dwi Pramudio
                
         // slot image
         ImageView image = new ImageView(new Image(getClass().getResourceAsStream("/View/logo.png")));
         anchor.getChildren().add(image);
         image.setFitHeight(150);
         image.setFitWidth(450);
         image.setLayoutX(325);
         image.setLayoutY(160);
         
         // slot info
         info.setFont(Font.font("Poppins", FontWeight.EXTRA_LIGHT, 20));
         info.setTextFill(Color.WHITE);
         info.setLayoutX(468);
         info.setLayoutY(560);
         
         // slot banner atas
         bannerAtas.setBackground(new Background(new BackgroundFill(Color.WHITE, CornerRadii.EMPTY,Insets.EMPTY)));
         bannerAtas.setPrefSize(1100, 50);
        
         // slot banner bawah
         bannerBawah.setBackground(new Background(new BackgroundFill(Color.WHITE, CornerRadii.EMPTY,Insets.EMPTY)));
         bannerBawah.setPrefSize(1100, 50);
         bannerBawah.setLayoutY(750);
        
         // slot button
         buttonPilih.setPrefSize(110, 30);
         buttonPilih.setLayoutX(485);
         buttonPilih.setLayoutY(643);
         buttonPilih.setBackground(new Background(new BackgroundFill(Color.CORNFLOWERBLUE, new CornerRadii(5),Insets.EMPTY)));
         buttonPilih.setFont(Font.font("Poppins", FontWeight.BOLD, 14));
         buttonPilih.setTextFill(Color.WHITE);
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
