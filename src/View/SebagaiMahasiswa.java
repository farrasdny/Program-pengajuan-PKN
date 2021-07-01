package View;

import java.io.IOException;
import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
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

public class SebagaiMahasiswa{
    
    // variabel pane sebagai mahasiswa
    private AnchorPane anchor;
    private Pane bannerAtas;
    private Pane bannerBawah;
    private Label judulDepan;
    private Label judulDepan2;
    private Button daftarUjianButton;
    private Button ajuProposalButton;
    private Button backButton;
    private TextField cv;
    
    public void componentSebagaiMahasiswa(){
        Stage window = new Stage();
        window.initModality(Modality.APPLICATION_MODAL);
        
        // =============================================================================
        //                           DEKLARASI VARIABEL
        // =============================================================================
        
        anchor = new AnchorPane();
        bannerAtas = new Pane();
        bannerBawah = new Pane();
        judulDepan = new Label("SEBAGAI");
        judulDepan2 = new Label("MAHASISWA");
        daftarUjianButton = new Button("DAFTAR UJIAN");
        ajuProposalButton = new Button("AJU PROPOSAL");
        backButton = new Button("BACK");
        
        // =============================================================================
        //                          CONTROL PANE LOGIN
        // =============================================================================
        
        anchor.setPrefSize(1100 , 800);
        anchor.setStyle("-fx-background-color: linear-gradient(#4C87EB, #242275);");
        
        
        bannerAtas.setBackground(new Background(new BackgroundFill(Color.WHITE, CornerRadii.EMPTY,Insets.EMPTY)));
        bannerAtas.setPrefSize(1100, 50);
        
        bannerBawah.setBackground(new Background(new BackgroundFill(Color.WHITE, CornerRadii.EMPTY,Insets.EMPTY)));
        bannerBawah.setPrefSize(1100, 50);
        bannerBawah.setLayoutY(750);
        
        judulDepan.setFont(Font.font("Poppins", FontWeight.LIGHT, 40));
        judulDepan.setTextFill(Color.WHITE);
        judulDepan.setLayoutX(335);
        judulDepan.setLayoutY(410);
         
        judulDepan2.setFont(Font.font("Poppins", FontWeight.BOLD, 40));
        judulDepan2.setTextFill(Color.WHITE);
        judulDepan2.setLayoutX(505);
        judulDepan2.setLayoutY(410);
        
        daftarUjianButton.setPrefSize(220, 33);
        daftarUjianButton.setLayoutY(490);
        daftarUjianButton.setLayoutX(437);
        daftarUjianButton.setBackground(new Background(new BackgroundFill(Color.ORANGE, new CornerRadii(5),Insets.EMPTY)));
        daftarUjianButton.setFont(Font.font("Poppins", FontWeight.BOLD, 13));
        daftarUjianButton.setTextFill(Color.WHITE);
        
        ajuProposalButton.setPrefSize(220, 33);
        ajuProposalButton.setLayoutY(540);
        ajuProposalButton.setLayoutX(437);
        ajuProposalButton.setBackground(new Background(new BackgroundFill(Color.ORANGE, new CornerRadii(5),Insets.EMPTY)));
        ajuProposalButton.setFont(Font.font("Poppins", FontWeight.BOLD, 13));
        ajuProposalButton.setTextFill(Color.WHITE);
        
        backButton.setPrefSize(220, 33);
        backButton.setLayoutY(590);
        backButton.setLayoutX(437);
        backButton.setBackground(new Background(new BackgroundFill(Color.CORNFLOWERBLUE, new CornerRadii(5),Insets.EMPTY)));
        backButton.setFont(Font.font("Poppins", FontWeight.BOLD, 13));
        backButton.setTextFill(Color.WHITE);
        
        // =============================================================================
        //                                  OPERATION
        // =============================================================================
        

        backButton.setOnMousePressed((MouseEvent event) -> {
            window.close();
            LoginMahasiswa loginmahasiswa = new LoginMahasiswa();
            loginmahasiswa.componentMahasiswa();
        });
        
        daftarUjianButton.setOnMousePressed((MouseEvent event) -> {
            window.close();
            DaftarUjianMahasiswa daftarujian = new DaftarUjianMahasiswa();
            daftarujian.componentDaftarUjian();
        });
        
        ajuProposalButton.setOnMousePressed((MouseEvent event) ->{
            window.close();
            AjuProposalMahasiswa ajuproposal = new AjuProposalMahasiswa();
            ajuproposal.proposalMahasiswa();
        });
        
        // set background add image
        Image image2 = new Image("/View/umm_background2.png");
        ImageView mv = new ImageView(image2);

        Group root = new Group();
        root.getChildren().addAll(mv, bannerAtas, bannerBawah, judulDepan, judulDepan2, daftarUjianButton, ajuProposalButton, backButton);

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
        window.setTitle("Program Pengajuan PKN");
        window.setScene(scene);
        window.show();
    }
}
