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
import javafx.scene.control.TextField;
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

public class ApprovalAdmin{
    
    public AnchorPane anchor;
    private Pane bannerAtas;
    private Pane bannerBawah;
    private Label judulDepan;
    private Label judulDepan2;
    private TextField jumlahAnggotaField;
    private TextField waktuField;
    private TextField tempatField;
    private Button kirimButton;
    private Button suratButton;
    private Button backButton;
    
    public void componentApproval(){
        Stage window = new Stage();
        window.initModality(Modality.APPLICATION_MODAL);
        
        // =============================================================================
        //                           DEKLARASI VARIABEL
        // =============================================================================
        
        anchor = new AnchorPane();
        bannerAtas = new Pane();
        bannerBawah = new Pane();
        judulDepan = new Label("APPROVAL");
        judulDepan2 = new Label("ADMIN");
        jumlahAnggotaField = new TextField();
        waktuField = new TextField();
        tempatField = new TextField();
        kirimButton = new Button("KIRIM KE PERUSAHAAN");
        backButton = new Button("BACK");
        suratButton = new Button("SURAT BALASAN");
        
        // =============================================================================
        //                          CONTROL PANE LOGIN
        // =============================================================================

        
        anchor.setPrefSize(1100 , 800);
        anchor.setStyle("-fx-background-color: linear-gradient(#4C87EB, #242275);");
        anchor.setEffect(null);
        anchor.getChildren().addAll(
                bannerAtas, bannerBawah, judulDepan, judulDepan2, jumlahAnggotaField, waktuField, tempatField,
                kirimButton, suratButton, backButton
        );
        
        bannerAtas.setBackground(new Background(new BackgroundFill(Color.WHITE, CornerRadii.EMPTY,Insets.EMPTY)));
        bannerAtas.setPrefSize(1100, 50);
        
        bannerBawah.setBackground(new Background(new BackgroundFill(Color.WHITE, CornerRadii.EMPTY,Insets.EMPTY)));
        bannerBawah.setPrefSize(1100, 50);
        bannerBawah.setLayoutY(750);
        
        judulDepan.setFont(Font.font("Poppins", FontWeight.LIGHT, 40));
        judulDepan.setTextFill(Color.WHITE);
        judulDepan.setLayoutX(370);
        judulDepan.setLayoutY(400);
        
        judulDepan2.setFont(Font.font("Poppins", FontWeight.BOLD, 40));
        judulDepan2.setTextFill(Color.WHITE);
        judulDepan2.setLayoutX(585);
        judulDepan2.setLayoutY(400);
        
        ImageView image = new ImageView(new Image(getClass().getResourceAsStream("/View/logo2.png")));
        anchor.getChildren().add(image);
        image.setFitHeight(280);
        image.setFitWidth(290);
        image.setLayoutX(400);
        image.setLayoutY(100);
        
        jumlahAnggotaField.setPrefSize(260, 30);
        jumlahAnggotaField.setPromptText("Jumlah anggota yang disetujui");
        jumlahAnggotaField.setFont(Font.font("Poppins", FontWeight.SEMI_BOLD, 14));
        jumlahAnggotaField.setBackground(new Background(new BackgroundFill(Color.WHITE, new CornerRadii(5),Insets.EMPTY)));
        jumlahAnggotaField.setLayoutY(475);
        jumlahAnggotaField.setLayoutX(420);
        
        waktuField.setPrefSize(260, 30);
        waktuField.setPromptText("Waktu yang disetujui");
        waktuField.setFont(Font.font("Poppins", FontWeight.SEMI_BOLD, 14));
        waktuField.setBackground(new Background(new BackgroundFill(Color.WHITE, new CornerRadii(5),Insets.EMPTY)));
        waktuField.setLayoutY(525);
        waktuField.setLayoutX(420);
        
        tempatField.setPrefSize(260, 30);
        tempatField.setPromptText("Tempat yang disetujui");
        tempatField.setFont(Font.font("Poppins", FontWeight.SEMI_BOLD, 14));
        tempatField.setBackground(new Background(new BackgroundFill(Color.WHITE, new CornerRadii(5),Insets.EMPTY)));
        tempatField.setLayoutY(575);
        tempatField.setLayoutX(420);
        
        kirimButton.setPrefSize(260, 30);
        kirimButton.setLayoutX(420);
        kirimButton.setLayoutY(625);
        kirimButton.setBackground(new Background(new BackgroundFill(Color.CORNFLOWERBLUE, new CornerRadii(5),Insets.EMPTY)));
        kirimButton.setFont(Font.font("Poppins", FontWeight.LIGHT, 13));
        kirimButton.setTextFill(Color.WHITE);
        
        suratButton.setPrefSize(122, 30);
        suratButton.setLayoutX(557);
        suratButton.setLayoutY(675);
        suratButton.setBackground(new Background(new BackgroundFill(Color.DARKORANGE, new CornerRadii(5),Insets.EMPTY)));
        suratButton.setFont(Font.font("Poppins", FontWeight.LIGHT, 13));
        suratButton.setTextFill(Color.WHITE);
        
        backButton.setPrefSize(122, 30);
        backButton.setLayoutX(420);
        backButton.setLayoutY(675);
        backButton.setBackground(new Background(new BackgroundFill(Color.ORANGE, new CornerRadii(5),Insets.EMPTY)));
        backButton.setFont(Font.font("Poppins", FontWeight.LIGHT, 13));
        backButton.setTextFill(Color.WHITE);
        
        suratButton.setOnMousePressed((MouseEvent event) -> {
            SuratBalasan suratbalasan = new SuratBalasan();
            suratbalasan.componentSuratBalasan();
        });
        
        backButton.setOnMousePressed((MouseEvent event) -> {
            window.close();
            SebagaiAdmin sebagaiadmin = new SebagaiAdmin();
            sebagaiadmin.componentSebagaiAdmin();
        });
        
        Scene scene = new Scene(anchor);
        Image icon = new Image("/View/logo2.png");
        
        window.getIcons().add(icon);
        window.setTitle("Surat Balasan Perusahaan");
        window.setScene(scene);
        window.show();
    }
}
