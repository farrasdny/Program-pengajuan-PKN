package View;

import java.io.IOException;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Group;
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
    private Button kirimButton;
    private Button backButton;
    private Label textSelamat;
    
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
        kirimButton = new Button("KIRIM E-MAIL");
        backButton = new Button("BACK");
        textSelamat = new Label("Data telah terkirim, mohon menunggu surat balasan dari perusahaan");
        
        // =============================================================================
        //                          CONTROL PANE LOGIN
        // =============================================================================

        
        anchor.setPrefSize(1100 , 800);
        anchor.setStyle("-fx-background-color: linear-gradient(#4C87EB, #242275);");
        anchor.setEffect(null);
        
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
        
        kirimButton.setPrefSize(260, 30);
        kirimButton.setLayoutX(420);
        kirimButton.setLayoutY(470);
        kirimButton.setBackground(new Background(new BackgroundFill(Color.CORNFLOWERBLUE, new CornerRadii(5),Insets.EMPTY)));
        kirimButton.setFont(Font.font("Poppins", FontWeight.LIGHT, 13));
        kirimButton.setTextFill(Color.WHITE);

        backButton.setPrefSize(260, 30);
        backButton.setLayoutX(420);
        backButton.setLayoutY(519);
        backButton.setBackground(new Background(new BackgroundFill(Color.ORANGE, new CornerRadii(5),Insets.EMPTY)));
        backButton.setFont(Font.font("Poppins", FontWeight.LIGHT, 13));
        backButton.setTextFill(Color.WHITE);
        
        textSelamat.setFont(Font.font("Poppins", FontWeight.LIGHT, 15));
        textSelamat.setTextFill(Color.WHITE);
        textSelamat.setLayoutX(325);
        textSelamat.setLayoutY(720);
        textSelamat.setVisible(false);
        
        
        backButton.setOnMousePressed((MouseEvent event) -> {
            window.close();
            SebagaiAdmin sebagaiadmin = new SebagaiAdmin();
            sebagaiadmin.componentSebagaiAdmin();
        });
        
        kirimButton.setOnMousePressed((MouseEvent event) -> {
            KirimEmail kirim = new KirimEmail();
            kirim.componentKirimEmail();
        });
        
        // set background add image
        Image image2 = new Image("/View/umm_background2.png");
        ImageView mv = new ImageView(image2);
        
        Group root = new Group();
        root.getChildren().addAll(mv, bannerAtas, bannerBawah, judulDepan, judulDepan2,
                kirimButton, backButton, textSelamat);
        
        // slot image
        ImageView image = new ImageView(new Image(getClass().getResourceAsStream("/View/logo2.png")));
        root.getChildren().add(image);
        image.setFitHeight(280);
        image.setFitWidth(290);
        image.setLayoutX(400);
        image.setLayoutY(100);
        
        Scene scene = new Scene(root, 1100, 800);
        Image icon = new Image("/View/logo2.png");
        
        window.getIcons().add(icon);
        window.setTitle("Surat Balasan Perusahaan");
        window.setScene(scene);
        window.show();
    }
}
