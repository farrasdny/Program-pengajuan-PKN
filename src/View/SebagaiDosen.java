package View;

import java.io.IOException;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import static javafx.scene.control.TableView.CONSTRAINED_RESIZE_POLICY;
import javafx.scene.control.TextField;
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
import javafx.stage.Modality;
import javafx.stage.Stage;

public class SebagaiDosen{
    
    // variabel pane sebagai dosen
    private AnchorPane anchor;
    private Pane bannerAtas;
    private Pane bannerBawah;
    private Label judulDepan;
    private Label judulDepan2;
    private Button simpanButton;
    private Button backButton;
    private TableView table;
    private TableColumn jumlahMahasiswaColumn;
    private TableColumn waktuColumn;
    private TableColumn ruanganColumn;
    private TextField jumlahMahasiswaField;
    private TextField waktuField;
    private TextField ruanganField;
    
    public void componentSebagaiDosen(){
        Stage window = new Stage();
        window.initModality(Modality.APPLICATION_MODAL);
        
        // =============================================================================
        //                           DEKLARASI VARIABEL
        // =============================================================================
        
        anchor = new AnchorPane();
        bannerAtas = new Pane();
        bannerBawah = new Pane();
        judulDepan = new Label("MASUKKAN");
        judulDepan2 = new Label("JADWAL");
        simpanButton = new Button("SIMPAN JADWAL");
        backButton = new Button("BACK");
        table = new TableView();
        jumlahMahasiswaColumn = new TableColumn("Jumlah mahasiswa");
        waktuColumn = new TableColumn("Waktu pelaksanaan");
        ruanganColumn = new TableColumn("Ruangan");
        jumlahMahasiswaField = new TextField();
        waktuField = new TextField();
        ruanganField = new TextField();
         
        // =============================================================================
        //                          CONTROL PANE LOGIN DOSEN
        // =============================================================================
        
        anchor.setPrefSize(1100 , 800);
        anchor.setStyle("-fx-background-color: linear-gradient(#4C87EB, #242275);");
        anchor.getChildren().addAll(
                bannerAtas, bannerBawah, judulDepan, judulDepan2, simpanButton, backButton, table,
                jumlahMahasiswaField, waktuField, ruanganField
        );
        
        bannerAtas.setBackground(new Background(new BackgroundFill(Color.WHITE, CornerRadii.EMPTY,Insets.EMPTY)));
        bannerAtas.setPrefSize(1100, 50);
        
        bannerBawah.setBackground(new Background(new BackgroundFill(Color.WHITE, CornerRadii.EMPTY,Insets.EMPTY)));
        bannerBawah.setPrefSize(1100, 50);
        bannerBawah.setLayoutY(750);
        
        judulDepan.setFont(Font.font("Poppins", FontWeight.LIGHT, 40));
        judulDepan.setTextFill(Color.WHITE);
        judulDepan.setLayoutX(350);
        judulDepan.setLayoutY(65);
         
        judulDepan2.setFont(Font.font("Poppins", FontWeight.BOLD, 40));
        judulDepan2.setTextFill(Color.WHITE);
        judulDepan2.setLayoutX(580);
        judulDepan2.setLayoutY(65);
        
        simpanButton.setPrefSize(300, 35);
        simpanButton.setLayoutY(315);
        simpanButton.setLayoutX(755);
        simpanButton.setBackground(new Background(new BackgroundFill(Color.ORANGE, new CornerRadii(5),Insets.EMPTY)));
        simpanButton.setFont(Font.font("Poppins", FontWeight.BOLD, 13));
        simpanButton.setTextFill(Color.WHITE);
        
        backButton.setPrefSize(300, 35);
        backButton.setLayoutY(370);
        backButton.setLayoutX(755);
        backButton.setBackground(new Background(new BackgroundFill(Color.CORNFLOWERBLUE, new CornerRadii(5),Insets.EMPTY)));
        backButton.setFont(Font.font("Poppins", FontWeight.BOLD, 13));
        backButton.setTextFill(Color.WHITE);

        table.getColumns().addAll(jumlahMahasiswaColumn, waktuColumn, ruanganColumn);
        table.setColumnResizePolicy(CONSTRAINED_RESIZE_POLICY);
        table.setPrefSize(650, 550);
        table.setLayoutX(50);
        table.setLayoutY(152);
        
        jumlahMahasiswaField.setPrefSize(300, 32);
        jumlahMahasiswaField.setLayoutX(755);
        jumlahMahasiswaField.setLayoutY(152);
        jumlahMahasiswaField.setPromptText("Jumlah mahasiswa");
        jumlahMahasiswaField.setFont(Font.font("Poppins", FontWeight.SEMI_BOLD, 14));
        jumlahMahasiswaField.setBackground(new Background(new BackgroundFill(Color.WHITE, new CornerRadii(5),Insets.EMPTY)));
        
        waktuField.setPrefSize(300, 32);
        waktuField.setLayoutX(755);
        waktuField.setLayoutY(205);
        waktuField.setPromptText("Waktu");
        waktuField.setFont(Font.font("Poppins", FontWeight.SEMI_BOLD, 14));
        waktuField.setBackground(new Background(new BackgroundFill(Color.WHITE, new CornerRadii(5),Insets.EMPTY)));
        
        ruanganField.setPrefSize(300, 32);
        ruanganField.setLayoutX(755);
        ruanganField.setLayoutY(260);
        ruanganField.setPromptText("Ruangan");
        ruanganField.setFont(Font.font("Poppins", FontWeight.SEMI_BOLD, 14));
        ruanganField.setBackground(new Background(new BackgroundFill(Color.WHITE, new CornerRadii(5),Insets.EMPTY)));
        
        // =============================================================================
        //                                  OPERATION
        // =============================================================================
        
        Scene scene = new Scene(anchor);
        Image icon = new Image("/View/logo2.png");
        
        window.getIcons().add(icon);
        window.setTitle("Program Pengajuan PKN");
        window.setScene(scene);
        window.show();
        
        backButton.setOnMousePressed((MouseEvent event) -> {
            window.close();
            LoginDosen logindosen = new LoginDosen();
            logindosen.componentDosen();
        });
    }
}
