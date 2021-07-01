package View;

import java.io.File;
import java.io.IOException;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.Group;
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
import javafx.stage.Modality;
import javafx.stage.Stage;

public class PenjadwalanUjianAdmin{
    
    private AnchorPane anchor;
    private Pane bannerAtas;
    private Pane bannerBawah;
    private Label judulDepan;
    private Label judulDepan2;
    private Label info;
    private Button nilaiButton;
    private Button simpanButton;
    private Button backButton;
    private ListView list;
    private Label textSelamat;

    public void componentPenjadwalan(){
        Stage window = new Stage();
        window.initModality(Modality.APPLICATION_MODAL);
        
        // =============================================================================
        //                           DEKLARASI VARIABEL
        // =============================================================================
        
        anchor = new AnchorPane();
        bannerAtas = new Pane();
        bannerBawah = new Pane();
        judulDepan = new Label(" PENJADWALAN");
        judulDepan2 = new Label(" UJIAN");
        info = new Label(" NILAI PKN DARI PERUSAHAAN");
        nilaiButton = new Button("upload nilai");
        simpanButton = new Button("SAVE");
        backButton = new Button("BACK");
        list = new ListView();
        textSelamat = new Label("Nilai berhasil di upload");
        
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
        judulDepan.setLayoutX(320);
        judulDepan.setLayoutY(390);
         
        judulDepan2.setFont(Font.font("Poppins", FontWeight.BOLD, 40));
        judulDepan2.setTextFill(Color.WHITE);
        judulDepan2.setLayoutX(621);
        judulDepan2.setLayoutY(390);
        
        info.setFont(Font.font("Poppins", FontWeight.LIGHT, 20));
        info.setTextFill(Color.WHITE);
        info.setLayoutX(390);
        info.setLayoutY(450);
        
        list.setPrefSize(290, 55);
        list.setLayoutX(395);
        list.setLayoutY(535);
        
        //setting button
        nilaiButton.setPrefSize(120, 30);
        nilaiButton.setLayoutX(480);
        nilaiButton.setLayoutY(490);
        nilaiButton.setFont(Font.font("Poppins", FontWeight.LIGHT, 13));
        nilaiButton.setTextFill(Color.GRAY);
        
        simpanButton.setPrefSize(220, 33);
        simpanButton.setLayoutY(620);
        simpanButton.setLayoutX(429);
        simpanButton.setBackground(new Background(new BackgroundFill(Color.CORNFLOWERBLUE, new CornerRadii(5),Insets.EMPTY)));
        simpanButton.setFont(Font.font("Poppins", FontWeight.BOLD, 13));
        simpanButton.setTextFill(Color.WHITE);
        
        backButton.setPrefSize(220, 33);
        backButton.setLayoutY(670);
        backButton.setLayoutX(429);
        backButton.setBackground(new Background(new BackgroundFill(Color.ORANGE, new CornerRadii(5),Insets.EMPTY)));
        backButton.setFont(Font.font("Poppins", FontWeight.BOLD, 13));
        backButton.setTextFill(Color.WHITE);
        
        textSelamat.setFont(Font.font("Poppins", FontWeight.LIGHT, 15));
        textSelamat.setTextFill(Color.WHITE);
        textSelamat.setLayoutX(463);
        textSelamat.setLayoutY(715);
        textSelamat.setVisible(false);
        
        // =============================================================================
        //                                  OPERATION
        // =============================================================================
        
        nilaiButton.setOnMousePressed((MouseEvent event) -> {
            FileChooser fc = new FileChooser();
            fc.setInitialDirectory(new File("D:\\"));
            fc.getExtensionFilters().addAll(new FileChooser.ExtensionFilter("PDF Files", "*.pdf"));

            File selectedFile = fc.showOpenDialog(null);
            if(selectedFile != null){
                list.getItems().add(selectedFile.getAbsolutePath());
            }
            else{
                System.out.println("file is not valid");
            }
        });
        
        backButton.setOnMousePressed((MouseEvent event) -> {
            window.close();
            SebagaiAdmin admin = new SebagaiAdmin();
            admin.componentSebagaiAdmin();
        });
        
        simpanButton.setOnMousePressed((MouseEvent event) -> {
            textSelamat.setVisible(true);
        });
        
        // set background add image
        Image image2 = new Image("/View/umm_background2.png");
        ImageView mv = new ImageView(image2);

        Group root = new Group();
        root.getChildren().addAll(mv, bannerAtas, bannerBawah, judulDepan, judulDepan2, info, nilaiButton, backButton, simpanButton, list,
                textSelamat);

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
