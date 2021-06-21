package View;

import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.effect.BoxBlur;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.CornerRadii;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.stage.Modality;
import javafx.stage.Stage;

public class UploadPersyaratan {
    
    private AnchorPane anchor;
    private Button buttonUpload;
    private Button backButton;
    private Button buttonNilai;
    private Button buttonLaporan;
    private ListView list;
    
    public void componentUploadPersyaratan(){
        Stage window = new Stage();
        window.initModality(Modality.APPLICATION_MODAL);
        
        // =============================================================================
        //                           DEKLARASI VARIABEL
        // =============================================================================
        
        anchor = new AnchorPane();
        buttonUpload = new Button("UPLOAD");
        backButton = new Button("BACK");
        list = new ListView();
        buttonNilai = new Button("upload nilai");
        buttonLaporan = new Button("upload laporan");
        
        // =============================================================================
        //                          CONTROL PANE LOGIN
        // =============================================================================
        
        anchor.setPrefSize(500 , 300);
        anchor.setStyle("-fx-background-color: #FFFFFF;");
        anchor.getChildren().addAll(
                buttonUpload, backButton, list, buttonNilai, buttonLaporan
        );
        
        buttonUpload.setPrefSize(150, 32);
        buttonUpload.setLayoutX(330);
        buttonUpload.setLayoutY(250);
        buttonUpload.setBackground(new Background(new BackgroundFill(Color.CORNFLOWERBLUE, new CornerRadii(5),Insets.EMPTY)));
        buttonUpload.setFont(Font.font("Poppins", FontWeight.LIGHT, 13));
        buttonUpload.setTextFill(Color.WHITE);
        
        backButton.setPrefSize(150, 32);
        backButton.setLayoutX(160);
        backButton.setLayoutY(250);
        backButton.setBackground(new Background(new BackgroundFill(Color.DARKORANGE, new CornerRadii(5),Insets.EMPTY)));
        backButton.setFont(Font.font("Poppins", FontWeight.LIGHT, 13));
        backButton.setTextFill(Color.WHITE);
        
        buttonNilai.setPrefSize(120, 30);
        buttonNilai.setLayoutX(18);
        buttonNilai.setLayoutY(15);
        buttonNilai.setFont(Font.font("Poppins", FontWeight.LIGHT, 13));
        buttonNilai.setTextFill(Color.GRAY);
        
        buttonLaporan.setPrefSize(120, 30);
        buttonLaporan.setLayoutX(18);
        buttonLaporan.setLayoutY(62);
        buttonLaporan.setFont(Font.font("Poppins", FontWeight.LIGHT, 13));
        buttonLaporan.setTextFill(Color.GRAY);
        
        list.setPrefSize(320, 220);
        list.setLayoutX(158);
        list.setLayoutY(14);
        
        Scene scene = new Scene(anchor);
        window.setTitle("Upload File Persyaratan");
        window.setScene(scene);
        window.show();
        
        backButton.setOnMousePressed((MouseEvent event) -> {
            DaftarUjianMahasiswa daftarujian = new DaftarUjianMahasiswa();
            daftarujian.anchorMethod();
            window.close();
        });
    }
}
