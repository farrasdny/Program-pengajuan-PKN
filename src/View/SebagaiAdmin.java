package View;

import java.io.IOException;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
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

public class SebagaiAdmin{
    
    // variabel pane sebagai admin
    private AnchorPane anchor;
    private Pane bannerAtas;
    private Pane bannerBawah;
    private Label judulDepan;
    private Label judulDepan2;
    private Button approveButton;
    private Button jadwalUjianButton;
    private Button nilaiButton;
    private Button backButton;
    
    public void componentSebagaiAdmin(){
        Stage window = new Stage();
        window.initModality(Modality.APPLICATION_MODAL);
        
        // =============================================================================
        //                           DEKLARASI VARIABEL
        // =============================================================================
        
        anchor = new AnchorPane();
        bannerAtas = new Pane();
        bannerBawah = new Pane();
        judulDepan = new Label("SEBAGAI");
        judulDepan2 = new Label("ADMIN");
        approveButton = new Button("APPROVE");
        jadwalUjianButton = new Button ("PENJADWALAN UJIAN");
        nilaiButton = new Button("NILAI PKN");
        backButton = new Button("BACK");
        
        // =============================================================================
        //                          CONTROL PANE LOGIN ADMIN
        // =============================================================================
        
        anchor.setPrefSize(1100 , 800);
        anchor.setStyle("-fx-background-color: linear-gradient(#4C87EB, #242275);");
        anchor.getChildren().addAll(
                bannerAtas, bannerBawah, judulDepan, judulDepan2, approveButton, jadwalUjianButton, nilaiButton, backButton
        );
        
        bannerAtas.setBackground(new Background(new BackgroundFill(Color.WHITE, CornerRadii.EMPTY,Insets.EMPTY)));
        bannerAtas.setPrefSize(1100, 50);
        
        bannerBawah.setBackground(new Background(new BackgroundFill(Color.WHITE, CornerRadii.EMPTY,Insets.EMPTY)));
        bannerBawah.setPrefSize(1100, 50);
        bannerBawah.setLayoutY(750);
        
        judulDepan.setFont(Font.font("Poppins", FontWeight.LIGHT, 40));
        judulDepan.setTextFill(Color.WHITE);
        judulDepan.setLayoutX(390);
        judulDepan.setLayoutY(410);
         
        judulDepan2.setFont(Font.font("Poppins", FontWeight.BOLD, 40));
        judulDepan2.setTextFill(Color.WHITE);
        judulDepan2.setLayoutX(565);
        judulDepan2.setLayoutY(410);
        
        ImageView image = new ImageView(new Image(getClass().getResourceAsStream("/View/logo2.png")));
        anchor.getChildren().add(image);
        image.setFitHeight(280);
        image.setFitWidth(290);
        image.setLayoutX(400);
        image.setLayoutY(100);
        
        approveButton.setPrefSize(220, 33);
        approveButton.setLayoutY(490);
        approveButton.setLayoutX(437);
        approveButton.setBackground(new Background(new BackgroundFill(Color.ORANGE, new CornerRadii(5),Insets.EMPTY)));
        approveButton.setFont(Font.font("Poppins", FontWeight.BOLD, 13));
        approveButton.setTextFill(Color.WHITE);
        
        jadwalUjianButton.setPrefSize(220, 33);
        jadwalUjianButton.setLayoutY(540);
        jadwalUjianButton.setLayoutX(437);
        jadwalUjianButton.setBackground(new Background(new BackgroundFill(Color.ORANGE, new CornerRadii(5),Insets.EMPTY)));
        jadwalUjianButton.setFont(Font.font("Poppins", FontWeight.BOLD, 13));
        jadwalUjianButton.setTextFill(Color.WHITE);
        
        nilaiButton.setPrefSize(220, 33);
        nilaiButton.setLayoutY(590);
        nilaiButton.setLayoutX(437);
        nilaiButton.setBackground(new Background(new BackgroundFill(Color.ORANGE, new CornerRadii(5),Insets.EMPTY)));
        nilaiButton.setFont(Font.font("Poppins", FontWeight.BOLD, 13));
        nilaiButton.setTextFill(Color.WHITE);
        
        backButton.setPrefSize(220, 33);
        backButton.setLayoutY(640);
        backButton.setLayoutX(437);
        backButton.setBackground(new Background(new BackgroundFill(Color.CORNFLOWERBLUE, new CornerRadii(5),Insets.EMPTY)));
        backButton.setFont(Font.font("Poppins", FontWeight.BOLD, 13));
        backButton.setTextFill(Color.WHITE);
        
        // =============================================================================
        //                                  OPERATION
        // =============================================================================
        
        Scene scene = new Scene(anchor);
        window.setScene(scene);
        window.show();
        
        
        backButton.setOnMousePressed((MouseEvent event) -> {
            window.close();
            LoginAdmin loginadmin = new LoginAdmin();
            loginadmin.componentAdmin();
        });
    }
}
