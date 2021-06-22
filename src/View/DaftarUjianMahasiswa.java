package View;

import java.io.IOException;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import static javafx.scene.control.TableView.CONSTRAINED_RESIZE_POLICY;
import javafx.scene.effect.BoxBlur;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.CornerRadii;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.stage.Modality;
import javafx.stage.Stage;

public class DaftarUjianMahasiswa{
    
    // variabel pane daftar ujian mahasiswa
    public AnchorPane anchor;
    public BoxBlur blur;
    private Pane bannerAtas;
    private Pane bannerBawah;
    private Label judulDepan;
    private Label judulDepan2;
    private Label info;
    private TableView tableData;
    private TableColumn namaColumn;
    private TableColumn nimColumn;
    private TableColumn jurusanColumn;
    private Button buttonUpload;
    public Button daftarButton;
    private Button backButton;
        
    public void componentDaftarUjian(){
        Stage window = new Stage();
        window.initModality(Modality.APPLICATION_MODAL);

        // =============================================================================
        //                           DEKLARASI VARIABEL
        // =============================================================================
        
        anchor = new AnchorPane();
        bannerAtas = new Pane();
        bannerBawah = new Pane();
        judulDepan = new Label("PENDAFTARAN");
        judulDepan2 = new Label("UJIAN");
        info = new Label("data anda adalah :");
        tableData = new TableView();
        namaColumn = new TableColumn("Nama");
        nimColumn = new TableColumn("NIM");
        jurusanColumn = new TableColumn("Jurusan");
        buttonUpload = new Button("UPLOAD PERSYARATAN");
        daftarButton = new Button("DAFTAR UJIAN");
        backButton = new Button("BACK");
        
        // =============================================================================
        //                          CONTROL PANE LOGIN
        // =============================================================================

        
        anchor.setPrefSize(1100 , 800);
        anchor.setStyle("-fx-background-color: linear-gradient(#4C87EB, #242275);");
        anchor.setEffect(null);
        anchor.getChildren().addAll(
                bannerAtas, bannerBawah, judulDepan, judulDepan2, info, tableData, buttonUpload, daftarButton, backButton
        );
        
        bannerAtas.setBackground(new Background(new BackgroundFill(Color.WHITE, CornerRadii.EMPTY,Insets.EMPTY)));
        bannerAtas.setPrefSize(1100, 50);
        
        bannerBawah.setBackground(new Background(new BackgroundFill(Color.WHITE, CornerRadii.EMPTY,Insets.EMPTY)));
        bannerBawah.setPrefSize(1100, 50);
        bannerBawah.setLayoutY(750);
        
        judulDepan.setFont(Font.font("Poppins", FontWeight.LIGHT, 40));
        judulDepan.setTextFill(Color.WHITE);
        judulDepan.setLayoutX(340);
        judulDepan.setLayoutY(390);
         
        judulDepan2.setFont(Font.font("Poppins", FontWeight.BOLD, 40));
        judulDepan2.setTextFill(Color.WHITE);
        judulDepan2.setLayoutX(625);
        judulDepan2.setLayoutY(390);
        
        info.setFont(Font.font("Poppins", FontWeight.LIGHT, 22));
        info.setTextFill(Color.WHITE);
        info.setLayoutX(462);
        info.setLayoutY(470);
        
        ImageView image = new ImageView(new Image(getClass().getResourceAsStream("/View/logo2.png")));
        anchor.getChildren().add(image);
        image.setFitHeight(280);
        image.setFitWidth(290);
        image.setLayoutX(400);
        image.setLayoutY(100);
        
        tableData.getColumns().addAll(namaColumn, nimColumn, jurusanColumn);
        tableData.setColumnResizePolicy(CONSTRAINED_RESIZE_POLICY);
        tableData.setPrefSize(500, 50);
        tableData.setLayoutX(295);
        tableData.setLayoutY(512);
        
        buttonUpload.setPrefSize(220, 35);
        buttonUpload.setLayoutX(437);
        buttonUpload.setLayoutY(580);
        buttonUpload.setBackground(new Background(new BackgroundFill(Color.CORNFLOWERBLUE, new CornerRadii(5),Insets.EMPTY)));
        buttonUpload.setFont(Font.font("Poppins", FontWeight.LIGHT, 13));
        buttonUpload.setTextFill(Color.WHITE);
        
        daftarButton.setPrefSize(220, 35);
        daftarButton.setLayoutX(437);
        daftarButton.setLayoutY(630);
        daftarButton.setBackground(new Background(new BackgroundFill(Color.CORNFLOWERBLUE, new CornerRadii(5),Insets.EMPTY)));
        daftarButton.setFont(Font.font("Poppins", FontWeight.LIGHT, 13));
        daftarButton.setTextFill(Color.WHITE);
        daftarButton.setVisible(false);
        
        backButton.setPrefSize(220, 35);
        backButton.setLayoutX(437);
        backButton.setLayoutY(680);
        backButton.setBackground(new Background(new BackgroundFill(Color.ORANGE, new CornerRadii(5),Insets.EMPTY)));
        backButton.setFont(Font.font("Poppins", FontWeight.LIGHT, 13));
        backButton.setTextFill(Color.WHITE);

        // =============================================================================
        //                                  OPERATION
        // =============================================================================
        
        buttonUpload.setOnMousePressed((MouseEvent event) -> { 
            UploadPersyaratan uploadpersyaratan = new UploadPersyaratan();
            uploadpersyaratan.componentUploadPersyaratan();
            daftarButton.setVisible(true);
        }); 
        
        backButton.setOnMousePressed((MouseEvent event) -> { 
            SebagaiMahasiswa mahasiswa = new SebagaiMahasiswa();
            mahasiswa.componentSebagaiMahasiswa();
        }); 
        
        Scene scene = new Scene(anchor);
        Image icon = new Image("/View/logo2.png");
        
        window.getIcons().add(icon);
        window.setTitle("Program Pengajuan PKN");
        window.setScene(scene);
        window.show();
    }
}
