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

public class DaftarUjianMahasiswa extends Application{
    
    // variabel pane daftar ujian mahasiswa
    private AnchorPane anchor;
    private AnchorPane anchor2;
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
        
    public void componentDaftarUjian(){
        //Stage window = new Stage();
        //window.initModality(Modality.APPLICATION_MODAL);

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
        
        // =============================================================================
        //                          CONTROL PANE LOGIN
        // =============================================================================
        
        anchor.setPrefSize(1100 , 800);
        anchor.setStyle("-fx-background-color: linear-gradient(#4C87EB, #242275);");
        anchor.getChildren().addAll(
                bannerAtas, bannerBawah, judulDepan, judulDepan2, info, tableData, buttonUpload
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
        buttonUpload.setBackground(new Background(new BackgroundFill(Color.ORANGE, new CornerRadii(5),Insets.EMPTY)));
        buttonUpload.setFont(Font.font("Poppins", FontWeight.LIGHT, 13));
        buttonUpload.setTextFill(Color.WHITE);

        //Scene scene = new Scene(anchor);
        //window.setScene(scene);
        //window.show();
        
        buttonUpload.setOnMousePressed((MouseEvent event) -> { 
            UploadPersyaratan uploadpersyaratan = new UploadPersyaratan();
            uploadpersyaratan.componentUploadPersyaratan();
            BoxBlur blur2 = new BoxBlur(4, 4, 4);
            anchor.setEffect(blur2);
        });
    }

    public void start(Stage primaryStage) throws IOException {
        componentDaftarUjian();
        Scene scene = new Scene(anchor);

        primaryStage.setTitle("Program Pengajuan PKN");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
