package View;

import View.LoginMahasiswa;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
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
import javafx.stage.StageStyle;

/**
 *
 * @author MSI
 */

public class MainClass extends Application {
    
    // variabel pane utama
    private AnchorPane anchor;
    private Label judulDepan;
    private Label judulDepan2;
    private Label info;
    private ComboBox<String> cbox;
    private Pane bannerAtas;
    private Pane bannerBawah;
    private Button buttonPilih;

    public void componentAwal(){
        
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
        //                          CONTROL PANE UTAMA
        // =============================================================================

         anchor.setPrefSize(1100 , 800);
         anchor.setStyle("-fx-background-color: linear-gradient(#4C87EB, #242275);");
         anchor.getChildren().addAll();
         
         judulDepan.setFont(Font.font("Poppins", FontWeight.BOLD, 40));
         judulDepan.setTextFill(Color.WHITE);
         judulDepan.setLayoutX(230);
         judulDepan.setLayoutY(390);
         
         judulDepan2.setFont(Font.font("Poppins", FontWeight.LIGHT, 30));
         judulDepan2.setTextFill(Color.WHITE);
         judulDepan2.setLayoutX(400);
         judulDepan2.setLayoutY(440);
         
         cbox.setPromptText("Select");
         cbox.getItems().addAll("Mahasiswa", "Dosen", "Admin");
         cbox.setPrefSize(220, 30);
         cbox.setLayoutX(437);
         cbox.setLayoutY(600);
         cbox.setBackground(new Background(new BackgroundFill(Color.ALICEBLUE, new CornerRadii(5),Insets.EMPTY)));

         // --> Azzahry Dwi Pramudio

         // slot info
         info.setFont(Font.font("Poppins", FontWeight.EXTRA_LIGHT, 20));
         info.setTextFill(Color.WHITE);
         info.setLayoutX(480);
         info.setLayoutY(560);
         
         // slot banner atas
         bannerAtas.setBackground(new Background(new BackgroundFill(Color.WHITE, CornerRadii.EMPTY,Insets.EMPTY)));
         bannerAtas.setPrefSize(1100, 50);
         
         // slot banner bawah
         bannerBawah.setBackground(new Background(new BackgroundFill(Color.WHITE, CornerRadii.EMPTY,Insets.EMPTY)));
         bannerBawah.setPrefSize(1100, 50);
         bannerBawah.setLayoutY(750);
         
         // slot button
         buttonPilih.setPrefSize(220, 30);
         buttonPilih.setLayoutX(437);
         buttonPilih.setLayoutY(643);
         buttonPilih.setBackground(new Background(new BackgroundFill(Color.CORNFLOWERBLUE, new CornerRadii(5),Insets.EMPTY)));
         buttonPilih.setFont(Font.font("Poppins", FontWeight.LIGHT, 13));
         buttonPilih.setTextFill(Color.WHITE);
    }
    
    public void slideLoginMahasiswa(){
        LoginMahasiswa loginmahasiswa = new LoginMahasiswa();
        loginmahasiswa.componentMahasiswa();
    }
    
    public void slideLoginDosen(){
        LoginDosen logindosen = new LoginDosen();
        logindosen.componentDosen();
    }
    
    public void slideLoginAdmin(){
        LoginAdmin loginadmin = new LoginAdmin();
        loginadmin.componentAdmin();
    }
    
    public void accFromOtherClass(){
        componentAwal();
        Stage window = new Stage();
        
        // set background add image
        Image image2 = new Image("/View/umm_background2.png");
        ImageView mv = new ImageView(image2);
        
        Group root = new Group();
        root.getChildren().addAll(mv, judulDepan, judulDepan2, cbox, info, bannerAtas, bannerBawah, buttonPilih);
        
        // slot image
        ImageView image = new ImageView(new Image(getClass().getResourceAsStream("/View/logo2.png")));
        root.getChildren().add(image);
        image.setFitHeight(280);
        image.setFitWidth(290);
        image.setLayoutX(400);
        image.setLayoutY(100);
        
        Scene scene = new Scene(root);
        
        buttonPilih.setOnMousePressed((MouseEvent event) -> { 
            // combo box 
            switch(cbox.getValue()){
                case "Mahasiswa":
                    DaftarUjianMahasiswa daftar = new DaftarUjianMahasiswa();
         
                    if(daftar.tableData != null){
                        SebagaiMahasiswa a = new SebagaiMahasiswa();
                        a.componentSebagaiMahasiswa();
                    }
                    else if(daftar.tableData == null){
                        slideLoginMahasiswa(); 
                    }
                    
                    window.close();
                    break;
                case "Dosen":
                    slideLoginDosen();
                    window.close();
                    break;
                case "Admin":
                    slideLoginAdmin();
                    window.close();
                    break;
                default:
                    break;
            } 
        });
        Image icon = new Image("/View/logo2.png");
        
        window.getIcons().add(icon);        
        window.setTitle("Program Pengajuan PKN");
        window.setScene(scene);
        window.show();
    }
    
    @Override
    public void start(Stage primaryStage) throws IOException {
        componentAwal();
        
        // set background add image
        Image image2 = new Image("/View/umm_background2.png");
        ImageView mv = new ImageView(image2);
        
        Group root = new Group();
        root.getChildren().addAll(mv, judulDepan, judulDepan2, cbox, info, bannerAtas, bannerBawah, buttonPilih);
        
        // slot image
        ImageView image = new ImageView(new Image(getClass().getResourceAsStream("/View/logo2.png")));
        root.getChildren().add(image);
        image.setFitHeight(280);
        image.setFitWidth(290);
        image.setLayoutX(400);
        image.setLayoutY(100);
        
        Scene scene = new Scene(root, 1100, 800);
        
        buttonPilih.setOnMousePressed((MouseEvent event) -> { 
            // combo box 
            switch(cbox.getValue()){
                case "Mahasiswa":
                    DaftarUjianMahasiswa daftar = new DaftarUjianMahasiswa();
         
                    if(daftar.tableData != null){
                        SebagaiMahasiswa a = new SebagaiMahasiswa();
                        a.componentSebagaiMahasiswa();
                    }
                    else if(daftar.tableData == null){
                        slideLoginMahasiswa(); 
                    }
                    
                    primaryStage.close();
                    break;
                case "Dosen":
                    slideLoginDosen();
                    primaryStage.close();
                    break;
                case "Admin":
                    slideLoginAdmin();
                    primaryStage.close();
                    break;
                default:
                    break;             
            } 
        });
        Image icon = new Image("/View/logo2.png");
        
        primaryStage.getIcons().add(icon);
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
