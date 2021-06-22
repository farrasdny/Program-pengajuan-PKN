
package View;

import java.io.File;
import java.io.IOException;
import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
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
import javafx.stage.FileChooser;
import javafx.stage.FileChooser.ExtensionFilter;
import javafx.stage.Modality;
import javafx.stage.Stage;

public class AjuProposalMahasiswa{
    
    private AnchorPane anchor;
    private Pane bannerAtas;
    private Pane bannerBawah;
    private Label judulDepan;
    private Label judulDepan2;
    private Label judulDepan3;
    private Label judulDepan4;
    private Label judulDepan5;
    private Label judulDepan6;
    private TextField tempatField;
    private TextField waktuField;
    private Button cvButton;
    private Button proposalButton;
    private Button simpanButton;
    private Button backButton;
    private ListView list;
    
    public void proposalMahasiswa(){
        Stage window = new Stage();
        window.initModality(Modality.APPLICATION_MODAL);
        
        // =============================================================================
        //                           DEKLARASI VARIABEL
        // =============================================================================
        
        anchor = new AnchorPane();
        bannerAtas = new Pane();
        bannerBawah = new Pane();
        judulDepan = new Label(" PENGAJUAN");
        judulDepan2 = new Label(" PROPOSAL");
        judulDepan3 = new Label(" Tempat Pelaksanaan PKN");
        judulDepan4 = new Label(" Waktu Pelaksanaan PKN");
        judulDepan5= new Label(" CV");
        judulDepan6 = new Label(" Portofolio");
        tempatField = new TextField();
        waktuField = new TextField();
        cvButton = new Button("upload cv");
        proposalButton = new Button("upload proposal");
        simpanButton = new Button("SAVE");
        backButton = new Button("BACK");
        list = new ListView();
        
        // =============================================================================
        //                          CONTROL PANE LOGIN
        // =============================================================================
        
        anchor.setPrefSize(1100 , 800);
        anchor.setStyle("-fx-background-color: linear-gradient(#4C87EB, #242275);");
        anchor.getChildren().addAll(
                bannerAtas, bannerBawah, judulDepan, judulDepan2, judulDepan3, judulDepan4, judulDepan5, judulDepan6, tempatField, waktuField,cvButton, proposalButton,  simpanButton, backButton, list
        );
        
        bannerAtas.setBackground(new Background(new BackgroundFill(Color.WHITE, CornerRadii.EMPTY,Insets.EMPTY)));
        bannerAtas.setPrefSize(1100, 50);
        
        bannerBawah.setBackground(new Background(new BackgroundFill(Color.WHITE, CornerRadii.EMPTY,Insets.EMPTY)));
        bannerBawah.setPrefSize(1100, 50);
        bannerBawah.setLayoutY(750);
        
        judulDepan.setFont(Font.font("Poppins", FontWeight.LIGHT, 40));
        judulDepan.setTextFill(Color.WHITE);
        judulDepan.setLayoutX(304);
        judulDepan.setLayoutY(81);
         
        judulDepan2.setFont(Font.font("Poppins", FontWeight.BOLD, 40));
        judulDepan2.setTextFill(Color.WHITE);
        judulDepan2.setLayoutX(545);
        judulDepan2.setLayoutY(81);
        
        judulDepan3.setFont(Font.font("Poppins", FontWeight.BOLD, 20));
        judulDepan3.setTextFill(Color.WHITE);
        judulDepan3.setLayoutX(150);
        judulDepan3.setLayoutY(210);
        
        judulDepan4.setFont(Font.font("Poppins", FontWeight.BOLD, 20));
        judulDepan4.setTextFill(Color.WHITE);
        judulDepan4.setLayoutX(150);
        judulDepan4.setLayoutY(310);
        
        judulDepan5.setFont(Font.font("Poppins", FontWeight.BOLD, 20));
        judulDepan5.setTextFill(Color.WHITE);
        judulDepan5.setLayoutX(150);
        judulDepan5.setLayoutY(410);
        
        judulDepan6.setFont(Font.font("Poppins", FontWeight.BOLD, 20));
        judulDepan6.setTextFill(Color.WHITE);
        judulDepan6.setLayoutX(150);
        judulDepan6.setLayoutY(510);
        
        list.setPrefSize(290, 130);
        list.setLayoutX(590);
        list.setLayoutY(410);
        
        // Setting Image
        ImageView image = new ImageView(new Image(getClass().getResourceAsStream("/View/logo2.png")));
        anchor.getChildren().add(image);
        image.setFitHeight(90);
        image.setFitWidth(90);
        image.setLayoutX(15);
        image.setLayoutY(60); 
        
        
        // Setting TextField
        tempatField.setPrefSize(300,33);
        tempatField.setPromptText("masukkan tempat pelaksanaan PKN");
        tempatField.setFont(Font.font("Poppins", FontWeight.SEMI_BOLD, 14));
        tempatField.setBackground(new Background(new BackgroundFill(Color.WHITE, new CornerRadii(5),Insets.EMPTY)));
        tempatField.setLayoutX(430);
        tempatField.setLayoutY(210);
        
        waktuField.setPrefSize(300, 33);
        waktuField.setPromptText("masukkan waktu pelaksanaan PKN");
        waktuField.setFont(Font.font("Poppins", FontWeight.SEMI_BOLD, 14));
        waktuField.setBackground(new Background(new BackgroundFill(Color.WHITE, new CornerRadii(5),Insets.EMPTY)));
        waktuField.setLayoutX(430);
        waktuField.setLayoutY(310);
        
        
        // Setting Button
        
        cvButton.setPrefSize(120, 30);
        cvButton.setLayoutX(430);
        cvButton.setLayoutY(410);
        cvButton.setFont(Font.font("Poppins", FontWeight.LIGHT, 13));
        cvButton.setTextFill(Color.GRAY);
        
        proposalButton.setPrefSize(120, 30);
        proposalButton.setLayoutX(430);
        proposalButton.setLayoutY(510);
        proposalButton.setFont(Font.font("Poppins", FontWeight.LIGHT, 13));
        proposalButton.setTextFill(Color.GRAY);
        
        simpanButton.setPrefSize(150, 33);
        simpanButton.setLayoutY(650);
        simpanButton.setLayoutX(550);
        simpanButton.setBackground(new Background(new BackgroundFill(Color.ORANGE, new CornerRadii(5),Insets.EMPTY)));
        simpanButton.setFont(Font.font("Poppins", FontWeight.BOLD, 13));
        simpanButton.setTextFill(Color.WHITE);
        
        backButton.setPrefSize(150, 33);
        backButton.setLayoutY(650);
        backButton.setLayoutX(360);
        backButton.setBackground(new Background(new BackgroundFill(Color.CORNFLOWERBLUE, new CornerRadii(5),Insets.EMPTY)));
        backButton.setFont(Font.font("Poppins", FontWeight.BOLD, 13));
        backButton.setTextFill(Color.WHITE);   
        
        // =============================================================================
        //                                  OPERATION
        // =============================================================================
    
        backButton.setOnMousePressed((MouseEvent event) -> {
            window.close();
            SebagaiMahasiswa sebagaimahasiswa = new SebagaiMahasiswa();
            sebagaimahasiswa.componentSebagaiMahasiswa();
        });
        

        cvButton.setOnMousePressed((MouseEvent event) -> {
            FileChooser fc = new FileChooser();
            fc.setInitialDirectory(new File("D:\\"));
            fc.getExtensionFilters().addAll(new ExtensionFilter("PDF Files", "*.pdf"));

            File selectedFile = fc.showOpenDialog(null);
            if(selectedFile != null){
                list.getItems().add(selectedFile.getAbsolutePath());
            }
            else{
                System.out.println("file is not valid");
            }
        });
        
        proposalButton.setOnMousePressed((MouseEvent event) -> {
            FileChooser fc = new FileChooser();
            fc.setInitialDirectory(new File("D:\\"));
            fc.getExtensionFilters().addAll(new ExtensionFilter("PDF Files", "*.pdf"));

            File selectedFile = fc.showOpenDialog(null);
            if(selectedFile != null){
                list.getItems().add(selectedFile.getAbsolutePath());
            }
            else{
                System.out.println("file is not valid");
            }
        });
        
        Scene scene = new Scene(anchor);
        
        Image icon = new Image("/View/logo2.png");
        window.getIcons().add(icon);
        window.setTitle("Program Pengajuan PKN");
        window.setScene(scene);
        window.show();
    }
}
